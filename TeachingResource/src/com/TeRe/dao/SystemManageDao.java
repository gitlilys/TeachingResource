package com.TeRe.dao;

import java.util.List;
import java.util.Map;

import com.TeRe.domain.User;

public interface SystemManageDao {

	void addUser(User user);
	
	User selectOne(String user_name);

     List<User> selectAll();

	void deteleUser(String user_name);
}
