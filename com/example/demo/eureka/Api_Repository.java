package com.example.demo.eureka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Api_Repository extends JpaRepository<Api_Entity, Long> {


	
	

	
}
