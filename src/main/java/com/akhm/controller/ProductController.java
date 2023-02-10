package com.akhm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.repository.entity.CategeryEntity;
import com.akhm.repository.entity.ProductEntity;
import com.akhm.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@PostMapping("/product/save")
	public ResponseEntity<Integer>  saveCategery(@RequestBody ProductEntity productEntity)
	{
		try {
			return new ResponseEntity<>(productService.insertProduct(productEntity),HttpStatus.CREATED);
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/product/get")
	public ResponseEntity<List<ProductEntity>> getProducts()
	{
		try {
			List<ProductEntity> products=productService.getProducts();
			return new ResponseEntity<>(products,HttpStatus.OK);
		
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/product/get/{productId}")
	public ResponseEntity<ProductEntity> getProduct(@PathVariable Integer productId)
	{
		try {
			ProductEntity product=productService.getProduct(productId);
			return new ResponseEntity<>(product,HttpStatus.OK);
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/product/update")
	public ResponseEntity<Void> updateProduct(@RequestBody ProductEntity productEntity)
	{
		try {
			productService.updateProduct(productEntity);
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
