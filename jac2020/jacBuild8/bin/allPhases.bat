echo off
echo ******************************************
echo JAC2020 v20191012a allphases.bat

call SetJob

if EXIST %JAC_BUILD%\classes rmdir/q/s %JAC_BUILD%\classes
mkdir %JAC_BUILD%\classes

if EXIST %JAC_BUILD%\lib\mic rmdir/q/s %JAC_BUILD%\lib\mic
mkdir %JAC_BUILD%\lib\mic

if EXIST %JAC_BUILD%\phase1Classes rmdir/q/s %JAC_BUILD%\phase1Classes
mkdir %JAC_BUILD%\phase1Classes

if EXIST %JAC_BUILD%\phase2Classes rmdir/q/s %JAC_BUILD%\phase2Classes
mkdir %JAC_BUILD%\phase2Classes

if EXIST %JAC_BUILD%\lib\jac rmdir/q/s %JAC_BUILD%\lib\jac
mkdir %JAC_BUILD%\lib\jac

cd %JAC_BUILD%\bin

call phase1

call phase2

call copyJars

pause END ******************************************

