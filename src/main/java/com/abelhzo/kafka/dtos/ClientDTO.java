package com.abelhzo.kafka.dtos;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author: Abel HZO
 * @project: springboot-kafka
 * @file: ClientDTO.java
 * @location: México, Ecatepec, Edo. de México.
 * @date: Jueves 22 Junio 2023, 13:58:10.
 * @description: El presente archivo ClientDTO.java fue creado por Abel HZO.
 */
public class ClientDTO {

	private String noAccount;
	private String name;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	public String getNoAccount() {
		return noAccount;
	}

	public void setNoAccount(String noAccount) {
		this.noAccount = noAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
