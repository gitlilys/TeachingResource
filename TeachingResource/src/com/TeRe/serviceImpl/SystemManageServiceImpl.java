package com.TeRe.serviceImpl;

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

}
