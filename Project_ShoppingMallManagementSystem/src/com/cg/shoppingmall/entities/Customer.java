package com.cg.shoppingmall.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="customer_id")
	private int id;

	@Column(name="customer_name")
	private String name;

	@Column(name="phone")
	private String phone;

	@Column(name="email")
	private String email;

	
	@OneToOne(mappedBy="customer")         //user association
	private User user;
	
	@OneToMany(mappedBy ="customer",cascade=CascadeType.PERSIST)
	private List<OrderDetails> order_id;
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public List<OrderDetails> getOrder_id() {
		return order_id;
	}
	public void setOrder_id(List<OrderDetails> order_id) {
		this.order_id = order_id;
	}
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public Customer()
	{
	}


	public Customer(int id, String name, String phone, String email) 
	{
		this.id = id;
		this.name = name;
		
		this.phone = phone;
		this.email = email;
	}
}
