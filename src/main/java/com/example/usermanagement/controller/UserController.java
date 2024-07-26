package com.example.usermanagement.controller;

import com.example.usermanagement.models.User;
import com.example.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	// Obtener lista de usuarios
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
}