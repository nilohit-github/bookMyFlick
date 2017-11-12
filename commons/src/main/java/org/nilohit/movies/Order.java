
package org.nilohit.movies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="movieID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="theaterID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="movieDay" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "id",
    "movieID",
    "theaterID",
    "movieDay"
})
public class Order {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String movieID;
    @XmlElement(required = true)
    protected String theaterID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar movieDay;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the movieID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieID() {
        return movieID;
    }

    /**
     * Sets the value of the movieID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieID(String value) {
        this.movieID = value;
    }

    /**
     * Gets the value of the theaterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheaterID() {
        return theaterID;
    }

    /**
     * Sets the value of the theaterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheaterID(String value) {
        this.theaterID = value;
    }

    /**
     * Gets the value of the movieDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovieDay() {
        return movieDay;
    }

    /**
     * Sets the value of the movieDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovieDay(XMLGregorianCalendar value) {
        this.movieDay = value;
    }

}
