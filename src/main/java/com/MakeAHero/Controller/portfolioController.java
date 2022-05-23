package com.MakeAHero.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class portfolioController {
	@GetMapping(value="/portfolio")
	public String getHeroClasses(){
		return"portfolio";
	}
}
