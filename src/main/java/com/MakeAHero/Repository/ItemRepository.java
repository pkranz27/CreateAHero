package com.MakeAHero.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MakeAHero.Model.Item;
@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
	 List<Item>findByName(String name);
	 List<Item>findAll();
	 Item findById(long id);
}
