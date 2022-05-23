package com.MakeAHero.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.MakeAHero.Model.Hero;
import com.MakeAHero.Model.Item;
import com.MakeAHero.Model.Race;
import com.MakeAHero.Model.User;
import com.MakeAHero.Repository.HeroRepository;
import com.MakeAHero.Repository.RaceRepository;
import com.MakeAHero.Repository.UserRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class HeroService {
	@Autowired
	private HeroRepository heroRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RaceRepository raceRepository;
	@Autowired
	private UserService userService;
	    
	public List<Hero> findAll(){
	    return (List<Hero>) heroRepository.findAll();
	}
	public Hero findAllById(Long id) {
		return heroRepository.findAllById(id);
	};
	public void save(Hero hero) {
	    heroRepository.save(hero);
	}
	public Hero saveNewHero(Hero hero) {
	    
	    return heroRepository.save(hero);
	}
	public List<Hero> findAllByUser(User users) {
     List<Hero> heros = heroRepository.findAllByUserOrderByCreatedAtDesc(users);
        return heros;
    }
	public List<Hero> findAllByfirstname(Hero hero){
		return heroRepository.findAllByfirstname(hero);
	}
    public List<Hero> findAllByUsers(List<User> users){
        List<Hero> heros = heroRepository.findAllByUserInOrderByCreatedAtDesc(users);
        return heros;
    }
    public void deleteById(Long id) {
    	heroRepository.deleteById(id);
    }
    public Hero findByUser(User user) {
		return heroRepository.findByUser(user);
    	
    }
    public void decreaseInt(Hero hero) {  
    	 hero.setIntellegence(hero.getIntellegence() -1);
        hero.setSkillPoints(hero.getSkillPoints() +1);
        
       }

     public void increaseInt(Hero hero) {  
    	 hero.setIntellegence(hero.getIntellegence() +1);
         hero.setSkillPoints(hero.getSkillPoints() -1);
        
        
       }
     public void decreaseSkillPoint(Hero hero) {  
    	 hero.setSkillPoints(hero.getSkillPoints() -1);
        
       }
     public void increaseSkillPoint(Hero hero) {  
    	 hero.setSkillPoints(hero.getSkillPoints() +1);
        
       }
     public void decreaseMight(Hero hero) {  
    	 hero.setMight(hero.getMight() -1);
        
        
       }

     public void increaseMight(Hero hero) {  
    	 hero.setMight(hero.getMight()+1);	
     }
    public Hero findByRace(Race race) {
		return heroRepository.findByRace(race);
    	
    }
     public Hero getTotalStats(Hero hero, Race race) {
    	 hero = heroRepository.findByRace(race);
    	 hero.setIntellegence(hero.getIntellegence()+ race.getIntellegence());
    	 hero.setMight(hero.getMight()+race.getMight());
    	
		return hero;
     }
     public void updatePlayerInventory(Map<Item, Integer> playerInventory) {
 		User user = userService.getLoggedInUser();
 		userService.saveExisting(user);
 	}
	public Hero findAllByUsers(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(List<Hero> heros) {
		// TODO Auto-generated method stub
		
	}

	public void updatePlayerInventory(List<Item> playerInventory) {
		// TODO Auto-generated method stub
		
	}
}
