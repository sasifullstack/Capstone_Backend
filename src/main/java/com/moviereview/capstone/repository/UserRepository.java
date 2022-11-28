package com.moviereview.capstone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviereview.capstone.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
