package com.lithan.SpringKYN.services;


import com.lithan.SpringKYN.controller.StoreController;
import com.lithan.SpringKYN.dao.CarRepository;
import com.lithan.SpringKYN.dao.RoleRepository;

import com.lithan.SpringKYN.dao.UserRepository;
import com.lithan.SpringKYN.entities.Car;

import com.lithan.SpringKYN.entities.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StoreService {
	private static final Logger logger = LoggerFactory.getLogger(StoreController.class);



	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private UserRepository userReposito;

	@Autowired
	private CarRepository carrepo;


	public void saveUser (User user) {
		user.setRoles(Arrays.asList(roleRepo.findByName("User")));
		userReposito.save(user);	

	}


	public void saveCar (Car car) {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userReposito.findByUserName(name);
		car.setCarowner(name);
		carrepo.save(car);

	}		

	public List<User> listUser() {
		List<User> userlist = userReposito.findAll();	
		return userlist;
	}

	public void deleteUser (Long id) {
		userReposito.deleteById(id);	
	}



	public List<Car> listcar() {
		List<Car> carlist = carrepo.findAll();	
		return carlist;
	}

	public void deleteCar (Long id) {
		carrepo.deleteById(id);	
	}


	public List<Car> search(String keyword) {
		return carrepo.search(keyword);
	}


}
