package org.nir.springdemo.controller;

import java.util.List;

import org.nir.springdemo.dao.CustomerDAO;
import org.nir.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController 
{
	//need to inject the customer dao -spring will do this 
	@Autowired
	private CustomerDAO customerDAO ;
	
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel)
	{
		//get customers from  dao
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		//add the customers to the spring mvc model
		theModel.addAttribute("customers" , theCustomers);
		
		return "list-customers";
	}

}
