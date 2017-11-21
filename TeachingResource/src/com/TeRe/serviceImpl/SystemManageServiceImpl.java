package com.TeRe.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.TeRe.dao.SystemManageDao;
import com.TeRe.domain.User;
import com.TeRe.service.SystemManageService;

@Service("SystemManageService")
public class SystemManageServiceImpl implements SystemManageService {

	@Autowired
	private SystemManageDao systemMangeDao;

	@Override
	public void addUser(User user) {
		systemMangeDao.addUser(user);
	}

	@Override
	public User selectOne(String user_name){
		return systemMangeDao.selectOne(user_name);
	}

	@Override
	public List<User> selectAll() {
		return systemMangeDao.selectAll();
	}

	public void deteleUser(String user_name) {
		systemMangeDao.deteleUser(user_name);
	}

}
