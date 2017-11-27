package com.TeRe.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.TeRe.Utils.BaseUtils;
import com.TeRe.domain.User;
import com.TeRe.service.SystemManageService;

@Controller
public class SystemManageController {

	@Autowired
	private SystemManageService systemManageService;

	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/TeRe/regester")
	public String regester(HttpServletRequest request, HttpServletResponse response){
		User user = new User();
		String username = request.getParameter("name");
		String password = request.getParameter("password") + "{" + username + "}";
		user.setUser_id(BaseUtils.getUUID());		
		user.setUser_name(username);
		user.setUser_password(BaseUtils.enCode(password));
		user.setUser_role(1);
		user.setUser_enable(0);
		systemManageService.addUser(user);

		return "redirect:/success.jsp";
	}
	
	@RequestMapping(value="/TeRe/add")
	public String add(HttpServletRequest request, HttpServletResponse response){
		User user = new User();
		String username = request.getParameter("name");
		String password = request.getParameter("password") + "{" + username + "}";
		String role1 = request.getParameter("role");
		int	role = Integer.parseInt(role1);
		Date creatDate = new Date();
		user.setUser_id(BaseUtils.getUUID());		
		user.setUser_name(username);
		user.setUser_password(BaseUtils.enCode(password));
		user.setUser_role(role);
		user.setUser_cretetime(creatDate);
		user.setUser_enable(1);
		systemManageService.addUser(user);
		
		return "redirect:/success.jsp";
	}
	
	
	@RequestMapping(value="/TeRe/select111")
	public String select111(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("username");
		System.out.println(name);
		User user = systemManageService.selectOne(name);
		System.out.println(user);
		request.setAttribute("user", user);
		return null;
	}
	
	@RequestMapping(value="/TeRe/selectAll")
	public String selectAll(HttpServletRequest request, HttpServletResponse response){
		List<User> users = systemManageService.selectAll();
		request.setAttribute("users", users);
		
		return "forward:/selectAllList.jsp";
	}
	
	
	@RequestMapping(value="/TeRe/deteleUser")
	public String deteleUser(HttpServletRequest request, HttpServletResponse response){
		String user_name = request.getParameter("user_name");
		systemManageService.deteleUser(user_name);
		return "redirect:/success.jsp";
	}
	

}
