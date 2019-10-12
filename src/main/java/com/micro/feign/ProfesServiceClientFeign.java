package com.micro.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.micro.model.Profes;

@FeignClient(name = "Profes-service", url = "localhost:10010")
public interface ProfesServiceClientFeign {

	
	@GetMapping("/list")
	public List<Profes> getList();
	
	@GetMapping("/{id}")
	public Profes getById(@PathVariable Long Id);
}
