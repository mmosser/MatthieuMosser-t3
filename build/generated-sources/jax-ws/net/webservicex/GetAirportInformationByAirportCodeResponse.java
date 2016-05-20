
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getAirportInformationByAirportCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAirportInformationByAirportCodeResult"
})
@XmlRootElement(name = "getAirportInformationByAirportCodeResponse")
public class GetAirportInformationByAirportCodeResponse {

    protected String getAirportInformationByAirportCodeResult;

    /**
     * Obtient la valeur de la propriété getAirportInformationByAirportCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAirportInformationByAirportCodeResult() {
        return getAirportInformationByAirportCodeResult;
    }

    /**
     * Définit la valeur de la propriété getAirportInformationByAirportCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAirportInformationByAirportCodeResult(String value) {
        this.getAirportInformationByAirportCodeResult = value;
    }

}
