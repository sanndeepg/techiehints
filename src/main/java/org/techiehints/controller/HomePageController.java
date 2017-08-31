package org.techiehints.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "samples")
public class HomePageController {

	@RequestMapping(value = "my/home.page")
	public String getHomePage ( ) {
		return "home";
	}
	
}
