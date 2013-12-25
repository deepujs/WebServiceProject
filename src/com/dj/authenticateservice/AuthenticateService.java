
/*
 * 
 */

package com.dj.authenticateservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.dj.authenticateservice.AuthenticateService;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.9
 * Sun Apr 21 17:37:44 IST 2013
 * Generated source version: 2.2.9
 * 
 */


@WebServiceClient(name = "AuthenticateService", 
                  wsdlLocation = "http://www.dj.com/?wsdl",
                  targetNamespace = "http://www.dj.com/AuthenticateService/") 
public class AuthenticateService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.dj.com/AuthenticateService/", "AuthenticateService");
    public final static QName AuthenticateServiceSOAP = new QName("http://www.dj.com/AuthenticateService/", "AuthenticateServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("http://www.dj.com/?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://www.dj.com/?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public AuthenticateService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AuthenticateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthenticateService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns AuthenticateService
     */
    @WebEndpoint(name = "AuthenticateServiceSOAP")
    public AuthenticateService getAuthenticateServiceSOAP() {
        return super.getPort(AuthenticateServiceSOAP, AuthenticateService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthenticateService
     */
    @WebEndpoint(name = "AuthenticateServiceSOAP")
    public AuthenticateService getAuthenticateServiceSOAP(WebServiceFeature... features) {
        return super.getPort(AuthenticateServiceSOAP, AuthenticateService.class, features);
    }

}