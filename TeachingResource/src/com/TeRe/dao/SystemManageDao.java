package com.TeRe.dao;

import java.util.List;

import com.TeRe.domain.User;

public interface SystemManageDao {

	void addUser(User user);
	 boolean update(User user);    
	 boolean delete(int web_id);
	 User findById(int web_id);  
	 List<User> findAll();

}
