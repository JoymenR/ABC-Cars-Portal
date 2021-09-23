package com.lithan.SpringKYN.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lithan.SpringKYN.services.StoreService;

@Controller
public class DeleteUserController {

	
	 @Autowired
	 private StoreService storeService;

	@GetMapping("/deleteprofile")
	public String deleteuser(@RequestParam Long id, Model model) {
		
		storeService.deleteUser(id);
		return "redirect:listusers";
		
	}
	
}
