package com.my.service;

import com.my.po.User;


public interface UserService {

	User findUserByName(String id) throws Exception;
	
	void insert(User user) throws Exception;
	
	void update(User user) throws Exception;
	
	void delete(String id) throws Exception;
}
