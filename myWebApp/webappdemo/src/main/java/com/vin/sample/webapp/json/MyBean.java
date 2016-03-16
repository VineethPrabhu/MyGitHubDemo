package com.vin.sample.webapp.json;

/**
 * Sample POJO class to be used for JSON demo
 */
public class MyBean {

	private String name;

	private String address;

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean [name=" + this.name + ", address=" + this.address + "]";
	}

}
