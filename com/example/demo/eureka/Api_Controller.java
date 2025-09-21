package com.example.demo.eureka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class Api_Controller {

	@Autowired
	private Api_Service productservice;

	@PostMapping("/add")
	public Api_Entity addData(@RequestBody Api_Entity data) {
		return productservice.saveData(data);

	}

	@GetMapping("/get/{id}")
	public Api_Entity getProduct(@PathVariable Long id) {
		return productservice.getProductById(id);
	}

	@PatchMapping("/update/{id}")
	public ResponseEntity<Api_Entity> updateproduct(@PathVariable Long id, @RequestBody Api_Entity updatedentity) {
		return productservice.updateprod(id, updatedentity);

	}

	@DeleteMapping("/deleteall")
	public void delete(@RequestBody Api_Entity deleteentity) {
		productservice.deleteall(deleteentity);
	}

	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		String response = productservice.deleteid(id);
		return ResponseEntity.ok(response);
	}

}
