package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;

@Service


public class UserService {
	@Autowired
private	UserRepository userRepository;
	public User createUser(User user)
	{
		return userRepository.save(user);
	}
	
	public List<User> createUser(List<User> users)
	{
		return userRepository.saveAll(users);
	}
	
	public User getUserById(int id)
	{
		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
		
	}
	
	


