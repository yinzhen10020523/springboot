package com.my.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.po.User;
import com.my.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userServiceImpl;

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable String id) throws Exception{
	
		return userServiceImpl.findUserByName(id);
	}
	
	@PostMapping("/users")
	public String addUsers(User user) throws Exception{
	
		userServiceImpl.insert(user);
		return "模拟添加："+user.toString();
	}
	
	@PutMapping("/users")
	public String updateUserById(User user) throws Exception{
		userServiceImpl.update(user);
		return "模拟更新："+user.toString();
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable String id) throws Exception{
		userServiceImpl.delete(id);
		return "模拟删除 ："+id;
	}
}
