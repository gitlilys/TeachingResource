package com.TeRe.service;

import java.util.List;
import java.util.Map;

import com.TeRe.domain.User;

public interface SystemManageService {

	public void addUser(User user);

	public User selectOne(String user_name);
	
	public List<User> selectAll();
	
	public void deteleUser(String user_name);
}
