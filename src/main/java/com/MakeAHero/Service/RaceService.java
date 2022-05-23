package com.MakeAHero.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.MakeAHero.Model.Hero;
import com.MakeAHero.Model.Race;
import com.MakeAHero.Repository.RaceRepository;
@Service
public class RaceService {
	
	@Autowired
	RaceRepository raceRepository;
	
	
	public List<Race> findAll(){
	    return (List<Race>) raceRepository.findAll();
	}
	public Optional<Race> findById(Long id) {
		return raceRepository.findById(id);
	}
}
