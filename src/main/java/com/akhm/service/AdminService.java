package com.akhm.service;

import org.springframework.stereotype.Service;

import com.akhm.repository.entity.AdminEntity;
@Service
public interface AdminService {
	public AdminEntity getAdmin(String emailId,String password);

}
