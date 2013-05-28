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
public class ShopsRecord extends org.jooq.impl.UpdatableRecordImpl<com.generated.sources.tables.records.ShopsRecord> implements org.jooq.Record7<java.lang.Long, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1520213530;

	/**
	 * Setter for <code>personal_shopper.shops.shop_id</code>. 
	 */
	public void setShopId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>personal_shopper.shops.shop_id</code>. 
	 */
	public java.lang.Long getShopId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>personal_shopper.shops.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>personal_shopper.shops.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>personal_shopper.shops.address</code>. 
	 */
	public void setAddress(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>personal_shopper.shops.address</code>. 
	 */
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>personal_shopper.shops.latitud</code>. 
	 */
	public void setLatitud(java.lang.Double value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>personal_shopper.shops.latitud</code>. 
	 */
	public java.lang.Double getLatitud() {
		return (java.lang.Double) getValue(3);
	}

	/**
	 * Setter for <code>personal_shopper.shops.longitud</code>. 
	 */
	public void setLongitud(java.lang.Double value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>personal_shopper.shops.longitud</code>. 
	 */
	public java.lang.Double getLongitud() {
		return (java.lang.Double) getValue(4);
	}

	/**
	 * Setter for <code>personal_shopper.shops.schedule</code>. 
	 */
	public void setSchedule(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>personal_shopper.shops.schedule</code>. 
	 */
	public java.lang.String getSchedule() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>personal_shopper.shops.email</code>. 
	 */
	public void setEmail(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>personal_shopper.shops.email</code>. 
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.generated.sources.tables.Shops.SHOPS.SHOP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.generated.sources.tables.Shops.SHOPS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.generated.sources.tables.Shops.SHOPS.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field4() {
		return com.generated.sources.tables.Shops.SHOPS.LATITUD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field5() {
		return com.generated.sources.tables.Shops.SHOPS.LONGITUD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.generated.sources.tables.Shops.SHOPS.SCHEDULE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.generated.sources.tables.Shops.SHOPS.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getShopId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value4() {
		return getLatitud();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value5() {
		return getLongitud();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getSchedule();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getEmail();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ShopsRecord
	 */
	public ShopsRecord() {
		super(com.generated.sources.tables.Shops.SHOPS);
	}
}