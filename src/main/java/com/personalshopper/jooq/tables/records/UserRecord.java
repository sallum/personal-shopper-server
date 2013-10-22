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
public class UserRecord extends org.jooq.impl.UpdatableRecordImpl<com.personalshopper.jooq.tables.records.UserRecord> implements org.jooq.Record8<java.lang.Long, java.lang.String, java.lang.String, java.sql.Date, com.personalshopper.jooq.enums.UserUserGender, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 749202864;

	/**
	 * Setter for <code>personal_shopper.user.user_id</code>. 
	 */
	public void setUserId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>personal_shopper.user.user_id</code>. 
	 */
	public java.lang.Long getUserId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>personal_shopper.user.user_name</code>. 
	 */
	public void setUserName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>personal_shopper.user.user_name</code>. 
	 */
	public java.lang.String getUserName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>personal_shopper.user.user_email</code>. 
	 */
	public void setUserEmail(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>personal_shopper.user.user_email</code>. 
	 */
	public java.lang.String getUserEmail() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>personal_shopper.user.user_birthday</code>. 
	 */
	public void setUserBirthday(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>personal_shopper.user.user_birthday</code>. 
	 */
	public java.sql.Date getUserBirthday() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>personal_shopper.user.user_gender</code>. 
	 */
	public void setUserGender(com.personalshopper.jooq.enums.UserUserGender value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>personal_shopper.user.user_gender</code>. 
	 */
	public com.personalshopper.jooq.enums.UserUserGender getUserGender() {
		return (com.personalshopper.jooq.enums.UserUserGender) getValue(4);
	}

	/**
	 * Setter for <code>personal_shopper.user.user_size_shirt</code>. 
	 */
	public void setUserSizeShirt(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>personal_shopper.user.user_size_shirt</code>. 
	 */
	public java.lang.String getUserSizeShirt() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>personal_shopper.user.user_size_pants</code>. 
	 */
	public void setUserSizePants(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>personal_shopper.user.user_size_pants</code>. 
	 */
	public java.lang.String getUserSizePants() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>personal_shopper.user.user_size_shoes</code>. 
	 */
	public void setUserSizeShoes(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>personal_shopper.user.user_size_shoes</code>. 
	 */
	public java.lang.String getUserSizeShoes() {
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
	public org.jooq.Row8<java.lang.Long, java.lang.String, java.lang.String, java.sql.Date, com.personalshopper.jooq.enums.UserUserGender, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Long, java.lang.String, java.lang.String, java.sql.Date, com.personalshopper.jooq.enums.UserUserGender, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.personalshopper.jooq.tables.User.USER.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.personalshopper.jooq.tables.User.USER.USER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.personalshopper.jooq.tables.User.USER.USER_EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return com.personalshopper.jooq.tables.User.USER.USER_BIRTHDAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<com.personalshopper.jooq.enums.UserUserGender> field5() {
		return com.personalshopper.jooq.tables.User.USER.USER_GENDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.personalshopper.jooq.tables.User.USER.USER_SIZE_SHIRT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.personalshopper.jooq.tables.User.USER.USER_SIZE_PANTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.personalshopper.jooq.tables.User.USER.USER_SIZE_SHOES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUserName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUserEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getUserBirthday();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.personalshopper.jooq.enums.UserUserGender value5() {
		return getUserGender();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getUserSizeShirt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getUserSizePants();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getUserSizeShoes();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(com.personalshopper.jooq.tables.User.USER);
	}
}
