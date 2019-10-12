if not exist "F:\ArchitectsCompanion\jac\scripts\heartbeatMonitor\Event_%1%.xml" goto alert
del "F:\ArchitectsCompanion\jac\scripts\heartbeatMonitor\Event_%1%.xml"
goto exit
:alert
"F:\ArchitectsCompanion\jac\scripts\heartbeatMonitor\SendAlert%1%.bat"
:exit

