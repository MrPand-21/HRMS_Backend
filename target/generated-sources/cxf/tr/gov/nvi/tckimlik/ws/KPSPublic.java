package tr.gov.nvi.tckimlik.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-05-26T12:56:11.238+03:00
 * Generated source version: 3.4.3
 *
 */
@WebServiceClient(name = "KPSPublic",
                  wsdlLocation = "file:/Users/mr.panda/IdeaProjects/hrms/src/main/resources/Mernis.wsdl",
                  targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
public class KPSPublic extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublic");
    public final static QName KPSPublicSoap = new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap");
    public final static QName KPSPublicSoap12 = new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/mr.panda/IdeaProjects/hrms/src/main/resources/Mernis.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(KPSPublic.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/mr.panda/IdeaProjects/hrms/src/main/resources/Mernis.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public KPSPublic(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public KPSPublic(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KPSPublic() {
        super(WSDL_LOCATION, SERVICE);
    }

    public KPSPublic(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public KPSPublic(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public KPSPublic(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap")
    public KPSPublicSoap getKPSPublicSoap() {
        return super.getPort(KPSPublicSoap, KPSPublicSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap")
    public KPSPublicSoap getKPSPublicSoap(WebServiceFeature... features) {
        return super.getPort(KPSPublicSoap, KPSPublicSoap.class, features);
    }


    /**
     *
     * @return
     *     returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap12")
    public KPSPublicSoap getKPSPublicSoap12() {
        return super.getPort(KPSPublicSoap12, KPSPublicSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap12")
    public KPSPublicSoap getKPSPublicSoap12(WebServiceFeature... features) {
        return super.getPort(KPSPublicSoap12, KPSPublicSoap.class, features);
    }

}
