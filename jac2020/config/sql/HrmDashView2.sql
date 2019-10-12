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

