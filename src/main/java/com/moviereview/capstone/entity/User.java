package com.moviereview.capstone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
    @Id
    private long id;
 
    private String username;

    public User() { 

    }

    public User(String username) {
        super();
        
      this.username = username;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
    	this.id = id;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;

    }
}
