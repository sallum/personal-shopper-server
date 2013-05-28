/**
 * This class is generated by jOOQ
 */
package com.generated.sources;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>personal_shopper</code> 
 * schema
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.1"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<com.generated.sources.tables.records.ArticlesRecord, java.lang.Long> IDENTITY_ARTICLES = Identities0.IDENTITY_ARTICLES;
	public static final org.jooq.Identity<com.generated.sources.tables.records.ShopsRecord, java.lang.Long> IDENTITY_SHOPS = Identities0.IDENTITY_SHOPS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<com.generated.sources.tables.records.ArticlesRecord> KEY_ARTICLES_PRIMARY = UniqueKeys0.KEY_ARTICLES_PRIMARY;
	public static final org.jooq.UniqueKey<com.generated.sources.tables.records.ArticlesRecord> KEY_ARTICLES_ARTICLE_ID = UniqueKeys0.KEY_ARTICLES_ARTICLE_ID;
	public static final org.jooq.UniqueKey<com.generated.sources.tables.records.ShopsRecord> KEY_SHOPS_PRIMARY = UniqueKeys0.KEY_SHOPS_PRIMARY;
	public static final org.jooq.UniqueKey<com.generated.sources.tables.records.ShopsRecord> KEY_SHOPS_SHOP_ID = UniqueKeys0.KEY_SHOPS_SHOP_ID;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<com.generated.sources.tables.records.ArticlesRecord, java.lang.Long> IDENTITY_ARTICLES = createIdentity(com.generated.sources.tables.Articles.ARTICLES, com.generated.sources.tables.Articles.ARTICLES.ARTICLE_ID);
		public static org.jooq.Identity<com.generated.sources.tables.records.ShopsRecord, java.lang.Long> IDENTITY_SHOPS = createIdentity(com.generated.sources.tables.Shops.SHOPS, com.generated.sources.tables.Shops.SHOPS.SHOP_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<com.generated.sources.tables.records.ArticlesRecord> KEY_ARTICLES_PRIMARY = createUniqueKey(com.generated.sources.tables.Articles.ARTICLES, com.generated.sources.tables.Articles.ARTICLES.ARTICLE_ID);
		public static final org.jooq.UniqueKey<com.generated.sources.tables.records.ArticlesRecord> KEY_ARTICLES_ARTICLE_ID = createUniqueKey(com.generated.sources.tables.Articles.ARTICLES, com.generated.sources.tables.Articles.ARTICLES.ARTICLE_ID);
		public static final org.jooq.UniqueKey<com.generated.sources.tables.records.ShopsRecord> KEY_SHOPS_PRIMARY = createUniqueKey(com.generated.sources.tables.Shops.SHOPS, com.generated.sources.tables.Shops.SHOPS.SHOP_ID);
		public static final org.jooq.UniqueKey<com.generated.sources.tables.records.ShopsRecord> KEY_SHOPS_SHOP_ID = createUniqueKey(com.generated.sources.tables.Shops.SHOPS, com.generated.sources.tables.Shops.SHOPS.SHOP_ID);
	}
}
