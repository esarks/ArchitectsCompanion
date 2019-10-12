CREATE FUNCTION hrmRfaSort (@m0100 varchar(2), @m0030 varchar(8), @m0032 varchar(8), @m0090 varchar(8), @m0906 varchar(8)) RETURNS varchar(10)

AS

BEGIN
  DECLARE @returnSort varchar(9)
  if @m0100 = '01' SET @returnSort = @m0030 + '1'
  if @m0100 = '03' SET @returnSort = @m0032 + '5'
  if @m0100 = '04' SET @returnSort = @m0090 + '3'
  if @m0100 = '05' SET @returnSort = @m0090 + '3'
  if @m0100 = '06' SET @returnSort = @m0906 + '4'
  if @m0100 = '07' SET @returnSort = @m0906 + '6'
  if @m0100 = '08' SET @returnSort = @m0906 + '6'
  if @m0100 = '09' SET @returnSort = @m0906 + '6'
  RETURN @returnSort
END
