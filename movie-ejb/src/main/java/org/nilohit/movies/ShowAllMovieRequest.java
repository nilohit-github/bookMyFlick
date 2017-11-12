
package org.nilohit.movies;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showAllMovieRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="showAllMovieRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="theaterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showAllMovieRequest", propOrder = {
    "theaterId"
})
public class ShowAllMovieRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5564675454112073871L;
	@XmlElement(required = true)
    protected String theaterId;

    /**
     * Gets the value of the theaterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheaterId() {
        return theaterId;
    }

    /**
     * Sets the value of the theaterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheaterId(String value) {
        this.theaterId = value;
    }

}
