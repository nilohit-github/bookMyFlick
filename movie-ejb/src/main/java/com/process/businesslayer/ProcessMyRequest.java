package com.process.businesslayer;

import java.util.GregorianCalendar;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.nilohit.movies.MovieDetails;
import org.nilohit.movies.ShowAllMovieRequest;
import org.nilohit.movies.ShowAllMovieResponse;

/**
 * Session Bean implementation class ProcessMyRequest
 */
@Stateless
@LocalBean
public class ProcessMyRequest {

    /**
     * Default constructor. 
     */
	//ShowAllMovieResponse res = new ShowAllMovieResponse();
    public ProcessMyRequest() {
        // TODO Auto-generated constructor stub
    	
    	
    }
    
    public ShowAllMovieResponse findMyMovie(ShowAllMovieRequest x)
    {
    	ShowAllMovieResponse res = new ShowAllMovieResponse();
		MovieDetails md1 = new MovieDetails();
		
		md1.setId("1");
		md1.setMovieName("thor");
		GregorianCalendar gcal = new GregorianCalendar();
		XMLGregorianCalendar xgcal = null;
		try {
			xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(
					gcal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		md1.setReleaseDt(xgcal);

		res.getMovieDetails().add((MovieDetails)md1);
	
	return res;
    	
    }

}
