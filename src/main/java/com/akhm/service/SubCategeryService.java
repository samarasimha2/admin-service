package com.akhm.service;

import java.util.List;


import com.akhm.repository.entity.SubCategeryEntity;

public interface SubCategeryService {
	public Integer insertSubCategery(SubCategeryEntity subCategeryEntity);
	public List<SubCategeryEntity> getSubCategeries();
	public SubCategeryEntity getSubCategery(Integer subCategeryId);
	public void updateSubCategery(SubCategeryEntity subCategeryEntity);

}
