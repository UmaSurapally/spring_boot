package com.hellokoding.tutorials.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.tutorials.model.MovieDetails;



public interface MovieDetailsRepository extends JpaRepository<MovieDetails, Integer>{

}
