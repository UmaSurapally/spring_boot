package com.hellokoding.tutorials.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.tutorials.model.UserDetails;



public interface UserDetailsRepository extends JpaRepository<UserDetails, String>{

}
