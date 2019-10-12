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

