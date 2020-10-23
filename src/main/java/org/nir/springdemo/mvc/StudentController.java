package org.nir.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController
{
	//step 1 : method to show the form
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		//step 2: create a new Student object
		Student theStudent = new Student();
		
		//Step 3: add this empty student object to the model
		theModel.addAttribute("student" , theStudent);
		
		return "student-form";
	}
	
	
	//step 2: method to process the form
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		//log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() 
			+ " " + 	theStudent.getLastName());
		
		
		return "student-confirmation";
	}

}
