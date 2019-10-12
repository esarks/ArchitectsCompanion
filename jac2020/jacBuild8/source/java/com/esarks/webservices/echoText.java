package com.esarks.webservices;

import java.text.*;
import java.util.*;
import javax.jws.WebService; 
import javax.jws.WebMethod; 
import javax.jws.soap.SOAPBinding; 
import javax.jws.soap.SOAPBinding.Style;

@WebService     // This signals that this is a Service Endpoint Interface (SEI)
@SOAPBinding(style = Style.RPC) // Needed for the WSDL 
public interface echoTest {     
@WebMethod   // This signals that this method is a service operaNon
   String EchoMessage(String strMsg);    } 
