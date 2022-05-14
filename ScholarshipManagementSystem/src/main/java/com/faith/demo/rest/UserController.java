package com.faith.demo.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.demo.entity.User;
import com.faith.demo.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {
	
	//field injection
	private IUserService userService;
	
	@GetMapping("/users/{userName}&{password}")
	public User findUserByNameAndPassword(@PathVariable String userName,@PathVariable String password) {
		return userService.findUserByNameAndPassword(userName, password);
		
	}

}
