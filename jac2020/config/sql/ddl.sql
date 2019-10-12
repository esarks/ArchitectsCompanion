CREATE FUNCTION hrmConcatName (@lastName varchar(64), @firstName varchar(64), @middleName varchar(64), @suffixName varchar(64)) RETURNS varchar(128)

AS

BEGIN
  DECLARE @fullName varchar(128)
  IF @lastName is not null SET @fullName = RTRIM(@lastName)
  IF @firstName is not null SET @fullName = RTRIM(@fullName + ', ' + @firstName)
  IF @middleName is not null SET @fullName = RTRIM(@fullName + ' ' + @middleName)
  IF @suffixName is not null SET @fullName = RTRIM(@fullName + ' ' + @suffixName)
  RETURN @fullName
END
GO 
CREATE FUNCTION hrmGetEthnicityType (@personId bigint, @ethnicityType varchar(2)) RETURNS bit

AS

BEGIN
  DECLARE @result bit
  SELECT @ethnicityType = (SELECT ethnicityType FROM hrmPersonEthnicity WHERE id=@personId AND ethnicityType=@ethnicityType)
  IF @ethnicityType is null SET @result = 0 ELSE SET @result = 1
  RETURN @result
END
GO 
CREATE FUNCTION hrmGetPersonNumberValue (@personId bigint, @personNumberType varchar(2)) RETURNS varchar(32)

AS

BEGIN
  DECLARE @personNumber varchar(32)
  SELECT @personNumber = (SELECT personNumber FROM hrmPersonNumber WHERE id=@personId AND personNumberType=@personNumberType AND invalid is null)
  RETURN @personNumber
END
GO 
CREATE FUNCTION hrmGetTypeName (@groupName varchar(32), @typeCode varchar(16)) RETURNS varchar(64)

AS

BEGIN
  DECLARE @typeName varchar(64)
  SELECT @typeName = (SELECT typeName FROM hrmTypeTranslation WHERE groupName=@groupName AND typeCode=@typeCode)
  RETURN @typeName
END

GO 
CREATE FUNCTION hrmRfaSort (@m0100 varchar(2), @m0030 varchar(8), @m0032 varchar(8), @m0090 varchar(8), @m0906 varchar(8)) RETURNS varchar(10)

AS

BEGIN
  DECLARE @returnSort varchar(9)
  if @m0100 = '01' SET @returnSort = @m0030 + '1'
  if @m0100 = '03' SET @returnSort = @m0032 + '5'
  if @m0100 = '04' SET @returnSort = @m0090 + '3'
  if @m0100 = '05' SET @returnSort = @m0090 + '3'
  if @m0100 = '06' SET @returnSort = @m0906 + '4'
  if @m0100 = '07' SET @returnSort = @m0906 + '6'
  if @m0100 = '08' SET @returnSort = @m0906 + '6'
  if @m0100 = '09' SET @returnSort = @m0906 + '6'
  RETURN @returnSort
END
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmPerson (
  id bigint identity (1, 1) NOT NULL,
  domain bigint,
  lastName varchar(64),
  firstName varchar(64),
  middleInitial varchar(64),
  suffix varchar(4),
  genderType varchar(1),
  dob datetime,
  CONSTRAINT HrmPerson_pk PRIMARY KEY (id));
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmPatient (
  id bigint NOT NULL,
  CONSTRAINT HrmPatient_pk PRIMARY KEY (id),
  CONSTRAINT HrmPatient_fk1 FOREIGN KEY (id) REFERENCES Hrm0711.iusr_hrm.HrmPerson (id));
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmEpisode (
  id bigint identity (1, 1) NOT NULL,
  patientId bigint NOT NULL,
  m0030_start_care_dt varchar(8) NOT NULL,
  CONSTRAINT HrmEpisode_pk PRIMARY KEY (id),
  CONSTRAINT HrmEpisode_fk1 FOREIGN KEY (patientId) REFERENCES Hrm0711.iusr_hrm.HrmPatient (id));
