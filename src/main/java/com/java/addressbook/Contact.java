package com.java.addressbook;

public class Contact {
	String FirstName;
	String LastName;
	String address;
	String city;
	String state;
	String mailId;
	long pinCode;
	long phoneNum;

	public Contact(String firstName, String lastName, String address, String city, String state, String mailId,
			long pinCode, long phoneNum) {

		FirstName = firstName;
		LastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mailId = mailId;
		this.pinCode = pinCode;
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the mailId
	 */
	public String getMailId() {
		return mailId;
	}

	/**
	 * @param mailId the mailId to set
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	/**
	 * @return the pinCode
	 */
	public long getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the phoneNum
	 */
	public long getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Contact [FirstName=" + FirstName + ", LastName=" + LastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", mailId=" + mailId + ", pinCode=" + pinCode + ", phoneNum=" + phoneNum + "]";
	}

}
