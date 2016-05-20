
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CountryAbbrviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "countryAbbrviation"
})
@XmlRootElement(name = "getAirportInformationByISOCountryCode")
public class GetAirportInformationByISOCountryCode {

    @XmlElement(name = "CountryAbbrviation")
    protected String countryAbbrviation;

    /**
     * Obtient la valeur de la propriété countryAbbrviation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAbbrviation() {
        return countryAbbrviation;
    }

    /**
     * Définit la valeur de la propriété countryAbbrviation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAbbrviation(String value) {
        this.countryAbbrviation = value;
    }

}
