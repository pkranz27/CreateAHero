package com.MakeAHero.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MakeAHero.Model.Hero;
import com.MakeAHero.Model.User;
import com.MakeAHero.Repository.UserRepository;
import com.MakeAHero.Service.HeroService;
import com.MakeAHero.Service.UserService;
@RestController
public class ResponseEntityController {
	@Autowired
	UserService userService;
	
	@Autowired
	HeroService heroService;
	
	@PostMapping("/User")
	public ResponseEntity<Void> createUser(@RequestBody @Valid User user, 
	                                            BindingResult bindingResult){
	    if (userService.findByUsername(user.getUsername()) != null){
	        bindingResult.rejectValue("Not a Valid Username", "error.username", "Username is already taken");
	    }
	    if (bindingResult.hasErrors()) {
	        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }
	    userService.save(user);
	    return new ResponseEntity<>(HttpStatus.CREATED);
	}
	// to be made  postUserHero, statUpgrade(Level up Post), any user searchRequest
	
}	
