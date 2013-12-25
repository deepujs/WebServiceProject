package com.dj;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.9
 * Sun Apr 21 17:37:44 IST 2013
 * Generated source version: 2.2.9
 * 
 */
 
@WebService(targetNamespace = "http://www.dj.com", name = "AuthenticateService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AuthenticateService {

    @WebResult(name = "AuthenticateResponse", targetNamespace = "http://www.dj.com", partName = "parameters")
    @WebMethod(action = "http://www.dj.com/AuthenticateService/authenticate")
    public AuthenticateResponse authenticate(
        @WebParam(partName = "parameters", name = "AuthenticateRequest", targetNamespace = "http://www.dj.com")
        AuthenticateRequest parameters
    );
}