package com.example.ExampleAPI.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity(name = "Product")
@Table(
		name = "Product"
		
)
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "image", nullable=false)
	private String image;
	
	@Column(name = "name", nullable=false)
	private String name;
	
	@Column(name = "cpu", nullable=false)
	private String cpu;
	
	@Column(name = "mb", nullable=false)
	private String mb;
	
	@Column(name = "vga", nullable=false)
	private String vga;
	
	@Column(name = "ram", nullable=false)
	private String ram;
	
	@Column(name = "ssd", nullable=false)
	private String ssd;
	
	
	@Column(name = "hdd", nullable=false)
	private String hdd;
	
	@Column(name = "psu", nullable=false)
	private String psu;
	
	@Column(name = "cases", nullable=false)
	private String cases;
	
	@Column(name = "price", nullable=false)
	private String price;
	
	public Product() {
		;
	}

	public Product(String name, String cpu, String mb, String vga, String ram, String ssd, String hdd, String psu, String cases, String price, String image) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.mb = mb;
		this.vga = vga;
		this.ram = ram;
		this.ssd = ssd;
		this.hdd = hdd;
		this.psu = psu;
		this.cases = cases;
		this.price = price;
		this.image = image;
	}
	
}
