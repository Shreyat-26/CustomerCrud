package com.demo.crud.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crud.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
