package com.softech.Entity;

public class OrderItems {
	
	private int ordItemsId;
	private int productNo;
	private String productName;
	private String productQuantity;
	private String productPrice;
	public int getOrdItemsId() {
		return ordItemsId;
	}
	public void setOrdItemsId(int ordItemsId) {
		this.ordItemsId = ordItemsId;
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "OrderItems [ordItemsId=" + ordItemsId + ", productNo=" + productNo + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]";
	}
	public OrderItems(int ordItemsId, int productNo, String productName, String productQuantity, String productPrice) {
		super();
		this.ordItemsId = ordItemsId;
		this.productNo = productNo;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}
	
	

}
