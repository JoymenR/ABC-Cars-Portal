package com.lithan.SpringKYN.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.lithan.SpringKYN.dao.UserRepository;
import com.lithan.SpringKYN.entities.User;
import com.lithan.SpringKYN.services.StoreService;

@Controller
public class UpdateController {
	
	@Autowired
	private StoreService storeService;

	 @Autowired
	 private UserRepository userReposito;
	
	 @GetMapping("/editprofile")
	    public String dash(Model model) {
		 String name = SecurityContextHolder.getContext().getAuthentication().getName();
	        
		  User user = userReposito.findByUserName(name);
	        model.addAttribute("user", user);
	    	 	return "update";
	    	
	    }
	 
	 
	 
	 @PostMapping("/saveprofile")
	 public String edit(Model model, User user) {
		 System.out.println("ID:" + user.getId()+ "."+"Name:"+user.getName()+"."+"username:"+user.getUserName()+"."+"Password:"+user.getPassword()+"."+"Email:"+user.getEmail()+"." );
		 storeService.saveUser(user);	
		 String name = SecurityContextHolder.getContext().getAuthentication().getName();
	         User user1 = userReposito.findByUserName(name);
	        model.addAttribute("user", user1);
	    	 	return "viewprofile";
		
	 }
}
