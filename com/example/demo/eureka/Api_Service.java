package com.example.demo.eureka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.transaction.Transactional;

@Service
public class Api_Service {

	@Autowired
	private Api_Repository productrepository;

	@Transactional
	public Api_Entity saveData(Api_Entity data) {
		return productrepository.save(data);
	}

	public Api_Entity getProductById(Long id) {
		return productrepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id " + id));
	}

	public void deleteProduct(Long id) {

		productrepository.deleteById(id);
	}

	public ResponseEntity<Api_Entity> updateprod(Long id, Api_Entity updatedentity) {

		
		
		
		Api_Entity existingentity = productrepository.findById(id)
				.orElseThrow(() -> new RuntimeException("No product found with id " + id));

		existingentity.setProduct(updatedentity.getProduct());
		existingentity.setPrice(updatedentity.getPrice());

		Api_Entity savedEntity = productrepository.save(existingentity);

		return ResponseEntity.ok(savedEntity);
	}

	public void deleteall(Api_Entity deleteentity) {
		productrepository.delete(deleteentity);

	}

	public String deleteid(Long id) {
		productrepository.deleteById(id);
		return id + " Successfully deleted";
	}

}
