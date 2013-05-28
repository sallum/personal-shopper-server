/**
 * This class is generated by jOOQ
 */
package com.generated.sources.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.1"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Shops extends org.jooq.impl.TableImpl<com.generated.sources.tables.records.ShopsRecord> {

	private static final long serialVersionUID = -343975663;

	/**
	 * The singleton instance of <code>personal_shopper.shops</code>
	 */
	public static final com.generated.sources.tables.Shops SHOPS = new com.generated.sources.tables.Shops();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.generated.sources.tables.records.ShopsRecord> getRecordType() {
		return com.generated.sources.tables.records.ShopsRecord.class;
	}

	/**
	 * The column <code>personal_shopper.shops.shop_id</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ShopsRecord, java.lang.Long> SHOP_ID = createField("shop_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>personal_shopper.shops.name</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ShopsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.shops.address</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ShopsRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.shops.latitud</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ShopsRecord, java.lang.Double> LATITUD = createField("latitud", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>personal_shopper.shops.longitud</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ShopsRecord, java.lang.Double> LONGITUD = createField("longitud", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>personal_shopper.shops.schedule</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ShopsRecord, java.lang.String> SCHEDULE = createField("schedule", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.shops.email</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ShopsRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * Create a <code>personal_shopper.shops</code> table reference
	 */
	public Shops() {
		super("shops", com.generated.sources.PersonalShopper.PERSONAL_SHOPPER);
	}

	/**
	 * Create an aliased <code>personal_shopper.shops</code> table reference
	 */
	public Shops(java.lang.String alias) {
		super(alias, com.generated.sources.PersonalShopper.PERSONAL_SHOPPER, com.generated.sources.tables.Shops.SHOPS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.generated.sources.tables.records.ShopsRecord, java.lang.Long> getIdentity() {
		return com.generated.sources.Keys.IDENTITY_SHOPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.generated.sources.tables.records.ShopsRecord> getPrimaryKey() {
		return com.generated.sources.Keys.KEY_SHOPS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.generated.sources.tables.records.ShopsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.generated.sources.tables.records.ShopsRecord>>asList(com.generated.sources.Keys.KEY_SHOPS_PRIMARY, com.generated.sources.Keys.KEY_SHOPS_SHOP_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.generated.sources.tables.Shops as(java.lang.String alias) {
		return new com.generated.sources.tables.Shops(alias);
	}
}