package com.moviereview.capstone.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moviereview.capstone.entity.Review;

@Repository

public interface ReviewRepository extends JpaRepository<Review,Long>{
	
	 List<Review> reviews=new ArrayList <>(); 

	    public static void addReview(Review r) {
	    	reviews.add(r);
	    }
	    
	    @Query("SELECT u from Review u where u.id=:id")
	    List<Review> findReviewsByMovieId(Long id);

	
	    


}
