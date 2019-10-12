set JAC_BUILD=C:\GitHub\JAC2020\jac2020\jacBuild8

if EXIST %JAC_BUILD%\phase1Classes rmdir/q/s %JAC_BUILD%\phase1Classes
mkdir %JAC_BUILD%\phase1Classes

rem set CLASSPATH=%JAC_BUILD%\source\java
rem set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\jetty\javax.servlet.jar

set CLASSPATH=%JAC_BUILD%\lib\jetty\javax.servlet.jar
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\oreilly\cos.jar
set CLASSPATH=%CLASSPATH%;%JAC_BUILD%\lib\jetty\org.mortbay.jetty.jar
set CLASSPATH=%CLASSPATH%;%JAVA_HOME%\lib\tools.jar

"%JAVA_HOME%\bin\javac" -d %JAC_BUILD%\phase1Classes -g -sourcepath %JAC_BUILD%\source\java @%JAC_BUILD%\bin\phase1List.txt

if EXIST %JAC_BUILD%\lib\jac rmdir/q/s %JAC_BUILD%\lib\jac
mkdir %JAC_BUILD%\lib\jac

"%JAVA_HOME%\bin\jar" cf %JAC_BUILD%\lib\jac\jac.jar -C "%JAC_BUILD%\phase1Classes" .

if EXIST %JAC_BUILD%\phase1Classes rmdir/q/s %JAC_BUILD%\phase1Classes
