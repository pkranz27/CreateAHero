package com.MakeAHero.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RaceController {
	@GetMapping(value="/race")
	public String getRace(){
		return"race";
	}
}
