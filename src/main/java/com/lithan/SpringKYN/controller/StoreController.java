package com.lithan.SpringKYN.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lithan.SpringKYN.entities.Car;

import com.lithan.SpringKYN.entities.User;
import com.lithan.SpringKYN.services.StoreService;

import java.security.Principal;
import java.util.List;

@Controller
public class StoreController {

	private static Logger logger = LoggerFactory.getLogger(StoreController.class);

	@Autowired
	private StoreService storeService;

	@GetMapping ("/register")
	public String register(Model model, User user) { 
		model.addAttribute("user", user) ;


		return "register";
	}

	
	@PostMapping ("/save")
	public String saveUser(Model model, User user) {
		storeService.saveUser(user);
		model.addAttribute("user", user) ;  
		return "ThankYou";
	}


	@GetMapping ("/postcar")
	public String postcar(Model model, Car car) { 
		model.addAttribute("car", car) ;


		return "postcar";
	}

	@PostMapping ("/savecar")
	public String saveCar(Model model, Car car) {
		storeService.saveCar(car);
		model.addAttribute("car", car) ;  
		return "CarThankYou";
	}


	@RequestMapping(value="/",  method= RequestMethod.GET)
	public String handleRootRequest(Model model) {
		return "redirect:stores";
	}

}

