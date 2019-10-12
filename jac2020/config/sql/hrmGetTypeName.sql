CREATE FUNCTION hrmGetTypeName (@groupName varchar(32), @typeCode varchar(16)) RETURNS varchar(64)

AS

BEGIN
  DECLARE @typeName varchar(64)
  SELECT @typeName = (SELECT typeName FROM hrmTypeTranslation WHERE groupName=@groupName AND typeCode=@typeCode)
  RETURN @typeName
END

