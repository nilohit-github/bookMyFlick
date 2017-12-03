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

import com.process.businesslayer.ProcessMyRequest;
import com.process.businessprocessor.RequestProcessor;

public class ServiceImpl implements CustomerMovieOrdersPortType {
	
	
	List<MovieDetails> mdResponse ;
	@EJB
	RequestProcessor pmrl;
	

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
		RequestProcessor rp = new RequestProcessor();
		res = rp.findMyMovie(parameters);
		return res;
		
	}

	@Override
	public BookMyMovieResponse bookMyMovies(BookMyMovieRequest parameters) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
