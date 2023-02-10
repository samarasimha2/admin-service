package com.akhm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.AdminRepository;
import com.akhm.repository.entity.AdminEntity;
import com.akhm.service.AdminService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/admin/v0")
@Slf4j
public class AdminController {
	@Autowired
	private AdminService adminService;
	@PostMapping("/login")
	public ResponseEntity<AdminEntity> login(@RequestBody Map<String, String> admin)
	{
		log.info("In AdminController.... login() started");
		try {
			String emailId=admin.get("emailId");
			String password=admin.get("password");
			AdminEntity adminEntity=adminService.getAdmin(emailId, password);
			if(adminEntity!=null)
			{
				log.info("In AdminCotroller...login() user details successfully insert");
				return new ResponseEntity(adminEntity,HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			}
			
		} catch (Exception e) {
			log.error("In UserController... login() error occarad-{}",e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
