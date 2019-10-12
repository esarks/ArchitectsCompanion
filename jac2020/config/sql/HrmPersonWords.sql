--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmPersonWords (
  personId bigint NOT NULL,
  type varchar(8) NOT NULL,
  word varchar(24) NOT NULL,
  CONSTRAINT HrmPersonWords_pk PRIMARY KEY (personId, type, word),
  CONSTRAINT HrmPersonWords_fk1 FOREIGN KEY (personId) REFERENCES Hrm0711.iusr_hrm.HrmPerson (id));
CREATE  INDEX HrmPersonWords_ix1 ON HrmPersonWords (type, word)
