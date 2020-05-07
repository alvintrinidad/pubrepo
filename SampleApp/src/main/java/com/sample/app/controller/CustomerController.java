package com.sample.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.app.entity.Customer;
import com.sample.app.entity.ui.CustomerUI;
import com.sample.app.repository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepository repository;

	@GetMapping("/findall")
	public List<CustomerUI> findAll() {
		List<Customer> customers = repository.findAll();
		List<CustomerUI> customerUI = new ArrayList<>();
		for (Customer customer : customers) {
			CustomerUI cust = new CustomerUI();
			cust.setFirstName(customer.getFirstName());
			cust.setLastName(customer.getLastName());
			customerUI.add(cust);
		}
		return customerUI;
	}
}