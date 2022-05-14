package com.faith.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.demo.entity.User;

public interface IUserRepository extends CrudRepository<User, Integer> {
	
	//Custom Method using JPQL in Repository
		@Query("From User WHERE userName=?1 AND password=?2 AND isActive=true")
		public User findUserByUsernameAndPassword(String userName, String password);

}
