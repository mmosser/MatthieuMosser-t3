
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
 *         &lt;element name="getAirportInformationByISOCountryCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getAirportInformationByISOCountryCodeResult"
})
@XmlRootElement(name = "getAirportInformationByISOCountryCodeResponse")
public class GetAirportInformationByISOCountryCodeResponse {

    protected String getAirportInformationByISOCountryCodeResult;

    /**
     * Obtient la valeur de la propriété getAirportInformationByISOCountryCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAirportInformationByISOCountryCodeResult() {
        return getAirportInformationByISOCountryCodeResult;
    }

    /**
     * Définit la valeur de la propriété getAirportInformationByISOCountryCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAirportInformationByISOCountryCodeResult(String value) {
        this.getAirportInformationByISOCountryCodeResult = value;
    }

}
