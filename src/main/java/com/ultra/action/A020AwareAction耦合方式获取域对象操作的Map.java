package com.ultra.action;

import java.util.Map;

import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.HttpParametersAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class A020AwareAction耦合方式获取域对象操作的Map implements ApplicationAware, SessionAware, RequestAware, HttpParametersAware {

	private Map<String, Object> application;
	private Map<String, Object> request;
	private Map<String, Object> session;

	private HttpParameters parameters;

	public String execute() {

		// 向applicationMap中添加键值对
		application.put("applicationKey", "applicationValue");

		// 从applicationMap中获取值
		Object applicationDate = application.get("applicationDate");
		System.out.println("applicationDate: " + applicationDate);

		// 向sessionMap中添加键值对
		session.put("sessionKey", "sessionValue");

		// 从sessionMap中获取值
		Object sessionDate = session.get("sessionDate");
		System.out.println("sessionDate: " + sessionDate);

		((SessionMap<String, Object>)session).invalidate();
		
		request.put("requestKey", "requestValue");

		// 从requestMap中获取值
		// 超链接提交的request和当前jsp的request不是同一个request，所以获取不到request存放的值
		Object requestDate = request.get("requestDate");
		System.out.println("requestDate: " + requestDate);

		//
		Parameter parameter = parameters.get("name");
		if (parameter.isMultiple()) {
			String[] names = parameter.getMultipleValues();
			System.out.println("names: " + names);
		} else {
			String name = parameter.getValue();
			System.out.println("name: " + name);

		}
		return "success";
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setParameters(HttpParameters parameters) {
		this.parameters = parameters;
	}
}
