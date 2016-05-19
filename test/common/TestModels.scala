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

package common

import models._

object TestModels {

  val sumModelFlat = SummaryModel(
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(11100)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("No", None),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(None),
    DisposalCostsModel(None),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("flat"),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    None
  )

  val sumModelTA = SummaryModel(
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(11100)),
    OtherPropertiesModel("Yes", Some(2100)),
    Some(AnnualExemptAmountModel(9000)),
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(9)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("Yes", Some(500)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(650)),
    DisposalCostsModel(Some(850)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("time"),
    OtherReliefsModel(Some(2000)),
    OtherReliefsModel(Some(1000)),
    OtherReliefsModel(Some(500)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val sumModelRebased = SummaryModel(
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(11100)),
    OtherPropertiesModel("Yes", Some(2100)),
    Some(AnnualExemptAmountModel(9000)),
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(9)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("Yes", Some(500)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(650)),
    DisposalCostsModel(Some(850)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(2000)),
    OtherReliefsModel(Some(1000)),
    OtherReliefsModel(Some(500)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val calcModelTwoRates = CalculationResultModel(8000, 40000, 32000, 18, Some(8000), Some(28), None)
  val calcModelOneRate = CalculationResultModel(8000, 40000, 32000, 20, None, None, None)
  val calcModelLoss = CalculationResultModel(0, -10000, 0, 18, None, None, None)

  val summaryIndividualFlatLoss = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("Yes", Some(0)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(90000),
    AcquisitionCostsModel(Some(0)),
    DisposalCostsModel(Some(0)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(0)),
    CalculationElectionModel("flat"),
    OtherReliefsModel(Some(0)),
    OtherReliefsModel(Some(0)),
    OtherReliefsModel(Some(0)),
    None
  )

  val summaryIndividualFlatWithoutAEA = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("Yes", Some(8000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("flat"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    None
  )

  val summaryIndividualFlatWithAEA = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("Yes", Some(9600)),
    Some(AnnualExemptAmountModel(1500)),
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("No", None),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(None),
    DisposalCostsModel(None),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("flat"),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    None
  )

  val summaryTrusteeTAWithAEA = SummaryModel (
    CustomerTypeModel("trustee"),
    Some(DisabledTrusteeModel("No")),
    None,
    None,
    OtherPropertiesModel("Yes", Some(9600)),
    Some(AnnualExemptAmountModel(1500)),
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("No", None),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(None),
    DisposalCostsModel(None),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("time"),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryTrusteeTAWithoutAEA = SummaryModel (
    CustomerTypeModel("trustee"),
    Some(DisabledTrusteeModel("No")),
    None,
    None,
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("Yes", Some(8000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(None),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("time"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryDisabledTrusteeTAWithAEA = SummaryModel (
    CustomerTypeModel("trustee"),
    Some(DisabledTrusteeModel("Yes")),
    None,
    None,
    OtherPropertiesModel("Yes", Some(9600)),
    Some(AnnualExemptAmountModel(1500)),
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("No", None),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(None),
    DisposalCostsModel(None),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("time"),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryDisabledTrusteeTAWithoutAEA = SummaryModel (
    CustomerTypeModel("trustee"),
    Some(DisabledTrusteeModel("Yes")),
    None,
    None,
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("Yes", Some(8000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(None),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("time"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryRepresentativeFlatWithoutAEA = SummaryModel (
    CustomerTypeModel("personalRep"),
    None,
    None,
    None,
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("Yes", Some(8000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(None),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("flat"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    None
  )

  val summaryRepresentativeFlatWithAEA = SummaryModel (
    CustomerTypeModel("personalRep"),
    None,
    None,
    None,
    OtherPropertiesModel("Yes", Some(9600)),
    Some(AnnualExemptAmountModel(1500)),
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("No", None),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(None),
    DisposalCostsModel(None),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("flat"),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    None
  )

  val summaryIndividualAcqDateAfter = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(6), Some(6), Some(2016)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    None,
    ImprovementsModel("Yes", Some(8000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("flat"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualImprovementsNoRebasedModel = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    None,
    None,
    ImprovementsModel("Yes", Some(8000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("flat"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualImprovementsWithRebasedModel = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(1000))),
    None,
    ImprovementsModel("Yes", Some(8000), Some(1000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("flat"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualRebased = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(150000))),
    Some(RebasedCostsModel("Yes", Some(1000))),
    ImprovementsModel("Yes", Some(2000), Some(3000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualRebasedNoAcqDate = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(150000))),
    Some(RebasedCostsModel("Yes", Some(1000))),
    ImprovementsModel("Yes", Some(2000), Some(3000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualRebasedNoRebasedCosts = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(150000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", Some(2000), Some(3000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualRebasedNoAcqDateOrRebasedCosts = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(150000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", Some(2000), Some(3000)),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("No", None),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualRebasedNoImprovements = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(150000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("No", None, None),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualRebasedNoneImprovements = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(150000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualRebasedAcqDateAfter = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(2016)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(150000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2010),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("No", None, None))
  )

  val summaryIndividualPRRAcqDateAfterAndDisposalDateBefore = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(2016)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(150000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2018),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("Yes", Some(100), Some(50)))
  )

  val summaryIndividualPRRAcqDateAfterAndNoRebased = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(2012)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("No", None)),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2018),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("Yes", Some(100), Some(50)))
  )

  val summaryIndividualPRRAcqDateAfterAndDisposalDateAfter = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(2012)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(1000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2018),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("Yes", Some(100), Some(50)))
  )

  val summaryIndividualPRRAcqDateAfterAndDisposalDateBeforeWithRebased = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(2012)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(1000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2015),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("Yes", Some(100), Some(50)))
  )

  val summaryIndividualPRRNoAcqDateAndDisposalDateAfterWithRebased = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("No", None, None, None),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(1000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2018),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("Yes", Some(100), Some(50)))
  )

  val summaryIndividualPRRAcqDateAfterAndDisposalDateAfterWithRebased = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(2016)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(1000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2018),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("Yes", Some(100), Some(50)))
  )

  val summaryIndividualPRRAcqDateBeforeAndDisposalDateAfterWithRebased = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(2012)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(1000))),
    Some(RebasedCostsModel("No", None)),
    ImprovementsModel("Yes", None, None),
    DisposalDateModel(10, 10, 2018),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("rebased"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(None),
    Some(PrivateResidenceReliefModel("Yes", Some(100), Some(50)))
  )

  val summaryIndividualWithAllOptions = SummaryModel (
    CustomerTypeModel("individual"),
    None,
    Some(CurrentIncomeModel(1000)),
    Some(PersonalAllowanceModel(9000)),
    OtherPropertiesModel("No", None),
    None,
    AcquisitionDateModel("Yes", Some(9), Some(9), Some(1999)),
    AcquisitionValueModel(100000),
    Some(RebasedValueModel("Yes", Some(1000))),
    Some(RebasedCostsModel("Yes", Some(500))),
    ImprovementsModel("Yes", Some(8000)),
    DisposalDateModel(10, 10, 2018),
    DisposalValueModel(150000),
    AcquisitionCostsModel(Some(300)),
    DisposalCostsModel(Some(600)),
    EntrepreneursReliefModel("No"),
    AllowableLossesModel("Yes", Some(50000)),
    CalculationElectionModel("flat"),
    OtherReliefsModel(Some(999)),
    OtherReliefsModel(Some(888)),
    OtherReliefsModel(Some(777)),
    Some(PrivateResidenceReliefModel("Yes", Some(100), Some(50)))
  )

}
