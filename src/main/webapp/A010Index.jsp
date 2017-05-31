<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>跳转</title>
</head>
<body>
	<a href="input.action">to inputPage</a>
	<br>
	<br>
	<a href="testActionContext.action?name=q&name=w">to testActionContext</a>
	<br>
	<br>
	<a href="testAware.action?name=q">to testAware</a>
	<br>
	<br>
	<a href="testServletActionContext.action?name=q">to testServletActionContext</a>
	<br>
	<br>
	<a href="testServletAware.do?name=q">to testServletAware</a>
	<br>
	<br>
	<a href="testResult.action?age=0">to testResult</a>
	<br>
	<br>
	<a href="product-add.action">to add</a>
	<br>
	<br>
	<a href="product-update.action">to update</a>
	<br>
	<br>
	<a href="product-delete.action">to delete</a>
	<br>
	<br>
	<a href="product-query.action">to query</a>
	<br>
	<br>
	<a href="testDynamicMethodInvocationAction!update.action">to DynamicMethodInvocationAction</a>
	<br>
	<br>
	<a href="testExceptionMappingInterceptor.action">to ExceptionMappingInterceptor</a>
	<br>
	<br>
	<a href="testTag.action?name=ultra&age=10">to Tag</a>
	<br>
	<br>
	<a href="A055PreTag.jsp">to preTag</a>
	<br>
	<br>
	<a href="A060FormTag.jsp">to formTag</a>
	<br>
	<br>
	<a href="emp-list">to empList</a>
	<br>
	<br>
	<a href="A070convert.jsp">to convertPage</a>
	<br>
	<br>
	<a href="A080i18n.jsp">to i18nPage</a>
	<br>
	<br>
	<a href="testI18N.action?request_locale=en_US">to i18nAction_US</a>
	<br>
	<br>
	<a href="testI18N.action?request_locale=zh_CN">to i18nAction_CN</a>
	<br>
	<br>
	<a href="A090Validation.jsp">to validationPage</a>
	<br>
	<br>
	<a href="A100Upload.jsp">to uploadPage</a>
	<br>
	<br>
	<a href="A110Download.jsp">to downloadPage</a>
	<br>
	<br>
	<a href="A120Token.jsp">to TokenPage</a>
	<br>
	<br>
	<%
		if (application.getAttribute("applicationDate") == null) {
			application.setAttribute("applicationDate", new Date());
		}
		if (session.getAttribute("sessionDate") == null) {
			session.setAttribute("sessionDate", new Date());
		}
		if (request.getAttribute("requestDate") == null) {
			request.setAttribute("requestDate", new Date());
		}
	%>
</body>
</html>