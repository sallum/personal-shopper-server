package com.personalshopper.entities;

/**
 * This class contains the information that is got in the create article
 * request.
 * 
 * @author Ignacio Mulas
 * 
 */
public class CreateArticle {

	// {
	// "brand": "nike",
	// "colour": "GREEN",
	// "model": "mymodel",
	// "prize": "100",
	// "size": "L",
	// "type": "shoes",
	// "shop": 1
	// }

	private String brand;
	private String colour;
	private String model;
	private double price;
	private long shopId;
	private String size;
	private String type;

	/**
	 * Default constructor
	 */
	public CreateArticle() {
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the prize
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the shop
	 */
	public long getShopId() {
		return shopId;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @param colour
	 *            the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @param prize
	 *            the prize to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param shop
	 *            the shop to set
	 */
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
