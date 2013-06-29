package com.personalshopper.entities;

/**
 * CreateShop entity. It matches with the json sent to create a new shop record.
 * 
 * @author Ignacio Mulas
 * 
 */
public class CreateShop {

	private String address;
	private String email;
	private float latitude;
	private float longitude;
	private String name;
	private String schedule;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the latitude
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the schedule
	 */
	public String getSchedule() {
		return schedule;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param schedule
	 *            the schedule to set
	 */
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
}
