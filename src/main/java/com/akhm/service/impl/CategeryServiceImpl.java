package com.akhm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.CategeryRepository;
import com.akhm.repository.entity.CategeryEntity;
import com.akhm.service.CategeryService;

@Service
public class CategeryServiceImpl implements CategeryService{
	@Autowired
	private CategeryRepository categeryRepository;

	@Override
	public Integer insertCategery(CategeryEntity categeryEntity) {
		try {
			CategeryEntity categery=categeryRepository.save(categeryEntity);
			if(categery!=null)
			{
				return categery.getCategeryId();
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public List<CategeryEntity> getCategeries() {
		try {
			 return categeryRepository.findAll();
			
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public CategeryEntity getCategery(Integer categeryId) {
		try {
			Optional<CategeryEntity> optional=categeryRepository.findById(categeryId);
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
	public void updateCategery(CategeryEntity categeryEntity) {
		try {
			categeryRepository.save(categeryEntity);
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
		
	}

}
