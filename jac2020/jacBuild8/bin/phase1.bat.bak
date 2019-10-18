echo off
echo ******************************************
echo JAC2020 v20191012a phase1.bat

rem This batch file builds jac.jar which includes com.esarks.arm, com.esarks.jac, com.esarks.mic classes

if EXIST %JAC_BUILD%\phase1Classes rmdir/q/s %JAC_BUILD%\phase1Classes
mkdir %JAC_BUILD%\phase1Classes

"%JAVA_HOME%\bin\javac" -d %JAC_BUILD%\phase1Classes -g -sourcepath %JAC_BUILD%\source\java @%JAC_BUILD%\bin\phase1List.txt

if EXIST %JAC_BUILD%\lib\jac rmdir/q/s %JAC_BUILD%\lib\jac
mkdir %JAC_BUILD%\lib\jac

"%JAVA_HOME%\bin\jar" cf %JAC_BUILD%\lib\jac\jac.jar -C "%JAC_BUILD%\phase1Classes" .

if EXIST %JAC_BUILD%\phase1Classes rmdir/q/s %JAC_BUILD%\phase1Classes
