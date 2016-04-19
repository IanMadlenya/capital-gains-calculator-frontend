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

import play.api.data._
import play.api.data.Forms._
import models._

object ImprovementsForm {

  def verify(data: ImprovementsModel): Option[ImprovementsModel] = {
    data.isClaimingImprovements match {
      case "Yes" =>
        if (data.improvementsAmt != None) {
          Option(ImprovementsModel(data.isClaimingImprovements, data.improvementsAmt))
        } else {
          None
        }
      case "No" => Option(ImprovementsModel(data.isClaimingImprovements, None))
    }
  }

  val improvementsForm = Form(
    mapping(
      "isClaimingImprovements" -> text,
      "improvementsAmt" -> optional(bigDecimal)
    )(ImprovementsModel.apply)(ImprovementsModel.unapply)
      .verifying(
        "Please provide a value for your improvements",
        improvementsForm => verify(ImprovementsModel(improvementsForm.isClaimingImprovements, improvementsForm.improvementsAmt)).isDefined)
  )
}