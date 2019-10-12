CREATE FUNCTION hrmConcatName (@lastName varchar(64), @firstName varchar(64), @middleName varchar(64), @suffixName varchar(64)) RETURNS varchar(128)

AS

BEGIN
  DECLARE @fullName varchar(128)
  IF @lastName is not null SET @fullName = RTRIM(@lastName)
  IF @firstName is not null SET @fullName = RTRIM(@fullName + ', ' + @firstName)
  IF @middleName is not null SET @fullName = RTRIM(@fullName + ' ' + @middleName)
  IF @suffixName is not null SET @fullName = RTRIM(@fullName + ' ' + @suffixName)
  RETURN @fullName
END
