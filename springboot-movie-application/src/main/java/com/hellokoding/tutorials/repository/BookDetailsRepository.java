package com.hellokoding.tutorials.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.tutorials.model.BookingDetails.BookDetails;



public interface BookDetailsRepository extends JpaRepository<BookDetails, Integer>{

}
