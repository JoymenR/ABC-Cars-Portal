package com.lithan.SpringKYN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lithan.SpringKYN.entities.Car;
import com.lithan.SpringKYN.entities.User;
import com.lithan.SpringKYN.services.StoreService;


@Controller
public class CarListController {

	@Autowired
	private StoreService storeService;
	
	@GetMapping("/listcars")
	public String listcars(Model model){
		List<Car> carlist = storeService.listcar();
		model.addAttribute("carlist", carlist);
		return "listcars";
		
	}
	
	
}
