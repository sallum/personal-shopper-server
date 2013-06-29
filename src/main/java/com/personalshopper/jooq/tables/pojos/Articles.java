/**
 * This class is generated by jOOQ
 */
package com.personalshopper.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Articles implements java.io.Serializable {

	private static final long serialVersionUID = 1338193506;

	private java.lang.Long                              articleId;
	private com.personalshopper.jooq.enums.ArticlesType type;
	private java.lang.String                            model;
	private java.lang.String                            brand;
	private java.lang.Object                            size;
	private java.lang.String                            colour;
	private java.lang.Double                            price;
	private java.lang.String                            picture;
	private java.sql.Timestamp                          date;

	public java.lang.Long getArticleId() {
		return this.articleId;
	}

	public void setArticleId(java.lang.Long articleId) {
		this.articleId = articleId;
	}

	public com.personalshopper.jooq.enums.ArticlesType getType() {
		return this.type;
	}

	public void setType(com.personalshopper.jooq.enums.ArticlesType type) {
		this.type = type;
	}

	public java.lang.String getModel() {
		return this.model;
	}

	public void setModel(java.lang.String model) {
		this.model = model;
	}

	public java.lang.String getBrand() {
		return this.brand;
	}

	public void setBrand(java.lang.String brand) {
		this.brand = brand;
	}

	public java.lang.Object getSize() {
		return this.size;
	}

	public void setSize(java.lang.Object size) {
		this.size = size;
	}

	public java.lang.String getColour() {
		return this.colour;
	}

	public void setColour(java.lang.String colour) {
		this.colour = colour;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public java.lang.String getPicture() {
		return this.picture;
	}

	public void setPicture(java.lang.String picture) {
		this.picture = picture;
	}

	public java.sql.Timestamp getDate() {
		return this.date;
	}

	public void setDate(java.sql.Timestamp date) {
		this.date = date;
	}
}
