DROP TABLE qstnResponse;
DROP TABLE qstnVersion;
DROP TABLE qstn;
DROP TABLE stdGroupQuest;
DROP TABLE stdGroup;
DROP TABLE stdResponse;
DROP TABLE stdQuest;
DROP TABLE stdQstnrVersion;
DROP TABLE stdQstnr;

CREATE TABLE stdQstnr(
  qstnrCode                 varchar2(16) NOT NULL,
  title                     varchar2(64),
  CONSTRAINT stdQstnr_pk PRIMARY KEY (qstnrCode)
  );

CREATE TABLE stdQstnrVersion(
  qstnrCode                 varchar2(16) NOT NULL,
  qstnrSequence             number(5,0) NOT NULL,
  description               varchar2(64),
  CONSTRAINT stdQstnrVersion_pk PRIMARY KEY (qstnrCode, qstnrSequence),
  CONSTRAINT stdQstnrVersion_fk1 FOREIGN KEY (qstnrCode) REFERENCES stdQstnr (qstnrCode)
  );

CREATE TABLE stdQuest(
  qstnrCode                 varchar2(16) NOT NULL,
  questCode                 varchar2(16) NOT NULL,
  questSequence             number(5,0) NOT NULL,
  questSequenceOut          number(5,0),
  questText                 varchar2(4000),
  CONSTRAINT stdQuest_pk PRIMARY KEY (qstnrCode, questCode, questSequence),
  CONSTRAINT stdQuest_fk1 FOREIGN KEY (qstnrCode, questSequence) REFERENCES stdQstnrVersion (qstnrCode, qstnrSequence)
  );

CREATE TABLE stdResponse(
  qstnrCode                 varchar2(16) NOT NULL,
  questCode                 varchar2(16) NOT NULL,
  responseCode              varchar2(16) NOT NULL,
  responseSequence          number(5,0) NOT NULL,
  responseSequenceOut       number(5,0),
  responseOrder             number(5,0),
  responseText              varchar2(4000),
  CONSTRAINT stdResponse_pk PRIMARY KEY (qstnrCode, questCode, responseCode, responseSequence),
  CONSTRAINT stdResponse_fk1 FOREIGN KEY (qstnrCode, questCode, responseSequence) REFERENCES stdQuest (qstnrCode, questCode, questSequence)
  );

CREATE TABLE stdGroup(
  qstnrCode                 varchar2(16) NOT NULL,
  groupCode                 varchar2(16) NOT NULL,
  groupSequence             number(5,0) NOT NULL,
  groupSequenceOut          number(5,0),
  groupParentCode           varchar2(15),
  groupOrder                number(5,0),
  groupText                 varchar2(4000),
  CONSTRAINT stdGroup_pk PRIMARY KEY (qstnrCode, groupCode, groupSequence),
  CONSTRAINT stdGroup_fk2 FOREIGN KEY (qstnrCode, groupSequence) REFERENCES stdQstnrVersion (qstnrCode, qstnrSequence)
  );

CREATE TABLE stdGroupQuest(
  qstnrCode                 varchar2(16) NOT NULL,
  groupCode                 varchar2(16) NOT NULL,
  questCode                 varchar2(16) NOT NULL,
  questSequence             number(5,0) NOT NULL,
  groupQuestSequence        number(5,0) NOT NULL,
  groupQuestSequenceOut     number(5,0),
  questOrder                number(5,0),
  CONSTRAINT stdGroupQuest_pk PRIMARY KEY (qstnrCode, groupCode, questCode, questSequence, groupQuestSequence),
  CONSTRAINT stdGroupQuest_fk2 FOREIGN KEY (qstnrCode, groupCode, groupQuestSequence) REFERENCES stdGroup (qstnrCode, groupCode, groupSequence),
  CONSTRAINT stdGroupQuest_fk3 FOREIGN KEY (qstnrCode, questCode, questSequence) REFERENCES stdQuest (qstnrCode, questCode, questSequence)
  );

CREATE TABLE qstn(
  qstnId                    number(10,0) NOT NULL,
  qstnrCode                 varchar2(16) NOT NULL,
  qstnrSequence             number(5,0) NOT NULL,
  CONSTRAINT qstn_pk PRIMARY KEY (qstnId)
  );

CREATE TABLE qstnVersion(
  qstnId                    number(10,0) NOT NULL,
  qstnSequence              number(5,0) NOT NULL,
  CONSTRAINT qstnVersion_pk PRIMARY KEY (qstnId, qstnSequence)
  );

CREATE TABLE qstnResponse(
  qstnId                    number(10,0) NOT NULL,
  questCode                 varchar2(16) NOT NULL,
  questInstance             number(5,0),
  responseCode              varchar2(16) NOT NULL,
  qstnResponseSequence      number(5,0) NOT NULL,
  qstnResponseSequenceOut   number(5,0),
  responseValue             varchar2(4000),
  CONSTRAINT qstnResponse_pk PRIMARY KEY (qstnId, questCode)
  );
