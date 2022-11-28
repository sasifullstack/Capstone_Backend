package com.moviereview.capstone.service;

import org.springframework.stereotype.Service;

import com.moviereview.capstone.entity.Review;

@Service
public class ReviewControllerService {

	public void addReview(Review v) {
		// TODO Auto-generated method stub
		ReviewRepo.save(v);
	}
     
	public void updateReview(Review v) {
		
	}
}
