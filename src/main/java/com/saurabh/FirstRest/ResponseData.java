package com.saurabh.FirstRest;

import java.util.ArrayList;
import java.util.List;

public class ResponseData 
{
    List<MovieRating> ratingList= new ArrayList<MovieRating>();
    List<Movie> listMovie=new ArrayList<Movie>();
 

	public List<Movie> getListMovie() {
		return listMovie;
	}

	public void setListMovie(List<Movie> listMovie) {
		this.listMovie = listMovie;
	}

	public List<MovieRating> getRatingList() {
		return ratingList;
	}

	public void setRatingList(List<MovieRating> ratingList) {
		this.ratingList = ratingList;
	}
    
}
