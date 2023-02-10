package com.akhm.service;

import java.util.List;

import com.akhm.repository.entity.CategeryEntity;

public interface CategeryService {
	public Integer insertCategery(CategeryEntity categeryEntity);
	public List<CategeryEntity> getCategeries();
	public CategeryEntity getCategery(Integer categeryId);
	public void updateCategery(CategeryEntity categeryEntity);
	

}
