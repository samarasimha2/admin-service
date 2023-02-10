package com.akhm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.SubCategeryRepository;
import com.akhm.repository.entity.CategeryEntity;
import com.akhm.repository.entity.SubCategeryEntity;
import com.akhm.service.SubCategeryService;

@Service
public class SubCategeryServiceImpl implements SubCategeryService{
	@Autowired
	private SubCategeryRepository subCategeryRepository;

	@Override
	public Integer insertSubCategery(SubCategeryEntity subCategeryEntity) {
		try {
			SubCategeryEntity subCategery=subCategeryRepository.save(subCategeryEntity);
			if(subCategery!=null)
			{
				return subCategery.getSubCategeryId();
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public List<SubCategeryEntity> getSubCategeries() {
		try {
			//return subCategeryRepository.findAllByCategeryId(getSubCategeries());
			return null;
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public SubCategeryEntity getSubCategery(Integer subCategeryId) {
		try {
			Optional<SubCategeryEntity> optional=subCategeryRepository.findById(subCategeryId);
			if(optional.isPresent())
			{
				return optional.get();
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public void updateSubCategery(SubCategeryEntity subCategeryEntity) {
		try {
			subCategeryRepository.save(subCategeryEntity);
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
		
	}

}
