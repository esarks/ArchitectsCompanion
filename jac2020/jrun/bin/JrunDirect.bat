echo off
echo Running... C:\ArchitectsCompanion\jac2017\Jrun\bin\JrunDirect.bat v20170224a
echo Jrun file=%1

cd C:\ArchitectsCompanion\jac2017\Jrun\bin

call setJAVA_HOME
call setJAC_BASE
call setJAC_DEBUG
call setJAC_DEBUG_LEVEL
call setJAC_PROFILE
call setJAC_COMPILE

cd %JAC_BASE%\bin
call Jrun.bat %1
pause