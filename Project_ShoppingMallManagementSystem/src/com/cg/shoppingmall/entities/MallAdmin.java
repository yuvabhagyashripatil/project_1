package com.cg.shoppingmall.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mallAdmin")
public class MallAdmin implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="admin_id")
   private int id;	
	
	@Column(name="admin_name")
   private String name;
	
	@Column(name="password")
   private String password;
	
   @OneToOne(mappedBy="mallAdmin") 
   private Mall mall;
	
	@Column(name="admin_phoneNo")
   private String phone;
   
	
	@OneToOne(mappedBy="mallAdmin") 
	private User user;
	
	@OneToOne(mappedBy="mallAdmin") 
	private ShopOwner shopOwner;
   
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Mall getMall() {
	return mall;
}
public void setMall(Mall mall) {
	this.mall = mall;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}


}
