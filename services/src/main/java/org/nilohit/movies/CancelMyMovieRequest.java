
package org.nilohit.movies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelMyMovieRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelMyMovieRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelMyMovieRequest", propOrder = {
    "cancelID"
})
public class CancelMyMovieRequest {

    @XmlElement(required = true)
    protected String cancelID;

    /**
     * Gets the value of the cancelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelID() {
        return cancelID;
    }

    /**
     * Sets the value of the cancelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelID(String value) {
        this.cancelID = value;
    }

}
