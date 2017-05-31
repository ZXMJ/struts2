<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>验证</title>
</head>
<body>
	<s:debug></s:debug>
	<s:actionerror/>
	<s:form action="testValidation.action">
		<s:textfield name="age" label="age"></s:textfield>
		<s:textfield name="count" label="count"></s:textfield>
		<s:textfield name="idCard" label="idCard"></s:textfield>
		<s:password name="pass" label="pass"></s:password>
		<s:password name="pass2" label="pass2"></s:password>
		<s:submit></s:submit>
	</s:form>
</body>
</html>