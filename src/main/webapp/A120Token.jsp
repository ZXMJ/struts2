<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单重复提交</title>
</head>
<body>
	<!--
		表单重复提交:
			
		> 在不刷新表单页面的前提下: 
			>> 多次点击提交按钮
			>> 已经提交成功, 按 "回退" 之后, 再点击 "提交按钮".
			>> 在控制器响应页面的形式为转发情况下，若已经提交成功, 然后点击 "刷新(F5)"
		
		> 注意:
			>> 若刷新表单页面, 再提交表单不算重复提交
			>> 若使用的是 redirect 的响应类型, 已经提交成功后, 再点击 "刷新", 不是表单的重复提交
  	-->
	<s:form action="testToken">
		<s:token></s:token>
		<s:textfield name="name" label="name"></s:textfield>
		<s:submit />
	</s:form>
</body>
</html>