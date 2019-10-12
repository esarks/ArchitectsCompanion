CREATE FUNCTION hrmGetEthnicityType (@personId bigint, @ethnicityType varchar(2)) RETURNS bit

AS

BEGIN
  DECLARE @result bit
  SELECT @ethnicityType = (SELECT ethnicityType FROM hrmPersonEthnicity WHERE id=@personId AND ethnicityType=@ethnicityType)
  IF @ethnicityType is null SET @result = 0 ELSE SET @result = 1
  RETURN @result
END
