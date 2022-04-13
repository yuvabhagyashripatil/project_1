package com.cg.shoppingmall.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shop_owner")
public class ShopOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	 private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="address")
	private String address;
	
	@Column(name="shop_id")
	private Shop shop_id;    
	
	@OneToOne(mappedBy="shop_owner")         
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="admin_id")
	private MallAdmin mallAdmin;
	
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Shop getShop_id() {
		return shop_id;
	}
	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}
}
