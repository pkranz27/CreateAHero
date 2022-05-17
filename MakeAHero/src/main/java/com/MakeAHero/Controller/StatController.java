package com.MakeAHero.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.MakeAHero.Model.Hero;
import com.MakeAHero.Model.Item;
import com.MakeAHero.Model.User;
import com.MakeAHero.Service.HeroService;
import com.MakeAHero.Service.UserService;
@Controller
public class StatController {
	
	@Autowired
    private HeroService heroService;

	@Autowired
	private UserService userService;
	
	
	@GetMapping(value= { "/stats"})
    public String getFeed(Model model, Hero hero){
		User userHero = userService.getLoggedInUser();
        List<Hero> heros  = heroService.findAllByUser(userHero);
        model.addAttribute("heroList", heros);
        return "stats";
    }

}
