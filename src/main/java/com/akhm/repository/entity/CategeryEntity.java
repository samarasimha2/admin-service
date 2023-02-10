package com.akhm.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="CATEGERY_TL")
@Data
public class CategeryEntity {
	@Id
	@GeneratedValue
	@Column(name="CATEGERY_ID")
	private Integer categeryId;
	@Column(name="CATEGERY_NAME")
	private String categeryName;
	@Column(name="CATEGERY_DESCRIPTION")
	private String categeryDescription;
	@Column(name="CATEGERY_CODE")
	private String categeryCode;
}
