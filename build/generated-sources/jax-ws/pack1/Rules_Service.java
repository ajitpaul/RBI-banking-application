
package pack1;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "rules", targetNamespace = "http://pack1/", wsdlLocation = "http://169.254.209.54:8080/Serverwebservice/rules?WSDL")
public class Rules_Service
    extends Service
{

    private final static URL RULES_WSDL_LOCATION;
    private final static WebServiceException RULES_EXCEPTION;
    private final static QName RULES_QNAME = new QName("http://pack1/", "rules");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://169.254.209.54:8080/Serverwebservice/rules?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RULES_WSDL_LOCATION = url;
        RULES_EXCEPTION = e;
    }

    public Rules_Service() {
        super(__getWsdlLocation(), RULES_QNAME);
    }

    public Rules_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), RULES_QNAME, features);
    }

    public Rules_Service(URL wsdlLocation) {
        super(wsdlLocation, RULES_QNAME);
    }

    public Rules_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RULES_QNAME, features);
    }

    public Rules_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Rules_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Rules
     */
    @WebEndpoint(name = "rulesPort")
    public Rules getRulesPort() {
        return super.getPort(new QName("http://pack1/", "rulesPort"), Rules.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Rules
     */
    @WebEndpoint(name = "rulesPort")
    public Rules getRulesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pack1/", "rulesPort"), Rules.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RULES_EXCEPTION!= null) {
            throw RULES_EXCEPTION;
        }
        return RULES_WSDL_LOCATION;
    }

}