--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmPatient (
  id bigint NOT NULL,
  CONSTRAINT HrmPatient_pk PRIMARY KEY (id),
  CONSTRAINT HrmPatient_fk1 FOREIGN KEY (id) REFERENCES Hrm0711.iusr_hrm.HrmPerson (id));
