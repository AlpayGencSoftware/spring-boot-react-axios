package com.libertytech.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	
	public User() {}

  public User(String userName, String lastName, String email) { 
		 
		this.userName = userName;
		this.lastName = lastName;
		this.email = email;
	}

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  @Column(name="first_name")
  private String userName;
  
  @Column(name="last_name")
  private String lastName;
  
  @Column(name="email")
  private String email; 
	
  
}
