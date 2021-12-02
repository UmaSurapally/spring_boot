package com.hellokoding.tutorials.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user_details")
public class UserDetails {
	
	@Id
	private String email;
	private String name;
	private String mobile;
	private String location;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "UserDetails [email=" + email + ", name=" + name + ", mobile=" + mobile + ", location=" + location + "]";
	}
	
	

}
