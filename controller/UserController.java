package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.model.User;
import com.example.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getUser")
	public List<User> getUserDetails() {
		System.out.println("This is test");
		return userService.getUserDetails();
	}

	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {
		// make a call to service class
		// write logic to save
		Integer id = userService.saveUser(user);
		return (id > 0 ? "User saved !!" : "User Not Saved");
	}
}
