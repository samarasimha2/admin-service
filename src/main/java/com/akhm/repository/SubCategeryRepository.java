package com.akhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhm.repository.entity.CategeryEntity;
import com.akhm.repository.entity.SubCategeryEntity;

@Repository
public interface SubCategeryRepository extends JpaRepository<SubCategeryEntity, Integer>{
	public CategeryEntity findAllByCategeryId(Integer categeryId);

}
