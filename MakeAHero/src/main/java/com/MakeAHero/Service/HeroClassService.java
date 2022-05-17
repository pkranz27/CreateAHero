package com.MakeAHero.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MakeAHero.Model.HeroClass;
import com.MakeAHero.Model.Race;
import com.MakeAHero.Repository.HeroClassRepository;
import com.MakeAHero.Repository.RaceRepository;
@Service
public class HeroClassService {
	@Autowired
	HeroClassRepository heroClassRepository;
	
	
	public List<HeroClass> findAll(){
	    return (List<HeroClass>) heroClassRepository.findAll();
	}
}
