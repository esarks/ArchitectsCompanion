DROP VIEW questionnaireView;
DROP VIEW stdQuestionnaireView;
DROP TABLE questionnaireResponse;
DROP TABLE questionnaire;
DROP TABLE stdResponse;
DROP TABLE stdQuestion;
DROP TABLE stdQuestionnaire;

CREATE TABLE stdQuestionnaire(
  questionnaireCode         varchar2(16) NOT NULL,
  questionnaireSequence     number(5,0) NOT NULL,
  title                     varchar2(64),
  CONSTRAINT stdQuestionnaire_pk PRIMARY KEY (questionnaireCode, questionnaireSequence)
  );

CREATE TABLE stdQuestion(
  questionnaireCode         varchar2(16) NOT NULL,
  questionCode              varchar2(16) NOT NULL,
  questionSequence          number(5,0) NOT NULL,
  questionSequenceOut       number(5,0),
  questionOrder             number(5,0),
  questionText              varchar2(2048),
  questionType              varchar2(16),
  questionRepeats           number(5,0),
  CONSTRAINT stdQuestion_pk PRIMARY KEY (questionnaireCode, questionCode, questionSequence),
  CONSTRAINT stdQuestion_fk1 FOREIGN KEY (questionnaireCode, questionSequence) REFERENCES stdQuestionnaire (questionnaireCode, questionnaireSequence)
  );

CREATE TABLE stdResponse(
  questionnaireCode         varchar2(16) NOT NULL,
  questionCode              varchar2(16) NOT NULL,
  responseCode              varchar2(16) NOT NULL,
  responseSequence          number(5,0) NOT NULL,
  responseSequenceOut       number(5,0),
  responseOrder             number(5,0),
  responseText              varchar2(2048),
  CONSTRAINT stdResponse_pk PRIMARY KEY (questionnaireCode, questionCode, responseCode, responseSequence),
  CONSTRAINT stdResponse_fk1 FOREIGN KEY (questionnaireCode, responseSequence) REFERENCES stdQuestionnaire (questionnaireCode, questionnaireSequence)
  );

CREATE TABLE questionnaire(
  questionnaireId           number(10,0) NOT NULL,
  questionnaireRevision     number(5,0) NOT NULL,
  questionnaireCode         varchar2(16) NOT NULL,
  questionnaireSequence     number(5,0) NOT NULL,
  CONSTRAINT questionnaire_pk PRIMARY KEY (questionnaireId, questionnaireRevision),
  CONSTRAINT questionnaire_fk1 FOREIGN KEY (questionnaireCode, questionnaireSequence) REFERENCES stdQuestionnaire (questionnaireCode, questionnaireSequence)
  );

CREATE TABLE questionnaireResponse(
  questionnaireId           number(10,0) NOT NULL,
  questionCode              varchar2(16) NOT NULL,
  questionInstance          number(5,0) NOT NULL,
  responseCode              varchar2(16) NOT NULL,
  responseRevision          number(5,0) NOT NULL,
  responseRevisionOut       number(5,0),
  responseValue             varchar2(4000),
  CONSTRAINT questionnaireResponse_pk PRIMARY KEY (questionnaireId, questionCode, questionInstance, responseCode, responseRevision)
  );

CREATE VIEW stdQuestionnaireView AS
SELECT 
 a.questionnaireCode, a.questionnaireSequence, a.title, 
 b.questionCode, b.questionSequence, b.questionSequenceOut, b.questionOrder, b.questionText, b.questionType, b.questionRepeats, 
 c.responseCode, c.responseSequence, c.responseSequenceOut, c.responseOrder, c.responseText
FROM stdQuestionnaire a, stdQuestion b, stdResponse c 
WHERE  a.questionnaireCode = b.questionnaireCode AND 
       a.questionnaireSequence >= b.questionSequence AND 
      (b.questionSequenceOut is Null OR a.questionnaireSequence < b.questionSequenceOut) AND 
       a.questionnaireCode = c.questionnaireCode AND 
       b.questionCode = c.questionCode AND 
       a.questionnaireSequence >= c.responseSequence AND 
      (c.responseSequenceOut is Null OR a.questionnaireSequence < c.responseSequenceOut) 
ORDER BY b.questionOrder, c.responseOrder;

CREATE VIEW questionnaireView AS
SELECT 
 a.questionnaireId, a.questionnaireRevision, a.questionnaireCode, a.questionnaireSequence, 
 b.questionCode, b.questionInstance, b.responseCode, b.responseRevision, b.responseRevisionOut, b.responseValue
FROM questionnaire a, questionnaireResponse b
WHERE  a.questionnaireId = b.questionnaireId AND 
       a.questionnaireRevision >= b.responseRevision AND 
      (b.responseRevisionOut is Null OR a.questionnaireRevision < b.responseRevisionOut);

