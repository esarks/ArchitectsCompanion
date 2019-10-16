echo off
echo Running... C:\GitHub\ArchitectsCompanion\jac2020\jrun\bin\JrunDirect.bat v20191013a

echo Jrun file=%1

cd C:\Github\ArchitectsCompanion\jac2020\Jrun\bin

call setJAVA_HOME
call setJAC_BASE
call setJAC_DEBUG
call setJAC_DEBUG_LEVEL
call setJAC_PROFILE
call setJAC_COMPILE

cd %JAC_BASE%\bin
call Jrun.bat %1
pause