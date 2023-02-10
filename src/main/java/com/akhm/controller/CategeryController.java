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

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.entity.CategeryEntity;
import com.akhm.service.CategeryService;

@RestController
public class CategeryController {
	@Autowired
	private CategeryService categeryService;
	@PostMapping("/categery/save")
	public ResponseEntity<Integer>  saveCategery(@RequestBody CategeryEntity categeryEntity)
	{
		try {
			return new ResponseEntity<>(categeryService.insertCategery(categeryEntity),HttpStatus.CREATED);
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/categery/get")
	public ResponseEntity<List<CategeryEntity>> getCategeries()
	{
		try {
			List<CategeryEntity> categeries=categeryService.getCategeries();
			return new ResponseEntity<>(categeries,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/categery/get/{categeryId}")
	public ResponseEntity<CategeryEntity> getCategery(@PathVariable Integer categeryId)
	{
		try {
			CategeryEntity categery=categeryService.getCategery(categeryId);
			return new ResponseEntity<>(categery,HttpStatus.OK);
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/categery/update")
	public ResponseEntity<Void> updateCategery(@RequestBody CategeryEntity categeryEntity)
	{
		try {
			categeryService.updateCategery(categeryEntity);
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
