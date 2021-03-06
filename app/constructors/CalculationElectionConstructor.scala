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

package constructors

import common.Dates
import connectors.CalculatorConnector
import controllers.{routes, CalculationController}
import models.{CalculationResultModel, SummaryModel}
import play.api.i18n.Messages
import uk.gov.hmrc.play.http.HeaderCarrier
import scala.concurrent.ExecutionContext.Implicits.global

import scala.concurrent.Future

object CalculationElectionConstructor extends CalculationElectionConstructor {
  val calcConnector = CalculatorConnector
}

trait CalculationElectionConstructor {

  val calcConnector: CalculatorConnector

  //scalastyle:off
  def generateElection(summary: SummaryModel, hc: HeaderCarrier, flatResult: Option[CalculationResultModel], timeResult: Option[CalculationResultModel], rebasedResult: Option[CalculationResultModel]): Seq[(String, String, String, Option[String], String)]= {
    summary.acquisitionDateModel.hasAcquisitionDate match {
      case "Yes" if Dates.dateAfterStart(summary.acquisitionDateModel.day.get,
        summary.acquisitionDateModel.month.get, summary.acquisitionDateModel.year.get) => {
        Seq(("flat", flatResult.get.taxOwed.setScale(2).toString(),
          Messages("calc.calculationElection.message.flat"),
          None,
          routes.CalculationController.otherReliefs().toString()))
      }
      case "Yes" if !Dates.dateAfterStart(summary.acquisitionDateModel.day.get,
        summary.acquisitionDateModel.month.get,
        summary.acquisitionDateModel.year.get) => {

        if (summary.rebasedValueModel.get.hasRebasedValue.equals("Yes")) {
          Seq(
            ("flat", flatResult.get.taxOwed.setScale(2).toString(),
              Messages("calc.calculationElection.message.flat"),
              None,
              routes.CalculationController.otherReliefs().toString()),
            ("time", timeResult.get.taxOwed.setScale(2).toString(),
              Messages("calc.calculationElection.message.time"),
              Some(Messages("calc.calculationElection.message.timeDate")),
              routes.CalculationController.otherReliefsTA().toString()),
            ("rebased", rebasedResult.get.taxOwed.setScale(2).toString(),
              Messages("calc.calculationElection.message.rebased"),
              Some(Messages("calc.calculationElection.message.rebasedDate")),
              routes.CalculationController.otherReliefsRebased().toString())
          )
        }
        else {
          Seq(
            ("flat", flatResult.get.taxOwed.setScale(2).toString(),
              Messages("calc.calculationElection.message.flat"),
              None,
              routes.CalculationController.otherReliefs().toString()),
            ("time", timeResult.get.taxOwed.setScale(2).toString(),
              Messages("calc.calculationElection.message.time"),
              Some(Messages("calc.calculationElection.message.timeDate")),
              routes.CalculationController.otherReliefsTA().toString())
          )
        }
      }
      case "No" => {
        if (summary.rebasedValueModel.get.hasRebasedValue.equals("Yes")) {
          Seq(
            ("flat", flatResult.get.taxOwed.setScale(2).toString(),
              Messages("calc.calculationElection.message.flat"),
              None,
              routes.CalculationController.otherReliefs().toString()),
            ("rebased", rebasedResult.get.taxOwed.setScale(2).toString(),
              Messages("calc.calculationElection.message.rebased"),
              Some(Messages("calc.calculationElection.message.rebasedDate")),
              routes.CalculationController.otherReliefsRebased().toString())
          )
        }
        else {
          Seq(("flat", flatResult.get.taxOwed.setScale(2).toString(), Messages("calc.calculationElection.message.flat"),
            None, routes.CalculationController.otherReliefs().toString())
          )
        }
      }
    }
  }
}
