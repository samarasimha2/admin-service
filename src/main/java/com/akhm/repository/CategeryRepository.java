package com.akhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhm.repository.entity.CategeryEntity;
@Repository
public interface CategeryRepository extends JpaRepository<CategeryEntity, Integer>{
	

}
