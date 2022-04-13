package com.cg.shoppingmall.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User 
{
	@Id
	@Column(name="user_id")
    private int id;
	
	@Column(name="user_name")
private String name;
	
	@Column(name="user_type")	
private String type;
	
	@Column(name="user_password")
private String password;
	
	//association - customer
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer custemer;
	
	//association - mallAdmin
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="admin_id")
	private MallAdmin mallAdmin;

	//association - shopOwner
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="so_id")
	private ShopOwner shopOwner;

	public long getId() {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
