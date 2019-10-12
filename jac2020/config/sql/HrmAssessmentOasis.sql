--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmAssessmentOasis (
  assessmentId bigint NOT NULL,
  oasisId int NOT NULL,
  CONSTRAINT HrmAssessmentOasis_pk PRIMARY KEY (assessmentId, oasisId),
  CONSTRAINT HrmAssessmentOasis_fk1 FOREIGN KEY (assessmentId) REFERENCES Hrm0711.iusr_hrm.HrmAssessment (id));
CREATE  INDEX HrmAssessmentOasis_ix1 ON HrmAssessmentOasis (oasisId)
