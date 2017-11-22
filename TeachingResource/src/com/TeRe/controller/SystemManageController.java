package com.TeRe.controller;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;  
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.TeRe.Utils.BaseUtils;
import com.TeRe.domain.User;
import com.TeRe.service.SystemManageService;
import java.util.List;
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
	@RequestMapping(value="/toAddUser")  
    public String toAddUser(){  
        return "redirect:/addWeb.jsp";  
    }  
	 @RequestMapping(value="/updateUser")  
	    public String updateUser(User user,HttpServletRequest request,Model model){  
	        if(systemManageService.update(user)){  
	            user = systemManageService.findById(user.getWeb_id());  
	            request.setAttribute("user", user);  
	            model.addAttribute("user", user);  
	            return "redirect:/getAllUser";  
	        }else{  
	            return "/error";  
	        }  
	    }
	 
	 @RequestMapping(value="/getAllUser")  
	    public String getAllUser(HttpServletRequest request,Model model){  
	        List<User> user = systemManageService.findAll();  
	        model.addAttribute("userList", user);  
	        request.setAttribute("userList", user);  
	        return "redirect:/allWeb.jsp";  
	    } 
	 
	 @RequestMapping(value="/addUser")  
	    public String addUser(User user,Model model){  
		 systemManageService.addUser(user);  
	        return "redirect:/getAllUser";  
	    } 
	 
	 @RequestMapping(value="/getUser")  
	    public String getUser(int web_id,HttpServletRequest request,Model model){  
	        request.setAttribute("user", systemManageService.findById(web_id));  
	        model.addAttribute("user", systemManageService.findById(web_id));  
	        return "redirect:/editWeb.jsp";  
	    } 
	 
	 @RequestMapping(value="/delUser")  
	    public void delUser(int web_id,HttpServletRequest request,HttpServletResponse response){  
	        String result = "{\"result\":\"error\"}";  
	        if(systemManageService.delete(web_id)){  
	            result = "{\"result\":\"success\"}";  
	        }  
	        response.setContentType("application/json");  
	        try {  
	            PrintWriter out = response.getWriter();  
	            out.write(result);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	
}
