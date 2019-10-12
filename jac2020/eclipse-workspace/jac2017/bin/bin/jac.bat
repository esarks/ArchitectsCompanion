echo off
echo jac.bat jacBuild8
echo Script=%1
echo Method=%2

set JAC_HOME=C:\ArchitectsCompanion\jac2017\jacBuild8
set JAC_WORK=%JAC_HOME%\source\scripts\classes
set JAC_SCRIPTS=%JAC_HOME%\source\scripts

set CLASSPATH=%JAC_HOME%\lib\jac.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\crimson.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\Piccolo.jar
set CLASSPATH=%CLASSPATH%;%JAVA_HOME%\lib\tools.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\source\scripts\classes
echo Classpath=%CLASSPATH%

set DEBUG=
rem set DEBUG=-Dorg.xml.sax.driver=com.bluecast.xml.Piccolo -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,address=8000,suspend=y

set LOG=-debugInstance ?date -debugPath "%JAC_HOME%\logs" -debug 4 -debugClass 4

if "%2" == "" %JAVA_HOME%\bin\java %DEBUG% com.esarks.jac.jac -home "%JAC_HOME%" -work %JAC_WORK% -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" -script %1 %LOG%
if NOT "%2" == "" %JAVA_HOME%\bin\java %DEBUG% com.esarks.jac.jac -home "%JAC_HOME%" -work %JAC_WORK% -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" -script %1 -method %2 %LOG%

rem set classpath=.;%JAC_HOME%\lib\Piccolo.jar;%JAC_HOME%\lib\tools.jar;%JAC_HOME%\lib\classes12.zip;%JAC_HOME%\classes\;%JAC_HOME%\work\;%classpath%
rem set classpath=.;%JAC_HOME%\lib\tools.jar;%JAC_HOME%\lib\classes12.zip;%JAC_HOME%\classes\;%JAC_HOME%\work\;%classpath%
rem set classpath=%classpath%;%JAC_HOME%\lib\msbase.jar;%JAC_HOME%\lib\mssqlserver.jar;%JAC_HOME%\lib\msutil.jar
rem java -Dorg.xml.sax.driver=com.bluecast.xml.Piccolo com.esarks.jac.jac -home %JAC_HOME% -debug 99 -scripts %JAC_SCRIPTS% -script %1 -method %2
rem java com.esarks.jac.jac -home %JAC_HOME% -debug 99 -scripts %JAC_SCRIPTS% -script %1 -method %2

