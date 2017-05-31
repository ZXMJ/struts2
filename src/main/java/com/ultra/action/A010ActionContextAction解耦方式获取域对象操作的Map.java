package com.ultra.action;

import java.util.Map;

import org.apache.struts2.dispatcher.Parameter;

import com.opensymphony.xwork2.ActionContext;

public class A010ActionContextAction解耦方式获取域对象操作的Map {

	public String execute() {
		ActionContext actionContext = ActionContext.getContext();

		// 获取application操作的map
		Map<String, Object> applicationMap = actionContext.getApplication();

		// 向applicationMap中添加键值对
		applicationMap.put("applicationKey", "applicationValue");

		// 从applicationMap中获取值
		Object applicationDate = applicationMap.get("applicationDate");
		System.out.println("applicationDate: " + applicationDate);

		// 获取session操作的map
		Map<String, Object> sessionMap = actionContext.getSession();

		// 向sessionMap中添加键值对
		sessionMap.put("sessionKey", "sessionValue");

		// 从sessionMap中获取值
		Object sessionDate = sessionMap.get("sessionDate");
		System.out.println("sessionDate: " + sessionDate);

		// 获取request操作的Map
		@SuppressWarnings("unchecked")
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");

		// 向requestMap中添加键值对
		requestMap.put("requestKey", "requestValue");

		// 从requestMap中获取值
		// 超链接提交的request和当前jsp的request不是同一个request，所以获取不到request存放的值
		Object requestDate = requestMap.get("requestDate");
		System.out.println("requestDate: " + requestDate);

		// 获取parameter操作的Map
		Map<String, Parameter> parameterMap = actionContext.getParameters();

		// 从parameterMap中获取值
		Parameter parameter = parameterMap.get("name");
		if (parameter.isMultiple()) {
			String[] names = parameter.getMultipleValues();
			System.out.println(names);
		} else {
			String name = parameter.getValue();
			System.out.println(name);
		}
		
		return "success";
	}
}
