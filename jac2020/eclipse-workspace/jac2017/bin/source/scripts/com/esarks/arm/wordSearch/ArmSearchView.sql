--  Generated at 2005.07.01 09:58:57.341 AM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
CREATE VIEW ArmSearchView AS
SELECT
  ArmSearchDocuments.protocol,
  ArmSearchDocuments.url,
  ArmSearchDocuments.id armSearchDocumentsId,
  ArmSearchDocumentsWords.urlId,
  ArmSearchDocumentsWords.word
FROM
     Hrm0730.iusr_hrm.ArmSearchDocuments as ArmSearchDocuments JOIN Hrm0730.iusr_hrm.ArmSearchDocumentsWords as ArmSearchDocumentsWords ON ArmSearchDocuments.id=ArmSearchDocumentsWords.urlId

