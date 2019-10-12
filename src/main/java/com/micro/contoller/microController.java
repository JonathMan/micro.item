package com.micro.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.model.Item;
import com.micro.service.ItemService;

@RestController
public class microController {

	
	@Autowired(required = true)
	@Qualifier("itemServiceFeign")
	private ItemService itemservice;
	
	@GetMapping("/list")
	public List<Item> getAll(){
		
		return itemservice.getAll();
	}
	
	@GetMapping("/{id}/{Numero}")
	public Item getById(@PathVariable Long id,@PathVariable Integer Numero) {
		return itemservice.finById(id, Numero);
	}
}
