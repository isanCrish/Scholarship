package com.faith.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.faith.demo.dao.IUserRepository;
import com.faith.demo.entity.User;

public class UserService implements IUserService {
	
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User findUserByNameAndPassword(String userName, String password) {
		
		User user = userRepository.findUserByUsernameAndPassword(userName, password);
		
		//condition check
		if(userName.equals(user.getUserName()) && password.equals(user.getPassword())){
			return user;
		}else {
		
		return null;
		}
	}

}
