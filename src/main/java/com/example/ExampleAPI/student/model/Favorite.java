package com.example.ExampleAPI.student.model;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity(name = "favorite")
@Table(
		name = "favorite"	
)
public class Favorite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",referencedColumnName = "id", nullable = false)
	@Fetch(FetchMode.JOIN)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id",referencedColumnName = "id", nullable = false)
	@Fetch(FetchMode.JOIN)
	private Product product;
	
	
	
	public Favorite() {
		;
	}
	public Favorite(User user, Product product) {
		super();
		this.user = user;
		this.product = product;
	
	}
}
