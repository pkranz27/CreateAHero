package com.MakeAHero.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MakeAHero.Model.Profession;
import com.MakeAHero.Model.Race;

import com.MakeAHero.Repository.ProfessionRepository;
import com.MakeAHero.Repository.RaceRepository;
@Service
public class ProfessionService {
	@Autowired
	ProfessionRepository professionRepository;
	
	
	public List<Profession> findAll(){
	    return (List<Profession>) professionRepository.findAll();
	}
}
