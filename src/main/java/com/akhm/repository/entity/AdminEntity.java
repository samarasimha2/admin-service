package com.akhm.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="ADMIN_TL")
public class AdminEntity {
	@Id
	@GeneratedValue
	@Column(name="ADMIN_ID")
	private Integer adminId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL_ID")
	private String emailId;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

}
