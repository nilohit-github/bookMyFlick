package com.movies.services.detail;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.nilohit.movies.MovieDetails;
import org.nilohit.movies.ShowAllMovieRequest;
import org.nilohit.movies.ShowAllMovieResponse;

public class Testclass {
	
	
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
