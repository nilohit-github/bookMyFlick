
package org.nilohit.movies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for movieDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="movieDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="movieName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="releaseDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="synopsis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="favourite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imdb" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movieDetails", propOrder = {
    "id",
    "movieName",
    "releaseDt",
    "synopsis",
    "favourite",
    "imdb"
})
public class MovieDetails {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String movieName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar releaseDt;
    @XmlElement(required = true)
    protected String synopsis;
    protected boolean favourite;
    protected float imdb;

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
     * Gets the value of the movieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * Sets the value of the movieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieName(String value) {
        this.movieName = value;
    }

    /**
     * Gets the value of the releaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDt() {
        return releaseDt;
    }

    /**
     * Sets the value of the releaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDt(XMLGregorianCalendar value) {
        this.releaseDt = value;
    }

    /**
     * Gets the value of the synopsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * Sets the value of the synopsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynopsis(String value) {
        this.synopsis = value;
    }

    /**
     * Gets the value of the favourite property.
     * 
     */
    public boolean isFavourite() {
        return favourite;
    }

    /**
     * Sets the value of the favourite property.
     * 
     */
    public void setFavourite(boolean value) {
        this.favourite = value;
    }

    /**
     * Gets the value of the imdb property.
     * 
     */
    public float getImdb() {
        return imdb;
    }

    /**
     * Sets the value of the imdb property.
     * 
     */
    public void setImdb(float value) {
        this.imdb = value;
    }

}
