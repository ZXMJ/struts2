package com.ultra.bean;

public class TestValueStack {

	private String productName;

	private String productDesc;

	public TestValueStack(String productName, String productDesc) {
		this.productName = productName;
		this.productDesc = productDesc;

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String save(){
		return "success";
	}
}
