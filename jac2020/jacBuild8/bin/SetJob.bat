echo off
echo SetJob.bat jacBuild8

set JAC_HOME=%JAC_BASE%
set JAC_WORK=%JAC_BASE%\classes
set JAC_SCRIPTS=%JAC_BASE%\source\scripts

rem -- Jac
set CLASSPATH=%JAC_WORK%
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jac\jac.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mic\mic.jar

rem -- Oreilly
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\oreilly\cos.jar

rem -- Jetty
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jetty\org.mortbay.jetty.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jetty\org.mortbay.jxm.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\jetty\javax.servlet.jar

rem -- Java Tools
set CLASSPATH=%CLASSPATH%;%JAVA_HOME%\lib\tools.jar

rem -- MS SQLServer
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mssqlserver\msbase.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mssqlserver\mssqlserver.jar
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\mssqlserver\msutil.jar

rem -- Apache Tomcat
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\tomcat\servlet-api.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\tomcat\jsp-api.jar

rem -- Crimson XML parser
set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\crimson\crimson.jar

rem -- Piccolo XML parser
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\piccolo\Piccolo.jar

rem -- Xerces XML parser
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces_2_5_0.jar

rem -- Xerces
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\ant.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\junit.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\optional.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\stylebook.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\xalan.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\xercesImpl.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\xercesSamples.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\xml-apis.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\xml-apis--src.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\xerces\xmlParserAPIs.jar

rem -- SOAP
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\activation.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\axis.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\axis-ant.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\axis-schema.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\commons-discovery.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\commons-logging.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\commons-logging-api.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\jaxrpc.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\log4j.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\mail.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\saaj.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\wsdl4j.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\xmlsecTests.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\serializer.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\xalan.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\xmlsec.jar
rem set CLASSPATH=%CLASSPATH%;%JAC_HOME%\lib\soap\xmlsecSamples.jar

rem echo %CLASSPATH% >> classpath.txt

