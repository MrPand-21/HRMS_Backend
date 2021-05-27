
package tr.gov.nvi.tckimlik.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TCKimlikNoDogrulaResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tcKimlikNoDogrulaResult"
})
@XmlRootElement(name = "TCKimlikNoDogrulaResponse")
public class TCKimlikNoDogrulaResponse {

    @XmlElement(name = "TCKimlikNoDogrulaResult")
    protected boolean tcKimlikNoDogrulaResult;

    /**
     * Gets the value of the tcKimlikNoDogrulaResult property.
     * 
     */
    public boolean isTCKimlikNoDogrulaResult() {
        return tcKimlikNoDogrulaResult;
    }

    /**
     * Sets the value of the tcKimlikNoDogrulaResult property.
     * 
     */
    public void setTCKimlikNoDogrulaResult(boolean value) {
        this.tcKimlikNoDogrulaResult = value;
    }

}
