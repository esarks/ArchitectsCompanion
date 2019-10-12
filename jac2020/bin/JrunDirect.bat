echo off
echo JrunDirect.bat

set JAC_BASE=J:
set JAC_DEBUG=false
set JAC_DEBUG_LEVEL=5
set JAC_PROFILE=false
set JAC_COMPILE=true

J:
cd \bin
call Jrun.bat %1
