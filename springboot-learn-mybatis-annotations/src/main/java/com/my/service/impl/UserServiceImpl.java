package com.my.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.dao.UserMapper;
import com.my.po.User;
import com.my.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findUserByName(String id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.findUserByName(id);
	}

	@Override
	public void insert(User user) throws Exception {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	@Override
	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

	@Override
	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		userMapper.delete(id);
	}

}
