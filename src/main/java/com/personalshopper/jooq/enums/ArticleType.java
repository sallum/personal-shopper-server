/**
 * This class is generated by jOOQ
 */
package com.personalshopper.jooq.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked" })
public enum ArticleType implements org.jooq.EnumType {

	shoe("shoe"),

	dress("dress"),

	shirt("shirt"),

	;

	private final java.lang.String literal;

	private ArticleType(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "article_type";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
