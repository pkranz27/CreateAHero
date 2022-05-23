package com.MakeAHero.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MakeAHero.Model.Item;
import com.MakeAHero.Model.Race;
import com.MakeAHero.Model.User;
@Repository
public interface RaceRepository extends CrudRepository<Race, Long>{
	 List<Race>findByName(String name);
	 List<Race>findAll();
	 Optional<Race> findById(Long id);
	 
}
