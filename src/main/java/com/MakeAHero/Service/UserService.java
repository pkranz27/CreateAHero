package com.MakeAHero.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.MakeAHero.Model.Hero;
import com.MakeAHero.Model.User;
import com.MakeAHero.Repository.HeroRepository;
import com.MakeAHero.Repository.UserRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class UserService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private HeroRepository heroRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public User findByUsername(String username) {
	    return userRepository.findByUsername(username);
	}
	    
	public List<User> findAll(){
	    return (List<User>) userRepository.findAll();
	}
	    
	public void save(User user) {
	    userRepository.save(user);
	}
	public User saveNewUser(User user) {
	    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	    return userRepository.save(user);
	}
	public User getLoggedInUser() {
		return findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = findByUsername(username);
		if(user == null) throw new UsernameNotFoundException("Username not found");
		
		return user;
	}

	public void saveExisting(User user) {
		// TODO Auto-generated method stub
		
	}
}
