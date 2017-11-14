package com.TeRe.controller;

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
	
}
