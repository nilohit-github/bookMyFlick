
package org.nilohit.movies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookMyMovieResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookMyMovieResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookMovieResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookMyMovieResponse", propOrder = {
    "bookMovieResponse"
})
public class BookMyMovieResponse {

    protected boolean bookMovieResponse;

    /**
     * Gets the value of the bookMovieResponse property.
     * 
     */
    public boolean isBookMovieResponse() {
        return bookMovieResponse;
    }

    /**
     * Sets the value of the bookMovieResponse property.
     * 
     */
    public void setBookMovieResponse(boolean value) {
        this.bookMovieResponse = value;
    }

}