CREATE  INDEX HrmEpisode_ix1 ON HrmEpisode (patientId, m0030_start_care_dt)
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmAssessment (
  id bigint identity (1, 1) NOT NULL,
  episodeId bigint NOT NULL,
  m0090_info_completed_dt varchar(8) NOT NULL,
  m0100_assmt_reason varchar(2) NOT NULL,
  CONSTRAINT HrmAssessment_pk PRIMARY KEY (id),
  CONSTRAINT HrmAssessment_fk1 FOREIGN KEY (episodeId) REFERENCES Hrm0711.iusr_hrm.HrmEpisode (id));
CREATE  INDEX HrmAssessment_ix1 ON HrmAssessment (episodeId, m0090_info_completed_dt, m0100_assmt_reason)
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmAssessmentOasis (
  assessmentId bigint NOT NULL,
  oasisId int NOT NULL,
  CONSTRAINT HrmAssessmentOasis_pk PRIMARY KEY (assessmentId, oasisId),
  CONSTRAINT HrmAssessmentOasis_fk1 FOREIGN KEY (assessmentId) REFERENCES Hrm0711.iusr_hrm.HrmAssessment (id));
CREATE  INDEX HrmAssessmentOasis_ix1 ON HrmAssessmentOasis (oasisId)
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmAssessmentVersion (
  id bigint identity (1, 1) NOT NULL,
  assessmentId bigint NOT NULL,
  versionDate datetime NOT NULL,
  versionSource varchar(1),
  id_number int,
  effectiveDate varchar(8) NOT NULL,
  collatingSeq varchar(1),
  CONSTRAINT HrmAssessmentVersion_pk PRIMARY KEY (id),
  CONSTRAINT HrmAssessmentVersion_fk1 FOREIGN KEY (assessmentId) REFERENCES Hrm0711.iusr_hrm.HrmAssessment (id));
CREATE  INDEX HrmAssessmentVersion_ix1 ON HrmAssessmentVersion (assessmentId)
CREATE  INDEX HrmAssessmentVersion_ix2 ON HrmAssessmentVersion (id_number)
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmPersonWords (
  personId bigint NOT NULL,
  type varchar(8) NOT NULL,
  word varchar(24) NOT NULL,
  CONSTRAINT HrmPersonWords_pk PRIMARY KEY (personId, type, word),
  CONSTRAINT HrmPersonWords_fk1 FOREIGN KEY (personId) REFERENCES Hrm0711.iusr_hrm.HrmPerson (id));
CREATE  INDEX HrmPersonWords_ix1 ON HrmPersonWords (type, word)
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmProcessList (
  id int,
  logTimeStamp datetime NOT NULL,
  modifyDate datetime NOT NULL,
  CONSTRAINT HrmProcessList_pk PRIMARY KEY (id, modifyDate));
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE VIEW HrmIndexOasisView AS
SELECT
  A.id_number,
  A.is_active,
  A.agency_id,
  A.branch_id,
  A.rec_id,
  A.mask_version_cd,
  A.m0020_pat_id,
  A.m0030_start_care_dt,
  A.m0032_roc_dt,
  A.m0040_pat_fname,
  A.m0040_pat_mi,
  A.m0040_pat_lname,
  A.m0040_pat_suffix,
  A.m0050_pat_st,
  A.m0060_pat_zip,
  A.m0063_medicare_num,
  A.m0063_medicare_na,
  A.m0064_ssn,
  A.m0064_ssn_uk,
  A.m0065_medicaid_num,
  A.m0065_medicaid_na,
  A.m0066_pat_birth_dt,
  A.m0069_pat_gender,
  A.m0090_info_completed_dt,
  A.m0100_assmt_reason,
  A.m0906_dc_tran_dth_dt,
  A.modify_date,
  B.id,
  B.logTimeStamp,
  B.modifyDate
FROM Iccrep.dbo.oasis as A JOIN Iccrep.dbo.hrmProcessList as B ON A.id_number=B.id
GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE VIEW HrmOasisAssessmentView AS
SELECT
  HrmPerson.id personId,
  HrmPerson.firstName,
  HrmPerson.lastName,
  HrmPerson.middleInitial,
  HrmPerson.suffix,
  HrmPerson.genderType,
  HrmPerson.dob,
  HrmEpisode.id episodeId,
  HrmEpisode.m0030_start_care_dt,
  HrmAssessment.id assessmentId,
  HrmAssessmentVersion.id assessmentVersionId,
  HrmAssessmentVersion.versionDate,
  HrmAssessmentVersion.id_number,
  HrmAssessmentVersion.effectiveDate,
  HrmAssessmentVersion.collatingSeq
