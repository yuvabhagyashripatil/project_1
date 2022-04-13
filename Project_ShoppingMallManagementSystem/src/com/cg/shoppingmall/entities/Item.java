package com.cg.shoppingmall.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item implements Serializable
{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="item_id")
	private int id;
	
	@Column(name="item_name")
    private String name;
    
    @Column(name="item_manufacturing")
    private String manufacturing;
    
    @Column(name="item_expiry")
    private String expiry;
    
    @Column(name="item_price")
    private float price;
    
    @Column(name="item_category")
    private String category;
    
     @ManyToOne
	 @JoinColumn(name="shopId")
     private Shop shop;
    
	public int getId() {
		return id;
	}
	public String getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(String manufacturing) {
		this.manufacturing = manufacturing;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
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
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
