echo off
echo C:\ArchitectsCompanion\jac2017\bin\Job.bat
echo Job.bat 20170116a
echo Job.bat 1=%1
echo Job.bat 2=%2
echo Job.bat 3=%3
echo Job.bat 4=%4

call SetJob

echo JAC_BASE=%JAC_BASE%
echo JAC_HOME=%JAC_HOME%
echo JAC_WORK=%JAC_WORK%
echo JAC_SCRIPTS=%JAC_SCRIPTS%

set MEMORY=-Xms64m -Xmx512m

if "%JAC_DEBUG_LEVEL%" == "" set LOG=-debugInstance ?date -debugPath "%JAC_HOME%\logs" -debug 4 -debugClass 4
if NOT "%JAC_DEBUG_LEVEL%" == "" set LOG=-debugInstance ?date -debugPath "%JAC_HOME%\logs" -debug %JAC_DEBUG_LEVEL% -debugClass %JAC_DEBUG_LEVEL%

set PROFILE=
if "%JAC_PROFILE%" == "true" set PROFILE=-Xrunjprofiler -Xint -Xbootclasspath/a:"C:\Program Files\jprofiler3\bin\agent.jar"

rem set JACOB=-Djava.library.path=%JAC_HOME%\lib\jacob-1.17-M2 -Dcom.jacob.debug=true -Xcheck:jni
set JACOB=-Djava.library.path=%JAC_HOME%\lib\jacob-1.17-M2

set DEBUG=
if "%JAC_DEBUG%" == "true" set DEBUG=-Dorg.xml.sax.driver=com.bluecast.xml.Piccolo -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,address=8000,suspend=y

set COMPILE=
if "%JAC_COMPILE%" == "false" set COMPILE=-nocompile

if not "%1" == "jac" goto jrun
%JAVA_HOME%\bin\java %MEMORY% %PROFILE% %JACOB% %DEBUG% com.esarks.jac.jac %COMPILE% -pause -script %2 -method %3 -context %4 -home "%JAC_HOME%" -work "%JAC_WORK%" -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" %LOG%
goto exit

:jrun

echo At jrun

if %3 == "" echo "TRUE"
if NOT %3 == "" echo "FALSE"

echo on

if %3 == "" %JAVA_HOME%\bin\java %MEMORY% %PROFILE% %JACOB% %DEBUG% com.esarks.jac.jac %COMPILE% -pause -script com.esarks.jac.jrun.Job -method execute -argument %1 -argument %2 -home "%JAC_HOME%" -work "%JAC_WORK%" -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" %LOG%
if NOT %3 == "" %JAVA_HOME%\bin\java %MEMORY% %PROFILE% %JACOB% %DEBUG% com.esarks.jac.jac %COMPILE% -pause -script com.esarks.jac.jrun.Job -method execute -argument %1 -argument %2 -argument %3 -home "%JAC_HOME%" -work "%JAC_WORK%" -scripts "%JAC_SCRIPTS%" -classpath "%CLASSPATH%" %LOG%

:exit
