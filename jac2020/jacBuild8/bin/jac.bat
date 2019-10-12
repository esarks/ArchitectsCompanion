echo off
echo ******************************************
echo JAC2020 v20191012a jac.bat

echo Script=%1
echo Method=%2

set JAC_HOME=C:\ArchitectsCompanion\jac2017\jacBuild8
set JAC_WORK=%JAC_HOME%\source\scripts\classes
set JAC_SCRIPTS=%JAC_HOME%\source\scripts

set DEBUG=
rem set DEBUG=-Dorg.xml.sax.driver=com.bluecast.xml.Piccolo -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,address=8000,suspend=y

set LOG=-debugInstance ?date -debugPath "%JAC_HOME%\logs" -debug 4 -debugClass 4

if "%2" == "" %JAVA_HOME%\bin\java %DEBUG% com.esarks.jac.jac -home "%JAC_HOME%" -work %JAC_WORK% -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" -script %1 %LOG%
if NOT "%2" == "" %JAVA_HOME%\bin\java %DEBUG% com.esarks.jac.jac -home "%JAC_HOME%" -work %JAC_WORK% -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" -script %1 -method %2 %LOG%

