package org.nir.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	//step 1 : method to show the form
		@RequestMapping("/showForm")
		public String showForm(Model theModel)
		{
			//step 2: create a new Customer object
			Customer customer = new Customer();
			
			//Step 3: add this empty student object to the model
			theModel.addAttribute("customer" , customer);
			
			return "customer-form";
		}
		
		
		//step 2: method to process the form
		@RequestMapping("/processForm")
		public String processForm(@ModelAttribute("customer") Customer customer)
		{
			//log the input data
			System.out.println("the customer: " + customer.getFirstName() 
				+ " " + 	customer.getLastName());
			
			
			return "customer-confirmation";
		}

}
