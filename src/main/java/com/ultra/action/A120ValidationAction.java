package com.ultra.action;

import com.opensymphony.xwork2.ActionSupport;

public class A120ValidationAction extends ActionSupport {

	private static final long serialVersionUID = 5496616624743391392L;
	private int age;
	private Integer count;
	private String pass;
	private String pass2;
	private String idCard;

	public String execute() {
		System.out.println("age: " + age);
		System.out.println("count: " + count);
		System.out.println("pass: " + pass + " pass2: " + pass2);
		return "input";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPass2() {
		return pass2;
	}

	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
}
