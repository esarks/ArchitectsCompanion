--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmAssessment (
  id bigint identity (1, 1) NOT NULL,
  episodeId bigint NOT NULL,
  m0090_info_completed_dt varchar(8) NOT NULL,
  m0100_assmt_reason varchar(2) NOT NULL,
  CONSTRAINT HrmAssessment_pk PRIMARY KEY (id),
  CONSTRAINT HrmAssessment_fk1 FOREIGN KEY (episodeId) REFERENCES Hrm0711.iusr_hrm.HrmEpisode (id));
CREATE  INDEX HrmAssessment_ix1 ON HrmAssessment (episodeId, m0090_info_completed_dt, m0100_assmt_reason)
