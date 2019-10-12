package com.micro.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.feign.ProfesServiceClientFeign;
import com.micro.model.Item;
import com.micro.model.Profes;
import com.micro.service.ItemService;

@Service("itemServiceFeign")
public class ItemServiceFeign implements ItemService{
	
	@Autowired
	private ProfesServiceClientFeign profesServiceClientFeign;
	
	@Override
	public List<Item> getAll(){
	
		List<Profes> profes = profesServiceClientFeign.getList();
		return profes.stream().map(prof -> new Item(prof,1)).collect(Collectors.toList());
	}
	
	@Override
	public Item finById(Long id,Integer Numero) {
		return new Item(profesServiceClientFeign.getById(id), Numero);
	}

}
