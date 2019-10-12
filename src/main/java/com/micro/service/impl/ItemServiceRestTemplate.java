package com.micro.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.micro.model.Item;
import com.micro.model.Profes;
import com.micro.service.ItemService;

@Service("itemServiceRestTemplate")
public class ItemServiceRestTemplate implements ItemService{
	
	@Autowired
	private RestTemplate clientRest;
	
	public List<Item> getAll(){
		
		List<Profes> profes = Arrays.asList(clientRest.getForObject("http://localhost:10080/list", Profes[].class));
		return profes.stream().map(prof -> new Item(prof,1)).collect(Collectors.toList());
	}

	
	public Item finById(Long id, Integer Numero) {
		Map<String,String> pathVariable = new HashMap<>();
		pathVariable.put("id", id.toString());
		Profes profe = clientRest.getForObject("http://localhost:10080/{id}", Profes.class, pathVariable);
		return new Item(profe, Numero);
	}


}
