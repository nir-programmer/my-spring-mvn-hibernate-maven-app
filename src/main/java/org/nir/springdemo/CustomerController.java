package org.nir.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController
{
	public String hello(Model model )
	{
		model.addAttribute("Hello World Nir SPRPING MVC");
		return "hello";
	}

}
