package com.MakeAHero.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MakeAHero.Model.HeroClass;

@Repository
public interface HeroClassRepository extends CrudRepository<HeroClass, Long> {
	 List<HeroClass>findByName(String name);
	 List<HeroClass>findAll();
	 HeroClass findById(long id);
}
