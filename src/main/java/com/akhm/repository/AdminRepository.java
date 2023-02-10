package com.akhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhm.repository.entity.AdminEntity;
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {
	public AdminEntity findByEmailIdAndPassword(String emailId,String password);
}
