CREATE FUNCTION hrmGetPersonNumberValue (@personId bigint, @personNumberType varchar(2)) RETURNS varchar(32)

AS

BEGIN
  DECLARE @personNumber varchar(32)
  SELECT @personNumber = (SELECT personNumber FROM hrmPersonNumber WHERE id=@personId AND personNumberType=@personNumberType AND invalid is null)
  RETURN @personNumber
END
