package com.faith.demo.service;

import com.faith.demo.entity.User;

public interface IUserService {
	
	//Custom Method using JPQL-in User Repository
		public User findUserByNameAndPassword(String userName, String password);

}
