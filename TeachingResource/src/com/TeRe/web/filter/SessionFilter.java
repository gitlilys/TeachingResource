package com.TeRe.web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class SessionFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain fiterChain)
			throws ServletException, IOException {
		
		String[] notFilter = new String[] {
			"index.jsp"	
		};
		
		String uri = request.getRequestURI();
		
		if(uri.indexOf("JSP") != -1) {
			boolean doFilter = true;
			for(String s : notFilter) {
				if(uri.indexOf(s) != -1) {
					doFilter = false;
					break;
				}
			}
			if(doFilter) {
				Object obj = request.getSession().getAttribute("NOWUSER");
				if(null == obj) {
					request.setCharacterEncoding("UTF-8");
					response.setCharacterEncoding("UTF-8");
					PrintWriter out = response.getWriter();
					String loginPage = "http://127.0.0.1:8080/PikachuBlog/JSP/login.jsp";
					StringBuilder builder = new StringBuilder();
					builder.append("<script type=\"text/javascript\">");  
                    builder.append("alert('please login!!!');");  
                    builder.append("window.top.location.href='");  
                    builder.append(loginPage);  
                    builder.append("';");  
                    builder.append("</script>");  
                    out.print(builder.toString());  
				} else {
					fiterChain.doFilter(request, response);
				}
			} else {
				fiterChain.doFilter(request, response);
			}
		} else {
			fiterChain.doFilter(request, response);
		}
		
	}

	
}
