echo off
echo ******************************************
echo JAC2020 v20191012a phase2.bat

if EXIST %JAC_BUILD%\classes rmdir/q/s %JAC_BUILD%\classes
mkdir %JAC_BUILD%\classes

if EXIST %JAC_BUILD%\lib\mic rmdir/q/s %JAC_BUILD%\lib\mic
mkdir %JAC_BUILD%\lib\mic

if EXIST %JAC_BUILD%\phase2Classes rmdir/q/s %JAC_BUILD%\phase2Classes
mkdir %JAC_BUILD%\phase2Classes

cd %JAC_BUILD%\bin

call Job jac com.esarks.arm.scripts.ExitMethod         ! jac
call Job jac com.esarks.arm.scripts.FinalReturnMethod  ! jac
call Job jac com.esarks.arm.scripts.GetEffectiveDate   ! jac
call Job jac com.esarks.arm.scripts.IterateReplyJeo    ! jac
call Job jac com.esarks.arm.scripts.Method             ! jac
call Job jac com.esarks.arm.scripts.ReturnMethod       ! jac
call Job jac com.esarks.arm.scripts.Service            ! jac
call Job jac com.esarks.jac.jrun.Job                   ! micScriptComponent
call Job jac com.esarks.jac.jrun.Jrun                  ! micScriptComponent
call Job com.esarks.jac.jrun.Jrun execute "%JAC_BUILD%\source\scripts\com\esarks\jac\make\MakeJac_force.jrun"

xcopy %JAC_BUILD%\classes\*.class %JAC_BUILD%\phase2Classes /s

"%JAVA_HOME%\bin\jar" cf %JAC_BUILD%\lib\mic\mic.jar -C "%JAC_BUILD%\phase2Classes" .

if EXIST %JAC_BUILD%\phase2Classes rmdir/q/s %JAC_BUILD%\phase2Classes
