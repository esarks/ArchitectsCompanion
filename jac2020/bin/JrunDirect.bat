echo off
echo Running... C:\GitHub\ArchitectsCompanion\jac2020\bin\JrunDirect.bat v20191013a

set JAC_BASE=J:
set JAC_DEBUG=false
set JAC_DEBUG_LEVEL=5
set JAC_PROFILE=false
set JAC_COMPILE=true

J:
cd \bin
call Jrun.bat %1
