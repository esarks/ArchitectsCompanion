echo off
echo Running... C:\GitHub\ArchitectsCompanion\jac2020\jacBuild8\jrun2\bin\Jrun2Direct.bat v20191013a

echo Jrun2 file=%1

cd C:\GitHub\ArchitectsCompanion\jac2020\jacBuild8\jrun2\bin

call set2JAVA_HOME
call set2JAC_BASE
call set2JAC_DEBUG
call set2JAC_DEBUG_LEVEL
call set2JAC_PROFILE
call set2JAC_COMPILE

cd %JAC_BASE%\bin
call Jrun2.bat %1
pause