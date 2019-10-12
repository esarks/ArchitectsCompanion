DROP TABLE stdQuestionnaire;
CREATE TABLE stdQuestionnaire(
  uniqueId                  varchar2(16) NOT NULL,
  version                   varchar2(8) NOT NULL,
  description               varchar2(64),
  CONSTRAINT stdQuestionnaire_pk PRIMARY KEY (uniqueId, version) USING INDEX TABLESPACE indx
  ) TABLESPACE users;

DROP TABLE stdQuestion;
CREATE TABLE stdQuestion(
  stdQuestionnaireUid       varchar2(16) NOT NULL,
  uniqueId                  varchar2(16) NOT NULL,
  version                   varchar2(8) NOT NULL,
  versionOut                varchar2(8),
  sequence                  number(4,0) NOT NULL,
  text                      varchar2(2048),
  responseType              varchar2(32),
  CONSTRAINT stdQuestion_pk PRIMARY KEY (stdQuestionnaireUid, uniqueId, version) USING INDEX TABLESPACE indx
  ) TABLESPACE users;

DROP TABLE stdResponse;
CREATE TABLE stdResponse(
  stdQuestionnaireUid       varchar2(16) NOT NULL,
  stdQuestionUid            varchar2(16) NOT NULL,
  uniqueId                  varchar2(16) NOT NULL,
  version                   varchar2(8) NOT NULL,
  versionOut                varchar2(8),
  sequence                  number(4,0) NOT NULL,
  text                      varchar2(2048),
  CONSTRAINT stdResponse_pk PRIMARY KEY (stdQuestionnaireUid, stdQuestionUid, uniqueId, version) USING INDEX TABLESPACE indx
  ) TABLESPACE users;

DROP TABLE questionnaire;
CREATE TABLE questionnaire(
  itemId                    number(10,0) NOT NULL,
  version                   number(5,0) NOT NULL,
  stdQuestionnaireUid       varchar2(16) NOT NULL,
  stdQuestionnaireVersion   varchar2(8) NOT NULL,
  CONSTRAINT questionnaire_pk PRIMARY KEY (itemId, version) USING INDEX TABLESPACE indx
  ) TABLESPACE users;

DROP SEQUENCE questionnaire_seq;
CREATE SEQUENCE questionnaire_seq
    NOCYCLE
    MAXVALUE 9999999999
    START WITH 1;

DROP TABLE questionnaireResponse;
CREATE TABLE questionnaireResponse(
  questionnaireId           number(10,0) NOT NULL,
  stdQuestionUid            varchar2(16) NOT NULL,
  stdResponseUid            varchar2(16) NOT NULL,
  version                   number(5,0) NOT NULL,
  versionOut                number(5,0),
  CONSTRAINT questionnaireResponse_pk PRIMARY KEY (questionnaireId, stdQuestionUid, stdResponseUid, version) USING INDEX TABLESPACE indx
  ) TABLESPACE users;

