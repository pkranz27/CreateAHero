package com.MakeAHero.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MakeAHero.Model.Hero;
import com.MakeAHero.Model.User;
import com.MakeAHero.Repository.HeroRepository;
import com.MakeAHero.Service.HeroService;
import com.MakeAHero.Service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	@Autowired
	private HeroService heroService;
	

	@GetMapping(value= { "/"})
    public String getFeed(Model model, Hero hero ){
		User userHero = userService.getLoggedInUser();
        List<Hero> heros  = heroService.findAllByUser(userHero);
        model.addAttribute("heroList", heros);
        return "main";
    }
	@GetMapping(value= { "/delete/{id}"})
	public String delete(Model model, @PathVariable("id") Long id){
        heroService.deleteById(id);
	    return "redirect:/";
	}
}
