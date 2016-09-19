package com.xxy.bbs.controller;

import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xxy.bbs.bean.User;
import com.xxy.bbs.service.UserService;

@Controller
@RequestMapping("/user")
public class UserContorller {
	@Resource
	private UserService userService;
	
	@RequestMapping("/detail")
	public String getUser(Model model,HttpServletRequest request){
		User user = userService.selectByPrimaryKey(1);
		getIpAddr(request);
		model.addAttribute("user", user);
		return "/index";
	}
	
	//测试ip用
	//0.01
	public String getIpAddr(HttpServletRequest request) { 
	    Enumeration<String> aa = request.getHeaderNames();
	  /*  while (aa.hasMoreElements()) {
			String string = (String) aa.nextElement();
			System.out.println(string+":"+request.getHeader(string));
		}*/
	    String ip = request.getHeader("x-forwarded-for");
	    System.out.println(ip);
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	        ip = request.getHeader("Proxy-Client-IP"); 
	        System.out.println(ip);
	    } 
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	        ip = request.getHeader("WL-Proxy-Client-IP"); 
	        System.out.println(ip);
	    } 
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	        ip = request.getRemoteAddr(); 
	        System.out.println(ip);
	    }
	    System.out.println(request.getRemoteAddr());
	    return ip; 
	    
	}   
}
