package com.javacircle.soa.model;

public class Sales {

	private String productId;
	private String orderDate;
	private String shipDate;
	private long priceInCents;
	private int score;
	private String postalCode;
	private int serviceLevel;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	public long getPriceInCents() {
		return priceInCents;
	}
	public void setPriceInCents(long priceInCents) {
		this.priceInCents = priceInCents;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getServiceLevel() {
		return serviceLevel;
	}
	public void setServiceLevel(int serviceLevel) {
		this.serviceLevel = serviceLevel;
	}
	
	@Override
	public String toString() {
		return "Sales [productId=" + productId + ", orderDate=" + orderDate + ", shipDate=" + shipDate
				+ ", priceInCents=" + priceInCents + ", score=" + score + ", postalCode=" + postalCode
				+ ", serviceLevel=" + serviceLevel + "]";
	}
	
}
