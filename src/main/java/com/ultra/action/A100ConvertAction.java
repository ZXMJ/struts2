package com.ultra.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class A100ConvertAction extends ActionSupport{

	private static final long serialVersionUID = -1574616516728246878L;
	private int age;
	private Date birth;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String execute(){
		System.out.println(age);
		System.out.println(birth);
		return "input";
	}
	
}
