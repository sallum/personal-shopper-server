/**
 * This class is generated by jOOQ
 */
package com.generated.sources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.1"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArticlesRecord extends org.jooq.impl.UpdatableRecordImpl<com.generated.sources.tables.records.ArticlesRecord> implements org.jooq.Record8<java.lang.Long, com.generated.sources.enums.ArticlesType, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Double, java.lang.String> {

	private static final long serialVersionUID = -1215430631;

	/**
	 * Setter for <code>personal_shopper.articles.article_id</code>. 
	 */
	public void setArticleId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>personal_shopper.articles.article_id</code>. 
	 */
	public java.lang.Long getArticleId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>personal_shopper.articles.type</code>. 
	 */
	public void setType(com.generated.sources.enums.ArticlesType value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>personal_shopper.articles.type</code>. 
	 */
	public com.generated.sources.enums.ArticlesType getType() {
		return (com.generated.sources.enums.ArticlesType) getValue(1);
	}

	/**
	 * Setter for <code>personal_shopper.articles.model</code>. 
	 */
	public void setModel(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>personal_shopper.articles.model</code>. 
	 */
	public java.lang.String getModel() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>personal_shopper.articles.brand</code>. 
	 */
	public void setBrand(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>personal_shopper.articles.brand</code>. 
	 */
	public java.lang.String getBrand() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>personal_shopper.articles.size</code>. 
	 */
	public void setSize(java.lang.Object value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>personal_shopper.articles.size</code>. 
	 */
	public java.lang.Object getSize() {
		return (java.lang.Object) getValue(4);
	}

	/**
	 * Setter for <code>personal_shopper.articles.colour</code>. 
	 */
	public void setColour(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>personal_shopper.articles.colour</code>. 
	 */
	public java.lang.String getColour() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>personal_shopper.articles.price</code>. 
	 */
	public void setPrice(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>personal_shopper.articles.price</code>. 
	 */
	public java.lang.Double getPrice() {
		return (java.lang.Double) getValue(6);
	}

	/**
	 * Setter for <code>personal_shopper.articles.picture</code>. 
	 */
	public void setPicture(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>personal_shopper.articles.picture</code>. 
	 */
	public java.lang.String getPicture() {
		return (java.lang.String) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Long, com.generated.sources.enums.ArticlesType, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Double, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Long, com.generated.sources.enums.ArticlesType, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Double, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.generated.sources.tables.Articles.ARTICLES.ARTICLE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.generated.sources.enums.ArticlesType> field2() {
		return com.generated.sources.tables.Articles.ARTICLES.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.generated.sources.tables.Articles.ARTICLES.MODEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.generated.sources.tables.Articles.ARTICLES.BRAND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field5() {
		return com.generated.sources.tables.Articles.ARTICLES.SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.generated.sources.tables.Articles.ARTICLES.COLOUR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return com.generated.sources.tables.Articles.ARTICLES.PRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.generated.sources.tables.Articles.ARTICLES.PICTURE;
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
	public com.generated.sources.enums.ArticlesType value2() {
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

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ArticlesRecord
	 */
	public ArticlesRecord() {
		super(com.generated.sources.tables.Articles.ARTICLES);
	}
}