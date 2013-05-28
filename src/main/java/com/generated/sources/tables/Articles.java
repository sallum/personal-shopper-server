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
public class Articles extends org.jooq.impl.TableImpl<com.generated.sources.tables.records.ArticlesRecord> {

	private static final long serialVersionUID = -1595200943;

	/**
	 * The singleton instance of <code>personal_shopper.articles</code>
	 */
	public static final com.generated.sources.tables.Articles ARTICLES = new com.generated.sources.tables.Articles();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.generated.sources.tables.records.ArticlesRecord> getRecordType() {
		return com.generated.sources.tables.records.ArticlesRecord.class;
	}

	/**
	 * The column <code>personal_shopper.articles.article_id</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ArticlesRecord, java.lang.Long> ARTICLE_ID = createField("article_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>personal_shopper.articles.type</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ArticlesRecord, com.generated.sources.enums.ArticlesType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.generated.sources.enums.ArticlesType.class), this);

	/**
	 * The column <code>personal_shopper.articles.model</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ArticlesRecord, java.lang.String> MODEL = createField("model", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.articles.brand</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ArticlesRecord, java.lang.String> BRAND = createField("brand", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.articles.size</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ArticlesRecord, java.lang.Object> SIZE = createField("size", org.jooq.impl.DefaultDataType.getDefaultDataType("tinytext"), this);

	/**
	 * The column <code>personal_shopper.articles.colour</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ArticlesRecord, java.lang.String> COLOUR = createField("colour", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * The column <code>personal_shopper.articles.price</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ArticlesRecord, java.lang.Double> PRICE = createField("price", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>personal_shopper.articles.picture</code>. 
	 */
	public final org.jooq.TableField<com.generated.sources.tables.records.ArticlesRecord, java.lang.String> PICTURE = createField("picture", org.jooq.impl.SQLDataType.CLOB.length(65535), this);

	/**
	 * Create a <code>personal_shopper.articles</code> table reference
	 */
	public Articles() {
		super("articles", com.generated.sources.PersonalShopper.PERSONAL_SHOPPER);
	}

	/**
	 * Create an aliased <code>personal_shopper.articles</code> table reference
	 */
	public Articles(java.lang.String alias) {
		super(alias, com.generated.sources.PersonalShopper.PERSONAL_SHOPPER, com.generated.sources.tables.Articles.ARTICLES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.generated.sources.tables.records.ArticlesRecord, java.lang.Long> getIdentity() {
		return com.generated.sources.Keys.IDENTITY_ARTICLES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.generated.sources.tables.records.ArticlesRecord> getPrimaryKey() {
		return com.generated.sources.Keys.KEY_ARTICLES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.generated.sources.tables.records.ArticlesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.generated.sources.tables.records.ArticlesRecord>>asList(com.generated.sources.Keys.KEY_ARTICLES_PRIMARY, com.generated.sources.Keys.KEY_ARTICLES_ARTICLE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.generated.sources.tables.Articles as(java.lang.String alias) {
		return new com.generated.sources.tables.Articles(alias);
	}
}