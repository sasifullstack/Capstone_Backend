package com.moviereview.capstone.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="movie")
public class Movie {
	@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    public long id;

    @NonNull
	@Column(name="name")
    private String name;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="id")
    List<Review> reviews=new ArrayList <>();
   
    public void addReview(Review r) {
    	reviews.add(r);
    }

    public Movie() {

    }

    public Movie(String name) {

        super();
     this.name = name;

    }

    public long getId() {

        return id;

    }
    public void setId(long id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }
   
    	 
    }
