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
public class Articles extends org.jooq.impl.TableImpl<com.personalshopper.jooq.tables.records.ArticlesRecord> {

	private static final long serialVersionUID = -1061457459;

	/**
	 * The singleton instance of <code>personal_shopper.articles</code>
	 */
	public static final com.personalshopper.jooq.tables.Articles ARTICLES = new com.personalshopper.jooq.tables.Articles();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.personalshopper.jooq.tables.records.ArticlesRecord> getRecordType() {
		return com.personalshopper.jooq.tables.records.ArticlesRecord.class;
	}

	/**
	 * The column <code>personal_shopper.articles.article_id</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, java.lang.Long> ARTICLE_ID = createField("article_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>personal_shopper.articles.type</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, com.personalshopper.jooq.enums.ArticlesType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.personalshopper.jooq.enums.ArticlesType.class), this);

	/**
	 * The column <code>personal_shopper.articles.model</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, java.lang.String> MODEL = createField("model", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.articles.brand</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, java.lang.String> BRAND = createField("brand", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.articles.size</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, java.lang.Object> SIZE = createField("size", org.jooq.impl.DefaultDataType.getDefaultDataType("tinytext"), this);

	/**
	 * The column <code>personal_shopper.articles.colour</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, java.lang.String> COLOUR = createField("colour", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.articles.price</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, java.lang.Double> PRICE = createField("price", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>personal_shopper.articles.picture</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, java.lang.String> PICTURE = createField("picture", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.articles.date</code>. 
	 */
	public final org.jooq.TableField<com.personalshopper.jooq.tables.records.ArticlesRecord, java.sql.Timestamp> DATE = createField("date", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>personal_shopper.articles</code> table reference
	 */
	public Articles() {
		super("articles", com.personalshopper.jooq.PersonalShopper.PERSONAL_SHOPPER);
	}

	/**
	 * Create an aliased <code>personal_shopper.articles</code> table reference
	 */
	public Articles(java.lang.String alias) {
		super(alias, com.personalshopper.jooq.PersonalShopper.PERSONAL_SHOPPER, com.personalshopper.jooq.tables.Articles.ARTICLES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.personalshopper.jooq.tables.records.ArticlesRecord, java.lang.Long> getIdentity() {
		return com.personalshopper.jooq.Keys.IDENTITY_ARTICLES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.personalshopper.jooq.tables.records.ArticlesRecord> getPrimaryKey() {
		return com.personalshopper.jooq.Keys.KEY_ARTICLES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.personalshopper.jooq.tables.records.ArticlesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.personalshopper.jooq.tables.records.ArticlesRecord>>asList(com.personalshopper.jooq.Keys.KEY_ARTICLES_PRIMARY, com.personalshopper.jooq.Keys.KEY_ARTICLES_ARTICLE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.personalshopper.jooq.tables.Articles as(java.lang.String alias) {
		return new com.personalshopper.jooq.tables.Articles(alias);
	}
}
