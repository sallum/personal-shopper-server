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
	// "shop": "laTiendaDelBarrio"
	// }

	private String brand;
	private String colour;
	private String model;
	private double price;
	private String shop;
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
	public String getShop() {
		return shop;
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
	public void setShop(String shop) {
		this.shop = shop;
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
