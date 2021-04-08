package com.demo.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public Optional<Customer> getCustomer(int customernumber) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customernumber);
	}

	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	public void deleteCustomer(int customernumber) {
		// TODO Auto-generated method stub
		 customerRepository.deleteById(customernumber);
	}

	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
}
