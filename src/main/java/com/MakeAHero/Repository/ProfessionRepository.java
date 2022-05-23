package com.MakeAHero.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MakeAHero.Model.Profession;

@Repository
public interface ProfessionRepository extends CrudRepository<Profession, Long> {
	 List<Profession>findByName(String name);
	 List<Profession>findAll();
	 Profession findById(long id);
}
