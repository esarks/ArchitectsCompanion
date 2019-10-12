DROP TABLE stdQuestionnaire;
CREATE TABLE stdQuestionnaire(
  questionnaireCode         varchar2(16) NOT NULL,
  questionnaireSequence     number(5,0) NOT NULL,
  title                     varchar2(64),
  version                   varchar2(8),
  CONSTRAINT stdQuestionnaire_pk PRIMARY KEY (questionnaireCode, questionnaireSequence)
  );

DROP TABLE stdQuestion;
CREATE TABLE stdQuestion(
  questionnaireCode         varchar2(16) NOT NULL,
  questionCode              varchar2(16) NOT NULL,
  questionSequence          number(5,0) NOT NULL,
  questionSequenceOut       number(5,0),
  questionOrder             number(5,0),
  questionText              varchar2(2048),
  questionType              varchar2(16),
  CONSTRAINT stdQuestion_pk PRIMARY KEY (questionnaireCode, questionCode, questionSequence)
  CONSTRAINT stdQuestion_fk1 FOREIGN KEY (questionnaireCode, questionSequence) REFERENCES stdQuestionnaire (questionnaireCode, questionnaireSequence)
  );

DROP TABLE stdResponse;
CREATE TABLE stdResponse(
  questionnaireCode         varchar2(16) NOT NULL,
  questionCode              varchar2(16) NOT NULL,
  responseCode              varchar2(16) NOT NULL,
  responseSequence          number(5,0) NOT NULL,
  responseSequenceOut       number(5,0),
  responseOrder             number(5,0),
  responseText              varchar2(2048),
  CONSTRAINT stdResponse_pk PRIMARY KEY (questionnaireCode, questionCode, responseCode, responseSequence)
  CONSTRAINT stdResponse_fk1 FOREIGN KEY (questionnaireCode, questionCode) REFERENCES stdQuestion (questionnaireCode, questionCode)
  CONSTRAINT stdResponse_fk2 FOREIGN KEY (questionnaireCode, responseSequence) REFERENCES stdQuestionnaire (questionnaireCode, questionnaireSequence)
  );

DROP TABLE questionnaire;
CREATE TABLE questionnaire(
  questionnaireCode         varchar2(16) NOT NULL,
  questionnaireSequence     number(5,0) NOT NULL,
  questionnaireRevision     number(5,0) NOT NULL,
  CONSTRAINT questionnaire_pk PRIMARY KEY (questionnaireCode, questionnaireSequence, questionnaireRevision)
  CONSTRAINT questionnaire_fk1 FOREIGN KEY (questionnaireCode, questionnaireSequence) REFERENCES stdQuestionnaire (questionnaireCode, questionnaireSequence)
  );




DROP TABLE questionnaireResponse;
CREATE TABLE questionnaireResponse(
  questionnaireId           number(10,0) NOT NULL,
  stdQuestionUid            varchar2(16) NOT NULL,
  stdResponseUid            varchar2(16) NOT NULL,
  version                   number(5,0) NOT NULL,
  versionOut                number(5,0),
  CONSTRAINT questionnaireResponse_pk PRIMARY KEY (questionnaireId, stdQuestionUid, stdResponseUid, version) USING INDEX TABLESPACE indx
  ) TABLESPACE users;

