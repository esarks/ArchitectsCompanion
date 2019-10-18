echo off
echo ******************************************
echo JAC2020 v20191012a phase1.bat

rem This batch file builds jac.jar which includes com.esarks.arm, com.esarks.jac, com.esarks.mic classes

"%JAVA_HOME%\bin\javac" -d %JAC_BUILD%\phase1Classes -g -sourcepath %JAC_BUILD%\source\java @%JAC_BUILD%\bin\phase1List.txt

"%JAVA_HOME%\bin\jar" cf %JAC_BUILD%\lib\jac\jac.jar -C "%JAC_BUILD%\phase1Classes" .

