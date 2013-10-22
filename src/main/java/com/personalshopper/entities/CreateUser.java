package com.personalshopper.entities;

import java.sql.Date;

/**
 * Json entity for creating a new user
 * 
 * @author Ignacio Mulas
 * 
 */
public class CreateUser {

	private Date birthday;
	private String email;
	// TODO: Change to enum
	private String gender;
	// Make enums with sizes as well
	private String sizePants;
	private String sizeShirts;
	private String sizeShoes;
	private String userName;

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the sizePants
	 */
	public String getSizePants() {
		return sizePants;
	}

	/**
	 * @return the sizeShirts
	 */
	public String getSizeShirts() {
		return sizeShirts;
	}

	/**
	 * @return the sizeShoes
	 */
	public String getSizeShoes() {
		return sizeShoes;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param sizePants
	 *            the sizePants to set
	 */
	public void setSizePants(String sizePants) {
		this.sizePants = sizePants;
	}

	/**
	 * @param sizeShirts
	 *            the sizeShirts to set
	 */
	public void setSizeShirts(String sizeShirts) {
		this.sizeShirts = sizeShirts;
	}

	/**
	 * @param sizeShoes
	 *            the sizeShoes to set
	 */
	public void setSizeShoes(String sizeShoes) {
		this.sizeShoes = sizeShoes;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
