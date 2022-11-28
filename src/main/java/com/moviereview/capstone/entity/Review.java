package com.moviereview.capstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reviews")
public class Review {
    
	@Id
   // @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long review_id;
    
	private String review_det;
	
	
	private long  id;

    public Review() { 

    }

	public long getReview_id() {
		return review_id;
	}

	public void setReview_id(long review_id) {
		this.review_id = review_id;
	}

	public String getReview_det() {
		return review_det;
	}

	public void setReview_det(String review_det) {
		this.review_det = review_det;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}
