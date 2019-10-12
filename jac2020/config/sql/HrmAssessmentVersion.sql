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
