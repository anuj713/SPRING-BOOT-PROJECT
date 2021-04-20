package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	@PostMapping("/addusers")
	public List<User> addUsers(@RequestBody List<User> users)
	{
		return userService.createUser(users);
	}
	
	
	@GetMapping("/user/{id}")
	public User getUserByid(@PathVariable int id) {

		return userService.getUserById(id);

	}
	@GetMapping("/users")
	public List<User> getAllusers()
	{
		return userService.getUsers();
	}

}