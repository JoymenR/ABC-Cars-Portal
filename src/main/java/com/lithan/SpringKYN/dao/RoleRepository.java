package com.lithan.SpringKYN.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lithan.SpringKYN.entities.Role;
import com.lithan.SpringKYN.entities.User;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	 Role findByName(String name);
}
