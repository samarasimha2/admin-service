package com.akhm.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="SUB_CATEGERY_TL")
@Data
public class SubCategeryEntity {
	@Id
	@GeneratedValue
	@Column(name="SUB_CATEGERY_ID")
	private Integer subCategeryId;
	@Column(name="SUB_CATEGERY_NAME")
	private String subCategeryName;
	@Column(name="SUB_CATEGERY_DESCRIPTION")
	private String subCategeryDescription;
	@Column(name="SUB_CATEGERY_CODE")
	private String subCategeryCode;
	@Column(name="CATEGERY_ID")
	private Integer categeryId;

}
