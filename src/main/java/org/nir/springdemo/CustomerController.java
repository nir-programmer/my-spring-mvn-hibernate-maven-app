package org.nir.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomerController
{
	@RequestMapping("/hello")
	public String hello(Model model )
	{
		model.addAttribute("message" , "Hello World Nir SPRPING MVC");
		return "hello";
	}

}
