package com.micro.service;

import java.util.List;

import com.micro.model.Item;

public interface ItemService {
	
	public List<Item> getAll();
	public Item finById(Long id,Integer Numero);

}
