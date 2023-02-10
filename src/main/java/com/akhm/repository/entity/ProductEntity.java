package com.akhm.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="PRODUCT_TL")
@Data
public class ProductEntity {
	@Id
	@GeneratedValue
	@Column(name="PRODUCT_ID")
	private Integer productId;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="PRODUCT_DESCRIPTION")
	private String productDescription;
	@Column(name="PRODUCT_IMAGE_NAME")
	private String productImageName;
	@Column(name="CATEGORY_ID")
	private Integer categoryId;
	@Column(name="SUB_CATEGORY_ID")
	private Integer subCategoryId;
	@Column(name="PRODUCT_STATUS")
	private String productStatus;
	

}
