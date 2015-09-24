package com.jx.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="IMAGE") 
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String type;
	String location;
	
	@ManyToOne(cascade=CascadeType.ALL)
	Product ownProduct;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the ownProduct
	 */
	public Product getOwnProduct() {
		return ownProduct;
	}

	/**
	 * @param ownProduct the ownProduct to set
	 */
	public void setOwnProduct(Product ownProduct) {
		this.ownProduct = ownProduct;
	}
}
