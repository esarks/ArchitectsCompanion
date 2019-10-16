echo off
echo Running... C:\GitHub\ArchitectsCompanion\jac2020\bin\Jrun.bat v20191013a

echo Jrun.bat v20191013a
echo Jrun.bat JAC_BASE=%JAC_BASE%
echo 1=%1
cd %JAC_BASE%\bin
call Job com.esarks.jac.jrun.Jrun execute %1
