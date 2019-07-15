package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public ResponseEntity<Object> save(@RequestBody Product product){
		
		Integer id= service.save(product);
		
		return new ResponseEntity<Object>("Product save success "+id, HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<Object> get(){
		
		List<Product> list=service.getAll();
		
		return new ResponseEntity<Object>(list, HttpStatus.OK); 
				
	}
}
