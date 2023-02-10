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
import com.akhm.repository.entity.SubCategeryEntity;
import com.akhm.service.SubCategeryService;

@RestController
public class SubCategeryController {
	@Autowired
	private SubCategeryService subCategeryService;
	@PostMapping("/subCategery/save")
	public ResponseEntity<Integer>  saveSubCategery(@RequestBody SubCategeryEntity subCategeryEntity)
	{
		try {
			return new ResponseEntity<>(subCategeryService.insertSubCategery(subCategeryEntity),HttpStatus.CREATED);
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/subCategeries/get")
	public ResponseEntity<List<SubCategeryEntity>> getSubCategeries()
	{
		try {
			List<SubCategeryEntity> subCategeries=subCategeryService.getSubCategeries();
			return new ResponseEntity<>(subCategeries,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/subCategries/get/{subCategeryId}")
	public ResponseEntity<SubCategeryEntity> getSubCategery(@PathVariable Integer subCategeryId)
	{
		try {
			SubCategeryEntity subCategery=subCategeryService.getSubCategery(subCategeryId);
			return new ResponseEntity<>(subCategery,HttpStatus.OK);
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/subCategery/update")
	public ResponseEntity<Void> updateSubCategery(@RequestBody SubCategeryEntity subCategeryEntity)
	{
		try {
			subCategeryService.updateSubCategery(subCategeryEntity);
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
