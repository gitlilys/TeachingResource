package com.TeRe.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TeRe.dao.SystemManageDao;
import com.TeRe.domain.User;
import com.TeRe.service.SystemManageService;
import java.util.List;
@Service("SystemManageService")
public class SystemManageServiceImpl implements SystemManageService {

	@Autowired
	private SystemManageDao systemMangeDao;
	
	public boolean delete(int web_id) {  
        return systemMangeDao.delete(web_id);  
    }  
	
	@Override
	public void addUser(User user) {
		systemMangeDao.addUser(user);
	}
	 public boolean update(User user) {  
	        return systemMangeDao.update(user);  
	    } 
	 public List<User> findAll() {  
	        List<User> findAllList = systemMangeDao.findAll();  
	        return findAllList;  
	    }  
	    /**  
	     * 根据 id 查询 对应数据  
	     */  
	    public User findById(int web_id) {  
	        User user = systemMangeDao.findById(web_id);  
	        return user;  
	    }  

}
