package com.softech.Entity;

import java.time.LocalDate;

public class OrderHeader {
	
	private int ordId;
	private String userName;
	private String userMobileNo;
	private String purchaseOrdNo;
	private LocalDate purchaseOrdDate;
	private OrderItems orderItems;
	private Address address;
	
	
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public String getPurchaseOrdNo() {
		return purchaseOrdNo;
	}
	public void setPurchaseOrdNo(String purchaseOrdNo) {
		this.purchaseOrdNo = purchaseOrdNo;
	}
	public LocalDate getPurchaseOrdDate() {
		return purchaseOrdDate;
	}
	public void setPurchaseOrdDate(LocalDate purchaseOrdDate) {
		this.purchaseOrdDate = purchaseOrdDate;
	}
	public OrderItems getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrderHeader [ordId=" + ordId + ", userName=" + userName + ", userMobileNo=" + userMobileNo
				+ ", purchaseOrdNo=" + purchaseOrdNo + ", purchaseOrdDate=" + purchaseOrdDate + ", orderItems="
				+ orderItems + ", address=" + address + "]";
	}
	public OrderHeader(int ordId, String userName, String userMobileNo, String purchaseOrdNo, LocalDate purchaseOrdDate,
			OrderItems orderItems, Address address) {
		super();
		this.ordId = ordId;
		this.userName = userName;
		this.userMobileNo = userMobileNo;
		this.purchaseOrdNo = purchaseOrdNo;
		this.purchaseOrdDate = purchaseOrdDate;
		this.orderItems = orderItems;
		this.address = address;
	}
	
	
	

}
