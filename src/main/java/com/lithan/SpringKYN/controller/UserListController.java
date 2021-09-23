package com.lithan.SpringKYN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lithan.SpringKYN.entities.User;
import com.lithan.SpringKYN.services.StoreService;

@Controller
public class UserListController {

	@Autowired
	private StoreService storeService;
	
	
	@GetMapping("/listusers")
	public String listuser(Model model){
		List<User> userlist = storeService.listUser();
		model.addAttribute("userlist", userlist);
		return "listusers";
		
	}
}
