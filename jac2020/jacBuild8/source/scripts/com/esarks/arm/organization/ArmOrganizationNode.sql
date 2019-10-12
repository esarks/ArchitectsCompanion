--  Generated at 2005.12.11 03:04:33.312 PM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE ArmOrganizationNode (
  id bigint identity (1, 1) NOT NULL,
  parent bigint,
  name varchar(64) NOT NULL,
  CONSTRAINT ArmOrganizationNode_pk PRIMARY KEY (id),
  CONSTRAINT ArmOrganizationNode_fk1 FOREIGN KEY (parent) REFERENCES ArmOrganizationNode (id));
