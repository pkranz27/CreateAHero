package com.MakeAHero.Controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.MakeAHero.Model.Hero;
import com.MakeAHero.Model.Item;
import com.MakeAHero.Model.User;
import com.MakeAHero.Service.HeroService;
import com.MakeAHero.Service.ItemService;
import com.MakeAHero.Service.UserService;
@Controller
public class ItemController {
	@Autowired
	ItemService itemService;
	@Autowired
	HeroService heroService;
	@Autowired
	UserService userService;
	
	
	@GetMapping(value="/inventory")
	public String show( Model model) {
		 List<Item> item  = itemService.findAll();
	     model.addAttribute("itemlist", item);
		return"inventory";
	}
	

	
	
	@ModelAttribute("list")
	public List<Double>list(){
		return new ArrayList<>();
	}
	
}
