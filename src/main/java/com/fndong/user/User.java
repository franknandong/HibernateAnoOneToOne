package com.fndong.user;
// Generated Mar 17, 2016 2:59:12 PM by Hibernate Tools 4.3.1.Final

import java.util.Set;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user")
public class User implements java.io.Serializable {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Integer userId;
	
	private String password;
	
	private String name;
	
	private String email;
	
	@OneToOne(mappedBy="user", cascade=CascadeType.ALL)
	private UserDetails userDetails;

	public User() {
	}

	public User(String password, String name, String email) {
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public User(String password, String name, String email, Set<UserDetails> userDetails) {
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}


}
