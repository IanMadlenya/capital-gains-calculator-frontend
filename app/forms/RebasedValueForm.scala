/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package forms

import common.Validation._
import models._
import play.api.data.Forms._
import play.api.data._
import play.api.i18n.Messages

object RebasedValueForm {

  def verifyAmountSupplied(data: RebasedValueModel): Boolean = {
    data.hasRebasedValue match {
      case "Yes" => data.rebasedValueAmt.isDefined
      case "No" => true
    }
  }

  def verifyPositive(data: RebasedValueModel): Boolean = {
    data.hasRebasedValue match {
      case "Yes" => isPositive(data.rebasedValueAmt.getOrElse(0))
      case "No" => true
    }
  }

  def verifyTwoDecimalPlaces(data: RebasedValueModel): Boolean = {
    data.hasRebasedValue match {
      case "Yes" => isMaxTwoDecimalPlaces(data.rebasedValueAmt.getOrElse(0))
      case "No" => true
    }
  }

  val rebasedValueForm = Form(
    mapping(
      "hasRebasedValue" -> text,
      "rebasedValueAmt" -> optional(bigDecimal)
    )(RebasedValueModel.apply)(RebasedValueModel.unapply)
      .verifying(Messages("calc.rebasedValue.error.no.value.supplied"),
        rebasedValueForm => verifyAmountSupplied(rebasedValueForm))
      .verifying(Messages("calc.rebasedValue.errorNegative"),
        rebasedValueForm => verifyPositive(rebasedValueForm))
      .verifying(Messages("calc.rebasedValue.errorDecimalPlaces"),
        rebasedValueForm => verifyTwoDecimalPlaces(rebasedValueForm))
  )
}