package com.sample.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sample.app.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
List<Customer> findByFirstName(String FirstName);
@Query(value = "SELECT * FROM customer", nativeQuery=true)
List<Customer> findAll();
}