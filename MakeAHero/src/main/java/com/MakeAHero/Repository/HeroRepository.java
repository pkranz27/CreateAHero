package com.MakeAHero.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MakeAHero.Model.Hero;
import com.MakeAHero.Model.Item;
import com.MakeAHero.Model.Race;
import com.MakeAHero.Model.User;
@Repository
public interface HeroRepository extends CrudRepository<Hero, Long>{
	
	List<Hero> findAllByUserOrderByCreatedAtDesc(User user);
    List<Hero> findAllByUserInOrderByCreatedAtDesc(List<User> users);
    Hero findAllById(Long id);
    List<Hero> findAllByfirstname(Hero hero);
    List<Hero>findAllBylastName(Hero hero);
    List<Hero>findAllByUser(User user);
    Integer findByAge(Integer age);
    Hero findByUser(User user);
    Hero findByRace(Race race);
    
}
