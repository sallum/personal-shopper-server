/**
 * This class is generated by jOOQ
 */
package com.personalshopper.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class User extends org.jooq.impl.TableImpl<com.personalshopper.jooq.tables.records.UserRecord> {

	private static final long serialVersionUID = -2020611019;

	/**
	 * The singleton instance of <code>personal_shopper.user</code>
	 */
	public static final com.personalshopper.jooq.tables.User USER = new com.personalshopper.jooq.tables.User();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.personalshopper.jooq.tables.records.UserRecord> getRecordType() {
		return com.personalshopper.jooq.tables.records.UserRecord.class;
	}

	/**
	 * The column <code>personal_shopper.user.user_id</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.UserRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>personal_shopper.user.user_name</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.UserRecord, java.lang.String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR.length(30), this);

	/**
	 * The column <code>personal_shopper.user.user_email</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.UserRecord, java.lang.Integer> USER_EMAIL = createField("user_email", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>personal_shopper.user.user_birthday</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.UserRecord, java.sql.Date> USER_BIRTHDAY = createField("user_birthday", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>personal_shopper.user.user_gender</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.UserRecord, com.personalshopper.jooq.enums.UserUserGender> USER_GENDER = createField("user_gender", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.personalshopper.jooq.enums.UserUserGender.class), this);

	/**
	 * The column <code>personal_shopper.user.user_size_shirt</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.UserRecord, java.lang.String> USER_SIZE_SHIRT = createField("user_size_shirt", org.jooq.impl.SQLDataType.VARCHAR.length(5), this);

	/**
	 * The column <code>personal_shopper.user.user_size_pants</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.UserRecord, java.lang.String> USER_SIZE_PANTS = createField("user_size_pants", org.jooq.impl.SQLDataType.VARCHAR.length(5), this);

	/**
	 * The column <code>personal_shopper.user.user_size_shoes</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.UserRecord, java.lang.String> USER_SIZE_SHOES = createField("user_size_shoes", org.jooq.impl.SQLDataType.VARCHAR.length(5), this);

	/**
	 * Create a <code>personal_shopper.user</code> table reference
	 */
	public User() {
		super("user", com.personalshopper.jooq.PersonalShopper.PERSONAL_SHOPPER);
	}

	/**
	 * Create an aliased <code>personal_shopper.user</code> table reference
	 */
	public User(java.lang.String alias) {
		super(alias, com.personalshopper.jooq.PersonalShopper.PERSONAL_SHOPPER, com.personalshopper.jooq.tables.User.USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.personalshopper.jooq.tables.records.UserRecord, java.lang.Long> getIdentity() {
		return com.personalshopper.jooq.Keys.IDENTITY_USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.personalshopper.jooq.tables.records.UserRecord> getPrimaryKey() {
		return com.personalshopper.jooq.Keys.KEY_USER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.personalshopper.jooq.tables.records.UserRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.personalshopper.jooq.tables.records.UserRecord>>asList(com.personalshopper.jooq.Keys.KEY_USER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.personalshopper.jooq.tables.User as(java.lang.String alias) {
		return new com.personalshopper.jooq.tables.User(alias);
	}
}