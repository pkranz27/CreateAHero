package com.MakeAHero.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfessionController {
	@GetMapping(value="/heroclasses")
	public String getHeroClasses(){
		return"heroclasses";
	}
}
