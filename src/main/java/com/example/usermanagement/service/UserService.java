package com.example.usermanagement.service;

import com.example.usermanagement.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

	private List<User> users = new ArrayList<>();
	private Long idCounter = 1L;

	// Obtener lista de usuarios
	public List<User> getAllUsers() {
		return users;
	}
}
