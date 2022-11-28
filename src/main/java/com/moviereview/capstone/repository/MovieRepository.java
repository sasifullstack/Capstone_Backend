package com.moviereview.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviereview.capstone.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

	

}
