package com.moviereview.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereview.capstone.entity.Movie;
import com.moviereview.capstone.repository.MovieRepository;

@Service
public class MovieReviewService {
	
	@Autowired
	private MovieRepository movieRepo;

	public void addMovie(Movie v) {
		// TODO Auto-generated method stub
		movieRepo.save(v);
	}

	public void updateMovie(Movie v) {
		// TODO Auto-generated method stub
		//movieRepo.save(v);	
	}

	

}
