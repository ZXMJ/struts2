package com.ultra.action;

import com.opensymphony.xwork2.ActionSupport;

public class A140TokenAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String name;

	@Override
	public String execute() throws Exception {
		System.out.println(name);
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
