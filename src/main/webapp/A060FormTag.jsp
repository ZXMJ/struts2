<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单标签</title>
</head>
<body>
	<%
		Map<String, String> sexMap = new HashMap<String, String>();
		sexMap.put("1", "Male");
		sexMap.put("0", "Female");
		request.setAttribute("sex", sexMap);

		Map<String, String> hobbyMap = new HashMap<String, String>();
		hobbyMap.put("reading", "reading");
		hobbyMap.put("sing", "sing");
		hobbyMap.put("swimming", "swimming");
		hobbyMap.put("running", "running");
		hobbyMap.put("sleep", "sleep");
		request.setAttribute("hobby", hobbyMap);
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("China", "China");
		countryMap.put("USA", "USA");
		countryMap.put("Japan", "Japan");
		request.setAttribute("country", countryMap);
	%>
	<s:form action="user-save.action">
		<s:textfield name="username" label="username"></s:textfield>

		<s:password name="password" label="password"></s:password>

		<s:radio name="sex" list="#request.sex" label="sex" ></s:radio>

		<s:checkbox name="married" label="married"></s:checkbox>

		<s:checkboxlist name="hobby"
			list="#{'reading':'reading','sing':'sing','swimming':'swimming','running':'running','sleep':'sleep'}"
			<%-- list="#{'reading':'reading','sing':'sing','swimming':'swimming','running':'running','sleep':'sleep'}" --%>
			label="hobby"
			listKey="">
		</s:checkboxlist>

		<s:select name="country"
			list="#{'China':'China','USA':'USA','Japan':'Japan' }"
			label="country"></s:select>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>