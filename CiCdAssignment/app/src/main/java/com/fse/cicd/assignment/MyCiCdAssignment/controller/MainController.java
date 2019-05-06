package com.fse.cicd.assignment.MyCiCdAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fse.cicd.assignment.MyCiCdAssignment.entity.User;
import com.fse.cicd.assignment.MyCiCdAssignment.repository.UserRepository;

@Controller
@RequestMapping(path="/sample")
public class MainController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User usr = new User();
		usr.setName(name);
		usr.setEmail(email);
		userRepository.save(usr);
		return "Data saved successfully";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

}
