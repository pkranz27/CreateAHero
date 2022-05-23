package com.MakeAHero.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MakeAHero.Model.Item;

import com.MakeAHero.Repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepository;
	public List<Item> findAll(){
		return itemRepository.findAll();
	}
	public Item findById(long id) {
		return itemRepository.findById(id);
	}

	public void save(Item item) {
		itemRepository.save(item);
	}
	public void deleteById(long id) {
		itemRepository.deleteById(id);
	}

	
	
}
