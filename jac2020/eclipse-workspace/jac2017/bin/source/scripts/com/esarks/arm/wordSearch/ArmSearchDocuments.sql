--  Generated at 2005.07.01 09:58:57.341 AM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE ArmSearchDocuments (
  protocol varchar(16) NOT NULL,
  url varchar(32) NOT NULL,
  id bigint identity (1, 1) NOT NULL);
CREATE UNIQUE CLUSTERED INDEX ArmSearchDocuments_ix1 ON ArmSearchDocuments (protocol, url)
CREATE UNIQUE INDEX ArmSearchDocuments_ix2 ON ArmSearchDocuments (id)
