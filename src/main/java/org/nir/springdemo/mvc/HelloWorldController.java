package org.nir.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController 
{
	//Step 1:
	//need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
		//return "processForm";
	}
	
	
	//Step 2: create helloworld-form file
	
	//Step 3
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	
	
	//Step 4: Ceate helloworld.jsp file
	
	
	/////////////////////////////////////////////////////////////
	
	//add a new controller method to read form data and add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request , Model model)
	{
		//read the request paramter from the HTML file
		String name = request.getParameter("studentName");
		
		//convert it to upper
		String res = name.toUpperCase();
		
		//append
		res  = "Yo" +  res;
		
		//add message to the model 
		model.addAttribute("message" , res);
		
	
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeVersionThree(@RequestParam("studentName") String theName , Model model)
	{
		/*
		 * //read the request paramter from the HTML file String name =
		 * request.getParameter("studentName");
		 */
		
		//convert it to upper
		String res = theName.toUpperCase();
		
		//append
		res  = "Hey My Friend from v3!" +  res;
		
		//add message to the model 
		model.addAttribute("message" , res);
		
	
		return "helloworld";
	}
}
