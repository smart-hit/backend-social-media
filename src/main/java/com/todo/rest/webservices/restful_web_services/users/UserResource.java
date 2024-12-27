package com.todo.rest.webservices.restful_web_services.users;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	private UserDaoService service;
	public UserResource(UserDaoService service) {
		this.service=service;
	}
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	@GetMapping("/users/{id}")
	public User retrieveOneUser(@PathVariable int id){
		return service.findOne(id);
	}

	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		service.addUser(user);
	}

}