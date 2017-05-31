package com.ultra.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

public class A040ServletAwareAction耦合方式获取域对象 implements ServletContextAware, ServletRequestAware, ServletResponseAware {

	@Override
	public void setServletContext(ServletContext context) {
		System.out.println("setServletContext...");
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		System.out.println("setServletRequest...");
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		System.out.println("setServletResponse...");
	}

	public String execute() {
		return "success";
	}
}
