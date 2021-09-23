package com.lithan.SpringKYN.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lithan.SpringKYN.dao.UserRepository;
import com.lithan.SpringKYN.entities.User;

@Controller
public class ViewController {
	
	 @Autowired
	 private UserRepository userReposito;
	
	 @GetMapping("/viewprofile")
	    public String dash(Model model) {
		 String name = SecurityContextHolder.getContext().getAuthentication().getName();
	        
		  User user1 = userReposito.findByUserName(name);
	        model.addAttribute("user", user1);
	    	 	return "viewprofile";
	    	
	    }
		
}
