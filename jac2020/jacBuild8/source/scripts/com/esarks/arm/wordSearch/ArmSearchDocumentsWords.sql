--  Generated at 2005.07.01 09:58:57.341 AM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE TABLE ArmSearchDocumentsWords (
  urlId bigint NOT NULL,
  word varchar(32) NOT NULL,
  CONSTRAINT ArmSearchDocumentsWords_fk1 FOREIGN KEY (urlId) REFERENCES Hrm0730.iusr_hrm.ArmSearchDocuments (id));
CREATE UNIQUE CLUSTERED INDEX ArmSearchDocumentsWords_ix1 ON ArmSearchDocumentsWords (urlId, word)
CREATE  INDEX ArmSearchDocumentsWords_ix2 ON ArmSearchDocumentsWords (word)
