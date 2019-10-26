echo off
echo ******************************************
echo JAC2020 v20191012a SetJob.bat

set ArchitectsCompanion=C:\GitHub\ArchitectsCompanion
set JAC_VERSION=%ArchitectsCompanion%\jac2020\jacBuild8
set JAVA_HOME=%JAC_VERSION%\jdk1.8.0_112
set JAC_BUILD=%JAC_VERSION%
set JAC_WORK=%JAC_VERSION%\classes
set JAC_SCRIPTS=%JAC_BUILD%\source\scripts
set JAC_JARS=%ArchitectsCompanion%\jac2020

rem -- Jac
set CLASSPATH=%JAC_WORK%
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\jac\jac.jar
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\mic\mic.jar

rem -- Oreilly
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\oreilly\cos.jar

rem -- Jetty
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\jetty\org.mortbay.jetty.jar
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\jetty\org.mortbay.jxm.jar
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\jetty\javax.servlet.jar

rem -- Java Tools
set CLASSPATH=%CLASSPATH%;%JAVA_HOME%\lib\tools.jar

rem -- MS SQLServer
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\mssqlserver\msbase.jar
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\mssqlserver\mssqlserver.jar
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\mssqlserver\msutil.jar

rem -- Crimson XML parser
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\crimson\crimson.jar

echo %CLASSPATH% > classpath.txt

