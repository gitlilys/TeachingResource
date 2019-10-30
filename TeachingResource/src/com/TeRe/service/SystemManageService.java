package com.TeRe.service;

import com.TeRe.domain.User;
import java.util.List;

public interface SystemManageService {

	public void addUser(User user);
	boolean update(User user);  
    boolean delete(int web_id);
    User findById(int web_id);  
    List<User> findAll();

}
