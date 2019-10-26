echo off
echo ******************************************
echo JAC2020 v20191012a phase2.bat

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
call Job com.esarks.jac.jrun.Jrun execute "%JAC_BUILD%\source\scripts\com\esarks\jac\make\MakeJac_force.jrun2"

xcopy %JAC_BUILD%\classes\*.class %JAC_BUILD%\phase2Classes /s

"%JAVA_HOME%\bin\jar" cf %JAC_BUILD%\lib\mic\mic.jar -C "%JAC_BUILD%\phase2Classes" .

