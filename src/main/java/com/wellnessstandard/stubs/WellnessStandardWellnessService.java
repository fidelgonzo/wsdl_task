
package com.wellnessstandard.stubs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WellnessStandardWellnessService", targetNamespace = "http://wellness.wellnessStandard.assol.sk", wsdlLocation = "http://192.108.125.136/icard_test/WellnessStandardWellnessService.asmx?WSDL")
public class WellnessStandardWellnessService
    extends Service
{

    private final static URL WELLNESSSTANDARDWELLNESSSERVICE_WSDL_LOCATION;
    private final static WebServiceException WELLNESSSTANDARDWELLNESSSERVICE_EXCEPTION;
    private final static QName WELLNESSSTANDARDWELLNESSSERVICE_QNAME = new QName("http://wellness.wellnessStandard.assol.sk", "WellnessStandardWellnessService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.108.125.136/icard_test/WellnessStandardWellnessService.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WELLNESSSTANDARDWELLNESSSERVICE_WSDL_LOCATION = url;
        WELLNESSSTANDARDWELLNESSSERVICE_EXCEPTION = e;
    }

    public WellnessStandardWellnessService() {
        super(__getWsdlLocation(), WELLNESSSTANDARDWELLNESSSERVICE_QNAME);
    }

    public WellnessStandardWellnessService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WELLNESSSTANDARDWELLNESSSERVICE_QNAME, features);
    }

    public WellnessStandardWellnessService(URL wsdlLocation) {
        super(wsdlLocation, WELLNESSSTANDARDWELLNESSSERVICE_QNAME);
    }

    public WellnessStandardWellnessService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WELLNESSSTANDARDWELLNESSSERVICE_QNAME, features);
    }

    public WellnessStandardWellnessService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WellnessStandardWellnessService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WellnessStandardWellnessServiceSoap
     */
    @WebEndpoint(name = "WellnessStandardWellnessServiceSoap")
    public WellnessStandardWellnessServiceSoap getWellnessStandardWellnessServiceSoap() {
        return super.getPort(new QName("http://wellness.wellnessStandard.assol.sk", "WellnessStandardWellnessServiceSoap"), WellnessStandardWellnessServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WellnessStandardWellnessServiceSoap
     */
    @WebEndpoint(name = "WellnessStandardWellnessServiceSoap")
    public WellnessStandardWellnessServiceSoap getWellnessStandardWellnessServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://wellness.wellnessStandard.assol.sk", "WellnessStandardWellnessServiceSoap"), WellnessStandardWellnessServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WELLNESSSTANDARDWELLNESSSERVICE_EXCEPTION!= null) {
            throw WELLNESSSTANDARDWELLNESSSERVICE_EXCEPTION;
        }
        return WELLNESSSTANDARDWELLNESSSERVICE_WSDL_LOCATION;
    }

}