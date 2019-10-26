echo off
echo JrunDirect.bat jacBuild8
echo ******************************************************* WARNING
echo ******************************************************* WARNING
echo ******************************************************* WARNING
echo ******************************************************* WARNING
echo ******************************************************* WARNING
echo ******************************************************* WARNING
echo ******************************************************* WARNING
echo ******************************************************* WARNING
echo ******************************************************* WARNING
echo ******************************************************* WARNING
set config=1

if "%config%"=="1" set JAC_BASE=C:\jetty-4.2.23\webapps\elumn8\WEB-INF\hrm
if "%config%"=="2" set JAC_BASE=C:\jetty-4.2.23\webapps\elumn8\WEB-INF\hrm\releases\hrm20050630a

set JAC_DEBUG=false
set JAC_DEBUG_LEVEL=5
set JAC_PROFILE=false
set JAC_COMPILE=true

call %JAC_BASE%\bin\Jrun.bat %1
pause
