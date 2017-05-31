package com.ultra.action;

public class A090ExceptionMappingInterceptorAction {

	public String execute() {
		int i = 10 / 0;
		System.out.println(i);
		return "success";
	}
}
