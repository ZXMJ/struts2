<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>I18n</title>
</head>
<body>
	<s:debug></s:debug>
	<br>
	<br>
	<s:text name="time">
		<s:param value="date"></s:param>
	</s:text>
	<s:form>
		<s:textfield name="username" label="UserName"></s:textfield>
		<s:textfield name="username" label="%{getText('username')}"></s:textfield>
		<s:textfield name="username" key="username"></s:textfield>
		<s:password name="password" key="password"></s:password>
		<s:submit key="submit"></s:submit>
	</s:form>
</body>
</html>