FROM
     Hrm0711.iusr_hrm.hrmPerson as hrmPerson JOIN Hrm0711.iusr_hrm.hrmPatient as hrmPatient ON hrmPerson.id=hrmPatient.id
     JOIN Hrm0711.iusr_hrm.hrmEpisode as hrmEpisode on hrmPatient.id=hrmEpisode.patientId
     JOIN Hrm0711.iusr_hrm.hrmAssessment as hrmAssessment on hrmAssessment.episodeId=hrmEpisode.id
     JOIN Hrm0711.iusr_hrm.hrmAssessmentVersion as hrmAssessmentVersion on hrmAssessmentVersion.assessmentId=hrmAssessment.id

GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE VIEW HrmDashView AS
SELECT
  HrmPerson.id,
  HrmPerson.lastName,
  HrmPerson.firstName,
  HrmPerson.middleInitial,
  HrmPerson.suffix,
  Hrm0711.iusr_hrm.hrmConcatName(HrmPerson.lastName, HrmPerson.firstName, HrmPerson.middleInitial, HrmPerson.suffix) patientName,
  HrmEpisode.m0030_start_care_dt m0030,
  HrmAssessment.episodeId,
  HrmAssessment.m0090_info_completed_dt m0090,
  HrmAssessment.m0100_assmt_reason m0100,
  HrmAssessmentVersion.assessmentId,
  HrmAssessmentVersion.versionDate,
  HrmAssessmentVersion.versionSource,
  HrmAssessmentVersion.effectiveDate,
  HrmAssessmentVersion.collatingSeq,
  Oasis.id_number,
  Oasis.agency_id,
  Oasis.branch_id,
  Oasis.import_date recdDate,
  Oasis.modify_date modifyDate,
  Oasis.lock_date lockDate,
  Oasis.patient_id patientId,
  Oasis.is_active,
  Oasis.status,
  Oasis.rec_id recId,
  Oasis.rec_type,
  Oasis.m0040_pat_fname,
  Oasis.m0040_pat_mi,
  Oasis.m0040_pat_lname,
  Oasis.m0040_pat_suffix,
  Oasis.m0020_pat_id m0020,
  Oasis.m0032_roc_dt m0032,
  Oasis.m0063_medicare_num medicare_number,
  Oasis.m0064_ssn ssn,
  Oasis.m0065_medicaid_num medicaid_number,
  Oasis.m0066_pat_birth_dt m0066,
  Oasis.m0069_pat_gender,
  Oasis.m0072_physician_id m0072,
  Oasis.m0150_cpay_none m0150_0,
  Oasis.m0150_cpay_mcare_ffs m0150_1,
  Oasis.m0150_cpay_mcare_hmo m0150_2,
  Oasis.m0150_cpay_mcaid_ffs m0150_3,
  Oasis.m0150_cpay_mcaid_hmo m0150_4,
  Oasis.m0150_cpay_wrkcomp m0150_5,
  Oasis.m0150_cpay_titlepgms m0150_6,
  Oasis.m0150_cpay_oth_govt m0150_7,
  Oasis.m0150_cpay_priv_ins m0150_8,
  Oasis.m0150_cpay_priv_hmo m0150_9,
  Oasis.m0150_cpay_selfpay m0150_10,
  Oasis.m0150_cpay_other m0150_11,
  Oasis.m0150_cpay_unknown m0150_12,
  Oasis.m0230_primary_diag_icd m0230,
  Oasis.m0240_oth_diag1_icd m0240_1,
  Oasis.m0240_oth_diag2_icd m0240_2,
  Oasis.m0240_oth_diag3_icd m0240_3,
  Oasis.m0240_oth_diag4_icd m0240_4,
  Oasis.m0240_oth_diag5_icd m0240_5,
  Oasis.m0245_pmt_icd1 m0245_1,
  Oasis.m0245_pmt_icd2 m0245_2,
  Oasis.m0270_rehab_prognosis m0270,
  Oasis.m0280_life_expectancy m0280,
  Oasis.m0300_curr_residence m0300,
  Oasis.m0350_ap_hm_resident m0350_02,
  Oasis.m0350_ap_pd_help m0350_03,
  Oasis.m0420_freq_pain m0420,
  Oasis.m0440_lesion_open_wnd m0440,
  Oasis.m0445_press_ulcer m0445,
  Oasis.m0450_nbr_prsulc_stg1 m0450_01,
  Oasis.m0450_nbr_prsulc_stg2 m0450_02,
  Oasis.m0450_nbr_prsulc_stg3 m0450_03,
  Oasis.m0450_nbr_prsulc_stg4 m0450_04,
  Oasis.m0445_press_ulcer m0450_any_ulcers,
  Oasis.m0460_stg_prblm_ulcer m0460,
  Oasis.m0484_nbr_surgwnd m0484,
  Oasis.m0488_stat_prb_surgwnd m0488,
  Oasis.m0490_when_dyspneic m0490,
  Oasis.m0510_uti m0510,
  Oasis.m0520_ur_incont m0520,
  Oasis.m0570_when_confused m0570,
  Oasis.m0610_bd_mem_deficit m0610_01,
  Oasis.m0610_bd_imp_decisn m0610_02,
  Oasis.m0610_bd_verbal m0610_03,
  Oasis.m0610_bd_physical m0610_04,
  Oasis.m0610_bd_soc_inappro m0610_05,
  Oasis.m0610_bd_delusions m0610_06,
  Oasis.m0610_bd_none m0610_07,
  Oasis.m0640_cur_grooming m0640,
  Oasis.m0650_cur_dress_upper m0650,
  Oasis.m0660_cur_dress_lower m0660,
  Oasis.m0670_cur_bathing m0670,
  Oasis.m0680_cur_toileting m0680,
  Oasis.m0690_cur_transferring m0690,
  Oasis.m0700_cur_ambulation m0700,
  Oasis.m0780_cur_oral_meds m0780,
  Oasis.m0790_cur_inhal_meds m0790,
  Oasis.m0800_cur_inject_meds m0800,
  Oasis.m0830_ec_none m0830_01,
  Oasis.m0830_ec_unknown m0830_05,
  Oasis.m0840_ecr_medication m0840_01,
  Oasis.m0840_ecr_injury m0840_03,
  Oasis.m0840_ecr_wound m0840_05,
  Oasis.m0840_ecr_hypoglyc m0840_07,
  Oasis.m0840_ecr_unknown m0840_10,
  Oasis.m0855_inpat_facility m0855,
  Oasis.m0870_dschg_disp m0870,
  Oasis.m0880_afdc_no_assist m0880_01,
  Oasis.m0880_afdc_fam_assist m0880_02,
  Oasis.m0880_afdc_oth_assist m0880_03,
  Oasis.m0890_hosp_rsn m0890,
  Oasis.m0895_hosp_med m0895,
  Oasis.m0895_hosp_injury m0895_med,
  Oasis.m0895_hosp_resp m0895_resp,
  Oasis.m0895_hosp_wound m0895_wound,
  Oasis.m0895_hosp_hypoglyc m0895_hosp_hypoglyc,
  Oasis.m0895_hosp_gi_bleed m0895_hosp_gi_bleed,
  Oasis.m0895_hosp_cf_fluids m0895_cf_fluids,
  Oasis.m0895_hosp_stroke m0895_stroke,
  Oasis.m0895_hosp_chemo m0895_chemo,
  Oasis.m0895_hosp_surgery m0895_hosp_surgery,
  Oasis.m0895_hosp_ur_tract m0895_ur_tract,
  Oasis.m0895_hosp_ivcath_inf m0895_ivcath_inf,
  Oasis.m0895_hosp_vein_pulm m0895_vein_pulm,
  Oasis.m0895_hosp_pain m0895_pain,
  Oasis.m0895_hosp_psychotic m0895_psychotic,
  Oasis.m0895_hosp_other m0895_other,
  Oasis.m0900_nh_therapy m0900_01,
  Oasis.m0900_nh_respite m0900_02,
  Oasis.m0900_nh_hospice m0900_03,
  Oasis.m0900_nh_permanent m0900_04,
  Oasis.m0900_nh_unsafe_home m0900_05,
  Oasis.m0900_nh_other m0900_06,
  Oasis.m0900_nh_unknown m0900_07,
  Oasis.m0903_last_home_visit m0903,
  Oasis.m0906_dc_tran_dth_dt m0906,
  Oasisr.inactivate,
  Oasisr.casemixweight,
  Oasisr.hhrg,
  F485v2.assessorname,
  F485v2.act_reimburse_rate_tot,
  F485v2.reimburse_rate_tot,
  F485v2.act_prof_loss,
  F485v2.prof_loss,
  F485v2.act_cost,
  F485v2.cost,
  F485v2.act_disciplin_total_visits,
  F485v2.disciplin_total_visits,
  F485v2.discharge_dt,
  F485v2.discharge_reason,
  F485v2.discharge_reason_other,
  F485v2.f485cert_prd_to_3,
  F485v2.f485mailed_to_phys_date,
  F485v2.f485date_hha_received,
  F485v2.phys_name,
  F485v2.phys_ph,
  F485v2.phys_off_contact
