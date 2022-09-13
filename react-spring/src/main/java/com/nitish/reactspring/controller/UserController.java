package com.nitish.reactspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nitish.reactspring.model.User;
import com.nitish.reactspring.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class UserController {

	@Autowired
	private UserRepository repo;

	@GetMapping("users")
	public List<User> getUsers() {
		System.out.println(repo.findAll());
		return repo.findAll();
	}

}
