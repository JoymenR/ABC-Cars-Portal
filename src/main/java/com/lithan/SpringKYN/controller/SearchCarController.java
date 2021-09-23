package com.lithan.SpringKYN.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lithan.SpringKYN.entities.Car;
import com.lithan.SpringKYN.services.StoreService;


@Controller
public class SearchCarController {

	
	@Autowired
	private StoreService storeService;
	
	@GetMapping("/searchcar")
	public String searchcar(@RequestParam String keyword, Model model ) {
		System.out.println("Carname:"+keyword+".");
		List<Car> carlist=storeService.search(keyword);
		model.addAttribute("carlist", carlist);
		return "searchcar";
		
	} 
	
	
	@GetMapping("/carform")
	public String carform() {
		return "carform";
		
	} 
	
	
	
}
