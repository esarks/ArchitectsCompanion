--  Generated at 2005.07.13 01:50:30.968 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE HrmProcessList (
  id int,
  logTimeStamp datetime NOT NULL,
  modifyDate datetime NOT NULL,
  CONSTRAINT HrmProcessList_pk PRIMARY KEY (id, modifyDate));
