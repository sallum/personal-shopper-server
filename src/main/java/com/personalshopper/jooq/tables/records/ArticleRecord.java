/**
 * This class is generated by jOOQ
 */
package com.personalshopper.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class ArticleRecord extends org.jooq.impl.UpdatableRecordImpl<com.personalshopper.jooq.tables.records.ArticleRecord> implements org.jooq.Record9<java.lang.Long, com.personalshopper.jooq.enums.ArticleType, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Double, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 1935582772;

	/**
	 * Setter for <code>personal_shopper.article.article_id</code>. 
	 */
	public void setArticleId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.article_id</code>. 
	 */
	public java.lang.Long getArticleId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>personal_shopper.article.type</code>. 
	 */
	public void setType(com.personalshopper.jooq.enums.ArticleType value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.type</code>. 
	 */
	public com.personalshopper.jooq.enums.ArticleType getType() {
		return (com.personalshopper.jooq.enums.ArticleType) getValue(1);
	}

	/**
	 * Setter for <code>personal_shopper.article.model</code>. 
	 */
	public void setModel(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.model</code>. 
	 */
	public java.lang.String getModel() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>personal_shopper.article.brand</code>. 
	 */
	public void setBrand(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.brand</code>. 
	 */
	public java.lang.String getBrand() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>personal_shopper.article.size</code>. 
	 */
	public void setSize(java.lang.Object value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.size</code>. 
	 */
	public java.lang.Object getSize() {
		return (java.lang.Object) getValue(4);
	}

	/**
	 * Setter for <code>personal_shopper.article.colour</code>. 
	 */
	public void setColour(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.colour</code>. 
	 */
	public java.lang.String getColour() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>personal_shopper.article.price</code>. 
	 */
	public void setPrice(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.price</code>. 
	 */
	public java.lang.Double getPrice() {
		return (java.lang.Double) getValue(6);
	}

	/**
	 * Setter for <code>personal_shopper.article.picture</code>. 
	 */
	public void setPicture(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.picture</code>. 
	 */
	public java.lang.String getPicture() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>personal_shopper.article.date</code>. 
	 */
	public void setDate(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>personal_shopper.article.date</code>. 
	 */
	public java.sql.Timestamp getDate() {
		return (java.sql.Timestamp) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Long, com.personalshopper.jooq.enums.ArticleType, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Double, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Long, com.personalshopper.jooq.enums.ArticleType, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Double, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.ARTICLE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.personalshopper.jooq.enums.ArticleType> field2() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.MODEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.BRAND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field5() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.COLOUR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.PRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.PICTURE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return com.personalshopper.jooq.tables.Article.ARTICLE.DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getArticleId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.personalshopper.jooq.enums.ArticleType value2() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getModel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getBrand();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value5() {
		return getSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getColour();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getPicture();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ArticleRecord
	 */
	public ArticleRecord() {
		super(com.personalshopper.jooq.tables.Article.ARTICLE);
	}
}