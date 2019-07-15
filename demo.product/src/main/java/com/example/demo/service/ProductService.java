package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Integer save(Product product) {
		repository.save(product);
		return product.getId();
	}

	public List<Product> getAll() {
		return repository.findAll();
	}

	public Product getOne(Integer id) {
		return repository.getOne(id);
	}
}
