--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmEpisode (
  id bigint identity (1, 1) NOT NULL,
  patientId bigint NOT NULL,
  m0030_start_care_dt varchar(8) NOT NULL,
  CONSTRAINT HrmEpisode_pk PRIMARY KEY (id),
  CONSTRAINT HrmEpisode_fk1 FOREIGN KEY (patientId) REFERENCES Hrm0711.iusr_hrm.HrmPatient (id));
CREATE  INDEX HrmEpisode_ix1 ON HrmEpisode (patientId, m0030_start_care_dt)
