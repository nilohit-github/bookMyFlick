
package org.nilohit.movies;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.nilohit.movies package. 
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

    private final static QName _BookMyMovieResponse_QNAME = new QName("http://www.nilohit.org/movies/", "bookMyMovieResponse");
    private final static QName _BookMyMovieRequest_QNAME = new QName("http://www.nilohit.org/movies/", "bookMyMovieRequest");
    private final static QName _ShowAllMovieResponse_QNAME = new QName("http://www.nilohit.org/movies/", "showAllMovieResponse");
    private final static QName _CancelMyMovieRequest_QNAME = new QName("http://www.nilohit.org/movies/", "cancelMyMovieRequest");
    private final static QName _CancelMyMovieResponse_QNAME = new QName("http://www.nilohit.org/movies/", "cancelMyMovieResponse");
    private final static QName _ShowAllMovieRequest_QNAME = new QName("http://www.nilohit.org/movies/", "showAllMovieRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.nilohit.movies
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookMyMovieRequest }
     * 
     */
    public BookMyMovieRequest createBookMyMovieRequest() {
        return new BookMyMovieRequest();
    }

    /**
     * Create an instance of {@link BookMyMovieResponse }
     * 
     */
    public BookMyMovieResponse createBookMyMovieResponse() {
        return new BookMyMovieResponse();
    }

    /**
     * Create an instance of {@link ShowAllMovieRequest }
     * 
     */
    public ShowAllMovieRequest createShowAllMovieRequest() {
        return new ShowAllMovieRequest();
    }

    /**
     * Create an instance of {@link CancelMyMovieResponse }
     * 
     */
    public CancelMyMovieResponse createCancelMyMovieResponse() {
        return new CancelMyMovieResponse();
    }

    /**
     * Create an instance of {@link CancelMyMovieRequest }
     * 
     */
    public CancelMyMovieRequest createCancelMyMovieRequest() {
        return new CancelMyMovieRequest();
    }

    /**
     * Create an instance of {@link ShowAllMovieResponse }
     * 
     */
    public ShowAllMovieResponse createShowAllMovieResponse() {
        return new ShowAllMovieResponse();
    }

    /**
     * Create an instance of {@link MovieDetails }
     * 
     */
    public MovieDetails createMovieDetails() {
        return new MovieDetails();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookMyMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nilohit.org/movies/", name = "bookMyMovieResponse")
    public JAXBElement<BookMyMovieResponse> createBookMyMovieResponse(BookMyMovieResponse value) {
        return new JAXBElement<BookMyMovieResponse>(_BookMyMovieResponse_QNAME, BookMyMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookMyMovieRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nilohit.org/movies/", name = "bookMyMovieRequest")
    public JAXBElement<BookMyMovieRequest> createBookMyMovieRequest(BookMyMovieRequest value) {
        return new JAXBElement<BookMyMovieRequest>(_BookMyMovieRequest_QNAME, BookMyMovieRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nilohit.org/movies/", name = "showAllMovieResponse")
    public JAXBElement<ShowAllMovieResponse> createShowAllMovieResponse(ShowAllMovieResponse value) {
        return new JAXBElement<ShowAllMovieResponse>(_ShowAllMovieResponse_QNAME, ShowAllMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelMyMovieRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nilohit.org/movies/", name = "cancelMyMovieRequest")
    public JAXBElement<CancelMyMovieRequest> createCancelMyMovieRequest(CancelMyMovieRequest value) {
        return new JAXBElement<CancelMyMovieRequest>(_CancelMyMovieRequest_QNAME, CancelMyMovieRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelMyMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nilohit.org/movies/", name = "cancelMyMovieResponse")
    public JAXBElement<CancelMyMovieResponse> createCancelMyMovieResponse(CancelMyMovieResponse value) {
        return new JAXBElement<CancelMyMovieResponse>(_CancelMyMovieResponse_QNAME, CancelMyMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllMovieRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nilohit.org/movies/", name = "showAllMovieRequest")
    public JAXBElement<ShowAllMovieRequest> createShowAllMovieRequest(ShowAllMovieRequest value) {
        return new JAXBElement<ShowAllMovieRequest>(_ShowAllMovieRequest_QNAME, ShowAllMovieRequest.class, null, value);
    }

}
