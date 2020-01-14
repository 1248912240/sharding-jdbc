package com.cxytiandi.sharding.controller;

import com.cxytiandi.sharding.po.Desc;
import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.service.DescService;
import com.cxytiandi.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DescController {
	
	@Autowired
	private DescService descService;
	
	@GetMapping("/descs")
	public Object list() {
		return descService.list();
	}
	
	@GetMapping("/descAdd")
	public Object add() {
		for (long i = 0; i < 100; i++) {
			Desc user = new Desc();
			user.setId(i);
			user.setCity("深圳ddd");
			user.setName("李四ddd");
			descService.add(user);
		}
		return "success";
	}
	
	@GetMapping("/descs/{id}")
	public Object get(@PathVariable Long id) {
		return descService.findById(id);
	}
	
	@GetMapping("/descs/query")
	public Object get(String name) {
		return descService.findByName(name);
	}
	
}
