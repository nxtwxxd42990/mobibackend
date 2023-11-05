package com.example.ExampleAPI.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity(name = "User")
@Table(
		name = "User",
		uniqueConstraints = {
				@UniqueConstraint(name = "user_email_unique", columnNames = "email")
		}
)

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "user", nullable = false)
	private String user;
	
	@Column(name = "password", nullable=false)
	private String password;
	
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	
	@Column(name = "description")
	private String description;
	
	

	public User() {
		;
	}

	public User(String name, String user, String password, String email, String description) {
		super();
		this.name = name;
		this.user = user;
		this.password = password;
		this.email = email;
		this.description = description;
	}
	
	
}
