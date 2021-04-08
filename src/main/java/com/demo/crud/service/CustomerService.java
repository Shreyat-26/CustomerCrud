package com.demo.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.models.Customer;
import com.demo.crud.respository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> findAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();  
		customerRepository.findAll().forEach(customers1 -> customers.add(customers1));
		return customers;
	}
}
