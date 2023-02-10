package com.akhm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhm.exception.AdminCustomException;
import com.akhm.repository.ProductRepository;
import com.akhm.repository.entity.ProductEntity;
import com.akhm.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Integer insertProduct(ProductEntity productEntity) {
		try {
			ProductEntity product=productRepository.save(productEntity);
			if(product!=null)
			{
				return product.getProductId();
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public List<ProductEntity> getProducts() {
		try {
			return productRepository.findAll();
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
	}

	@Override
	public ProductEntity getProduct(Integer productId) {
		try {
			Optional<ProductEntity> optional=productRepository.findById(productId);
			if(optional!=null)
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
	public void updateProduct(ProductEntity productEntity) {
		try {
			productRepository.save(productEntity);
		} catch (Exception e) {
			throw new AdminCustomException(e.getMessage());
		}
		
	}

}
