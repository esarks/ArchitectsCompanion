echo off
echo Jrun.bat v20050701a
echo Jrun.bat JAC_BASE=%JAC_BASE%
echo 1=%1
cd %JAC_BASE%\bin
call Job com.esarks.jac.jrun.Jrun execute %1
