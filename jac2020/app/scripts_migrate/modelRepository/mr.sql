
DROP TABLE objectReln;
DROP TABLE objectPropItem;
DROP TABLE object;
DROP TABLE stdPropSet;
DROP TABLE stdModelVersion;
DROP TABLE stdModel;

CREATE TABLE stdModel(
  modelId                number(6,0) NOT NULL,
  title                  varchar2(128),
  CONSTRAINT stdModel_pk PRIMARY KEY (modelId)
  );

CREATE TABLE stdModelVersion(
  modelId                number(6,0) NOT NULL,
  version                number(6,0) NOT NULL,
  description            varchar2(128),
  jrnUser                varchar2(64),
  jrnDate                date,
  CONSTRAINT stdModelVersion_pk PRIMARY KEY (modelId,version),
  CONSTRAINT stdModel_fk1 FOREIGN KEY (modelId) REFERENCES stdModel (modelId)
  );

CREATE TABLE stdPropSet(
  modelId                number(6,0) NOT NULL,
  propSetId              number(6,0) NOT NULL,
  propVersion            number(6,0) NOT NULL,
  propVersionOut         number(6,0),
  propSetName            varchar2(64),
  CONSTRAINT stdPropSet_pk PRIMARY KEY (modelId,propSetId,propVersion),
  CONSTRAINT stdPropSet_fk2 FOREIGN KEY (modelId,propVersion) REFERENCES stdModelVersion (modelId,version)
  );

CREATE TABLE stdPropItem(
  modelId                number(6,0) NOT NULL,
  propSetId              number(6,0) NOT NULL,
  propItemId             number(6,0) NOT NULL,
  propItemVersion        number(6,0) NOT NULL,
  propItemVersionOut     number(6,0),
  propOrder              number(4,0),
  propItemName           varchar2(64),
  CONSTRAINT stdPropItem_pk PRIMARY KEY (modelId,propSetId,propItemId,propItemVersion),
  CONSTRAINT stdPropItem_fk1 FOREIGN KEY (modelId,propSetId,propItemVersion) REFERENCES stdPropSet (modelId,propSetId,propVersion)
  );

CREATE TABLE object(
  modelId                number(6,0) NOT NULL,
  objectId               number(6,0) NOT NULL,
  objectVersion          number(6,0) NOT NULL,
  objectVersionOut       number(6,0),
  objectName             varchar2(64),
  CONSTRAINT object_pk PRIMARY KEY (modelId,objectId,objectVersion),
  CONSTRAINT object_fk1 FOREIGN KEY (modelId,objectVersion) REFERENCES stdModelVersion (modelId,version)
  );

CREATE TABLE objectPropItem(
  modelId                number(6,0) NOT NULL,
  objectId               number(6,0) NOT NULL,
  propSetId              number(6,0) NOT NULL,
  propItemId             number(6,0) NOT NULL,
  propItemVersion        number(6,0) NOT NULL,
  opiVersion             number(6,0) NOT NULL,
  opiVersionOut          number(6,0),
  propValue              blob,
  CONSTRAINT objectPropItem_pk PRIMARY KEY (modelId,objectId,propSetId,propItemId,propItemVersion,opiVersion),
  CONSTRAINT objectPropItem_fk1 FOREIGN KEY (modelId,opiVersion) REFERENCES stdModelVersion (modelId,version),
  CONSTRAINT objectPropItem_fk2 FOREIGN KEY (modelId,objectId,opiVersion) REFERENCES object (modelId,objectId,objectVersion),
  CONSTRAINT objectPropItem_fk3 FOREIGN KEY (modelId,propSetId,propItemId,propItemVersion) REFERENCES stdPropItem (modelId,propSetId,propItemId,propItemVersion)
  );

CREATE TABLE objectReln(
  modelId                number(6,0) NOT NULL,
  fromObjectId           number(6,0) NOT NULL,
  fromObjectVersion      number(6,0) NOT NULL,
  toObjectId             number(6,0) NOT NULL,
  toObjectVersion        number(6,0) NOT NULL,
  objectRelnVersion      number(6,0) NOT NULL,
  objectRelnVersionOut   number(6,0),
  relnName               varchar2(64),
  fromPropObjId          number(6,0) NOT NULL,
  fromPropObjVersion     number(6,0) NOT NULL,
  toPropObjId            number(6,0) NOT NULL,
  toPropObjVersion       number(6,0) NOT NULL,
  CONSTRAINT objectReln_pk PRIMARY KEY (modelId,fromObjectId,fromObjectVersion,toObjectId,toObjectVersion,objectRelnVersion),
  CONSTRAINT objectReln_fk1 FOREIGN KEY (modelId,objectRelnVersion) REFERENCES stdModelVersion (modelId,version),
  CONSTRAINT objectReln_fk2 FOREIGN KEY (modelId,fromObjectId,fromObjectVersion) REFERENCES object (modelId,objectId,objectVersion),
  CONSTRAINT objectReln_fk3 FOREIGN KEY (modelId,toObjectId,toObjectVersion) REFERENCES object (modelId,objectId,objectVersion),
  CONSTRAINT objectReln_fk4 FOREIGN KEY (modelId,fromPropObjId,fromPropObjVersion) REFERENCES object (modelId,objectId,objectVersion),
  CONSTRAINT objectReln_fk5 FOREIGN KEY (modelId,toPropObjId,toPropObjVersion) REFERENCES object (modelId,objectId,objectVersion)
  );



