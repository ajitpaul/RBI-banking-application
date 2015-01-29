
package pack1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pack1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Depositrule_QNAME = new QName("http://pack1/", "depositrule");
    private final static QName _DepositruleResponse_QNAME = new QName("http://pack1/", "depositruleResponse");
    private final static QName _WdrawlowResponse_QNAME = new QName("http://pack1/", "wdrawlowResponse");
    private final static QName _Webrule_QNAME = new QName("http://pack1/", "webrule");
    private final static QName _WebruleResponse_QNAME = new QName("http://pack1/", "webruleResponse");
    private final static QName _FundruleResponse_QNAME = new QName("http://pack1/", "fundruleResponse");
    private final static QName _Amdate_QNAME = new QName("http://pack1/", "amdate");
    private final static QName _Fundrule_QNAME = new QName("http://pack1/", "fundrule");
    private final static QName _AmdateResponse_QNAME = new QName("http://pack1/", "amdateResponse");
    private final static QName _Wdrawlow_QNAME = new QName("http://pack1/", "wdrawlow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pack1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Webrule }
     * 
     */
    public Webrule createWebrule() {
        return new Webrule();
    }

    /**
     * Create an instance of {@link WdrawlowResponse }
     * 
     */
    public WdrawlowResponse createWdrawlowResponse() {
        return new WdrawlowResponse();
    }

    /**
     * Create an instance of {@link DepositruleResponse }
     * 
     */
    public DepositruleResponse createDepositruleResponse() {
        return new DepositruleResponse();
    }

    /**
     * Create an instance of {@link Depositrule }
     * 
     */
    public Depositrule createDepositrule() {
        return new Depositrule();
    }

    /**
     * Create an instance of {@link WebruleResponse }
     * 
     */
    public WebruleResponse createWebruleResponse() {
        return new WebruleResponse();
    }

    /**
     * Create an instance of {@link FundruleResponse }
     * 
     */
    public FundruleResponse createFundruleResponse() {
        return new FundruleResponse();
    }

    /**
     * Create an instance of {@link Amdate }
     * 
     */
    public Amdate createAmdate() {
        return new Amdate();
    }

    /**
     * Create an instance of {@link Fundrule }
     * 
     */
    public Fundrule createFundrule() {
        return new Fundrule();
    }

    /**
     * Create an instance of {@link Wdrawlow }
     * 
     */
    public Wdrawlow createWdrawlow() {
        return new Wdrawlow();
    }

    /**
     * Create an instance of {@link AmdateResponse }
     * 
     */
    public AmdateResponse createAmdateResponse() {
        return new AmdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Depositrule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "depositrule")
    public JAXBElement<Depositrule> createDepositrule(Depositrule value) {
        return new JAXBElement<Depositrule>(_Depositrule_QNAME, Depositrule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositruleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "depositruleResponse")
    public JAXBElement<DepositruleResponse> createDepositruleResponse(DepositruleResponse value) {
        return new JAXBElement<DepositruleResponse>(_DepositruleResponse_QNAME, DepositruleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WdrawlowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "wdrawlowResponse")
    public JAXBElement<WdrawlowResponse> createWdrawlowResponse(WdrawlowResponse value) {
        return new JAXBElement<WdrawlowResponse>(_WdrawlowResponse_QNAME, WdrawlowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Webrule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "webrule")
    public JAXBElement<Webrule> createWebrule(Webrule value) {
        return new JAXBElement<Webrule>(_Webrule_QNAME, Webrule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebruleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "webruleResponse")
    public JAXBElement<WebruleResponse> createWebruleResponse(WebruleResponse value) {
        return new JAXBElement<WebruleResponse>(_WebruleResponse_QNAME, WebruleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FundruleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "fundruleResponse")
    public JAXBElement<FundruleResponse> createFundruleResponse(FundruleResponse value) {
        return new JAXBElement<FundruleResponse>(_FundruleResponse_QNAME, FundruleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "amdate")
    public JAXBElement<Amdate> createAmdate(Amdate value) {
        return new JAXBElement<Amdate>(_Amdate_QNAME, Amdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fundrule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "fundrule")
    public JAXBElement<Fundrule> createFundrule(Fundrule value) {
        return new JAXBElement<Fundrule>(_Fundrule_QNAME, Fundrule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "amdateResponse")
    public JAXBElement<AmdateResponse> createAmdateResponse(AmdateResponse value) {
        return new JAXBElement<AmdateResponse>(_AmdateResponse_QNAME, AmdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wdrawlow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pack1/", name = "wdrawlow")
    public JAXBElement<Wdrawlow> createWdrawlow(Wdrawlow value) {
        return new JAXBElement<Wdrawlow>(_Wdrawlow_QNAME, Wdrawlow.class, null, value);
    }

}
