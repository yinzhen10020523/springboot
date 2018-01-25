package com.my.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.po.User;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<User> getUsers(){
		
		List<User> list = new ArrayList<User>();
		list.add(new User("1", "明羽", 23, "北京巴拿马"));
		list.add(new User("2", "小挪", 23, "北京巴拿马"));
		return list;
	}
	
	@GetMapping("/users/{id}")
	public String getUserById(@PathVariable String id){
	
		return "模拟获取用户通过id："+id;
	}
	
	@PostMapping("/users")
	public String addUsers(User user){
	
		return "模拟添加："+user.toString();
	}
	
	@PutMapping("/users")
	public String updateUserById(User user){
	
		return "模拟更新："+user.toString();
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable String id){
	
		return "模拟删除 ："+id;
	}
}
