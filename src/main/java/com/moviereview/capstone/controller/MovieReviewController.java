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
import org.springframework.web.bind.annotation.RestController;
import com.moviereview.capstone.entity.Movie;
import com.moviereview.capstone.repository.MovieRepository;
import com.moviereview.capstone.service.MovieReviewService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value="/api/v1")
public class MovieReviewController { 
	
	@Autowired
	private MovieRepository movieRepo;
	
	Logger log= LoggerFactory.getLogger(MovieReviewController.class);
	
	@Autowired
	private MovieReviewService movieReviewService;
	
	
	@PostMapping(value="/addMovie")
	public void addMovie(@RequestBody Movie v) {
		log.info("Inside Method addMovie");
        movieReviewService.addMovie(v);
       		movieRepo.save(v);
       log.info("Exiting Method addMovie");
	}
	
	@PutMapping(value="/updateMovie")
	public void updateMovie(@RequestBody Movie v) {
		
		 movieReviewService.updateMovie(v);
		movieRepo.save(v);
		
		
	}
	@DeleteMapping(value="/deleteMovie/{id}")
	public void deleteMovieById(@PathVariable("id")@RequestBody String id) {
	
		movieRepo.deleteById(Long.valueOf(id));
}
	
	@GetMapping(value="/listMovie")
	public List<Movie> listMovies() {
		 log.info("Inside Method listMovie");
		List<Movie> moviesList=movieRepo.findAll();
		 log.info("Exiting Method listMovie");
		return moviesList;
		
	}
	

}
