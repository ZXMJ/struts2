package com.ultra.action;

import java.util.Arrays;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class A110I18NAction extends ActionSupport {

	private static final long serialVersionUID = 7264449149498076890L;

	private Date date;

	public String execute() {
		date = new Date();
		String usernameTemp = getText("username");
		System.out.println(usernameTemp);
		getText("time", Arrays.asList(new Date()));
		return SUCCESS;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
