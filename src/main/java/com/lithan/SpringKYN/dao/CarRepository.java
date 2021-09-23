package com.lithan.SpringKYN.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lithan.SpringKYN.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	
	@Query(value = "SELECT c FROM Car c WHERE c.name LIKE '%' || :keyword || '%'"
			+ " OR c.model LIKE '%' || :keyword || '%'"
			+ " OR c.company LIKE '%' || :keyword || '%'")
	
            public java.util.List<Car> search(@Param("keyword") String keyword);
	
}
