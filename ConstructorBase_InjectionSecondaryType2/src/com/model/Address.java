package com.model;

public class Address {
	private String city;
	private String area;
	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + "]";
	}
	public Address(String city, String area) {
		super();
		this.city = city;
		this.area = area;
	}
	
		
}
