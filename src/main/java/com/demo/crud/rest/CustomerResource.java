package com.demo.crud.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
			System.out.print("hello");
			return customerService.findAllCustomers();
			
		}
		@GetMapping(path = "/{customernumber}", produces = "application/json")
		public Optional<Customer> getCustomer(@PathVariable int customernumber){
			System.out.print("get customer");
			return customerService.getCustomer(customernumber);
			
		}
		@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
		public Customer insertCustomer(@RequestBody Customer customer){
			System.out.print("hello");
			return customerService.insertCustomer(customer);
		}
		@PutMapping("/")
		public Customer updateCustomer(@RequestBody Customer customer){
			System.out.print("hello");
			return customerService.updateCustomer(customer);
		}
		
		@DeleteMapping(path = "/{customernumber}", produces = "application/json")
		public void deleteCustomer(@PathVariable int customernumber){
			System.out.print("get customer");
			 customerService.deleteCustomer(customernumber);	
		}
		
		@RequestMapping(value= "/test",method = RequestMethod.GET)
		public String test() {
	        return "hello";
	    }
}
