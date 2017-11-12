package com.process.businesslayer;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.nilohit.movies.ShowAllMovieRequest;

/**
 * Session Bean implementation class ProcessMyRequest
 */
@Stateless
@LocalBean
public class ProcessMyRequest {

    /**
     * Default constructor. 
     */
    public ProcessMyRequest() {
        // TODO Auto-generated constructor stub
    }
    
    public void findMyMovie(ShowAllMovieRequest x)
    {
    	
    }

}