FROM
     Hrm0711.iusr_hrm.hrmPerson as hrmPerson JOIN Hrm0711.iusr_hrm.hrmPatient as hrmPatient ON hrmPerson.id=hrmPatient.id
     JOIN Hrm0711.iusr_hrm.hrmEpisode as hrmEpisode on hrmPatient.id=hrmEpisode.patientId
     JOIN Hrm0711.iusr_hrm.hrmAssessment as hrmAssessment on hrmAssessment.episodeId=hrmEpisode.id
     JOIN Hrm0711.iusr_hrm.hrmAssessmentVersion as hrmAssessmentVersion on hrmAssessmentVersion.assessmentId=hrmAssessment.id
     JOIN Iccrep.dbo.oasis as oasis on oasis.id_number=hrmAssessmentVersion.id_number
     LEFT JOIN Iccrep.dbo.oasisr as oasisr on oasisr.oasis_id_number=oasis.id_number
     LEFT JOIN Iccrep.dbo.f485v2 as f485v2 on f485v2.oasis_id_number=oasis.id_number
     WHERE hrmAssessmentVersion.versionSource='O'

GO 
--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE VIEW HrmDashView2 AS
SELECT
  HrmPerson.id,
  HrmPerson.lastName,
  HrmPerson.firstName,
  HrmPerson.middleInitial,
  HrmPerson.suffix,
  Hrm0711.iusr_hrm.hrmConcatName(HrmPerson.lastName, HrmPerson.firstName, '', HrmPerson.suffix) patientName,
  HrmEpisode.m0030_start_care_dt m0030,
  HrmAssessment.episodeId,
  HrmAssessment.m0090_info_completed_dt m0090,
  HrmAssessment.m0100_assmt_reason m0100,
  HrmAssessmentVersion.assessmentId,
  HrmAssessmentVersion.versionDate,
  HrmAssessmentVersion.versionSource,
  Oasis.id_number,
  Oasis.agency_id,
  Oasis.branch_id,
  Oasis.import_date recdDate,
  Oasis.patient_id patientId,
  Oasis.lock_date lockDate,
  Oasis.is_active,
  Oasis.status,
  Oasis.rec_id recId,
  Oasis.rec_type,
  Oasis.m0040_pat_fname,
  Oasis.m0040_pat_mi,
  Oasis.m0040_pat_lname,
  Oasis.m0040_pat_suffix,
  Oasis.m0020_pat_id m0020,
  Oasis.m0032_roc_dt m0032,
  Oasis.m0906_dc_tran_dth_dt m0906,
  Oasis.m0855_inpat_facility m0855
FROM
     Hrm0711.iusr_hrm.hrmPerson as hrmPerson JOIN Hrm0711.iusr_hrm.hrmPatient as hrmPatient ON hrmPerson.id=hrmPatient.id
     JOIN Hrm0711.iusr_hrm.hrmEpisode as hrmEpisode on hrmPatient.id=hrmEpisode.patientId
     JOIN Hrm0711.iusr_hrm.hrmAssessment as hrmAssessment on hrmAssessment.episodeId=hrmEpisode.id
     JOIN Hrm0711.iusr_hrm.hrmAssessmentVersion as hrmAssessmentVersion on hrmAssessmentVersion.assessmentId=hrmAssessment.id
     JOIN Iccrep.dbo.oasis as oasis on oasis.id_number=hrmAssessmentVersion.id_number
     WHERE hrmAssessmentVersion.versionSource='O'

GO 
