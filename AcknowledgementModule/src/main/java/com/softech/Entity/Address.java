package com.softech.Entity;

public class Address {
	private int addId;
	private String addName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddName() {
		return addName;
	}
	public void setAddName(String addName) {
		this.addName = addName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addName=" + addName + ", address1=" + address1 + ", address2=" + address2
				+ ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + "]";
	}
	public Address(int addId, String addName, String address1, String address2, String city, String state,
			String postalCode) {
		super();
		this.addId = addId;
		this.addName = addName;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
	

}
