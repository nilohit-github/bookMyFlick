package com.movies.services.detail;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.EJB;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.nilohit.movies.BookMyMovieRequest;
import org.nilohit.movies.BookMyMovieResponse;
import org.nilohit.movies.CancelMyMovieRequest;
import org.nilohit.movies.CancelMyMovieResponse;
import org.nilohit.movies.CustomerMovieOrdersPortType;
import org.nilohit.movies.MovieDetails;
import org.nilohit.movies.ShowAllMovieRequest;
import org.nilohit.movies.ShowAllMovieResponse;

//import com.bookMyFlick.businesslayer.ProcessMyRequestLocal;






public class ServiceImpl implements CustomerMovieOrdersPortType {
	
	
	//List<MovieDetails> mdResponse ;
	//@EJB
	//ProcessMyRequestLocal pmrl;
	

	@Override
	public CancelMyMovieResponse cancelMyMovies(CancelMyMovieRequest parameters) {
		// TODO Auto-generated method stub
		//test commit
		//test allll
		return null;
	}

	@Override
	public ShowAllMovieResponse getMovies(ShowAllMovieRequest parameters) {
		// TODO Auto-generated method stub
		String theater_id = parameters.getTheaterId();
		ShowAllMovieResponse res = new ShowAllMovieResponse();
	/*	if(!theater_id.isEmpty())
		{
			response = pmrl.findmovieList(parameters);
			
			
		      
			//	res.getMovieDetails().add((MovieDetails) mdResponse);
		}*/
		//return response;
		
		
			MovieDetails md1 = new MovieDetails();
			md1.setId("1");
			md1.setMovieName("secret superstar");
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

			res.getMovieDetails().add(md1);
		
		return res;
		
	}

	@Override
	public BookMyMovieResponse bookMyMovies(BookMyMovieRequest parameters) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
