package com.demo.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.models.Customer;
import com.demo.crud.service.CustomerService;

@RestController
@RequestMapping(path = "/customer")
public class CustomerResource {

		@Autowired
		CustomerService customerService;
		
		@GetMapping(path = "/", produces = "application/json")
		public List<Customer> getAllCustomers(){
			//CustomerService customerService= new CustomerService();
			System.out.print("hello");
			return customerService.findAllCustomers();
			
		}
		
		@RequestMapping(value= "/test",method = RequestMethod.GET)
		public String test() {
		//	System.out.println(productServiceImpl.findAll());
	        return "hello";
	    }
}
