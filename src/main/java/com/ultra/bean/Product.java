package com.ultra.bean;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class Product implements RequestAware,SessionAware{

	private int productId;
	private String productName;
	private String productDesc;
	private double productPrice;
	private Map<String, Object> session;
	private Map<String, Object> request;

	public Product() {}
	
	public Product(int productId, String productName, String productDesc, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", productPrice=" + productPrice + "]";
	}

	public String save() {
		this.setProductId(10010);
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		TestValueStack test = new TestValueStack("qq", "qq");
		valueStack.push(test);
		request.put("product", this);
		session.put("test", test);
		System.out.println("保存..." + this);
		return "details";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public String tag(){
		
		this.setProductId(1001);
		this.setProductName("CPU");
		this.setProductDesc("intel");
		this.setProductPrice(1200);
		
		request.put("product", this);
		return "tag";
	}
}
