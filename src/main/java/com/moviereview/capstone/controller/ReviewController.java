package com.moviereview.capstone.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.moviereview.capstone.entity.Review;
import com.moviereview.capstone.repository.ReviewRepository;
import com.moviereview.capstone.service.ReviewControllerService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value="/api/v1/reviews/")
public class ReviewController { 


	@Autowired
	private ReviewRepository reviewRepo;
	
	Logger log=LoggerFactory.getLogger(ReviewController.class);
	
	@Autowired
	 private ReviewControllerService reviewControllerService;
	  
	@PostMapping(value="/addReview")
	public void addReview(@RequestBody Review v) {
		 log.info("Inside Method addReview");
		reviewControllerService.addReview(v);
		reviewRepo.save(v);
		log.info("Exiting Method addReview");
}
	@GetMapping(value="/listReviews/{id}")
	public List<Review> listReviews(@PathVariable int id) {
		log.info("Inside Method listReview");
		List<Review> reviewsList=reviewRepo.findReviewsByMovieId(Long.valueOf(id));
		log.info("Exiting Method listReview");
		return reviewsList;
	}
		
		@PutMapping(value="/updateReview")
		public void updateReview(@RequestBody Review v) {
			log.info("Inside Method updateReview");
			reviewControllerService.updateReview(v);
			reviewRepo.save(v);
			log.info("Exiting Method updateReview");
}
		@DeleteMapping(value="/deleteReview/{id}")
		public void deleteReviewById(@PathVariable("id")@RequestBody String id) {
		
			reviewRepo.deleteById(Long.valueOf(id));
}
}
	


