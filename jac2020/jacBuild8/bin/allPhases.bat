echo off
echo ******************************************
echo JAC2020 v20191012a allphases.bat

call SetJob

cd %JAC_BUILD%\bin

call phase1

call phase2

call copyJars

pause END ******************************************

