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
