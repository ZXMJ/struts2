<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>emp list</title>
</head>
<body>
	<center>
		<s:form action="emp-save.action" method="post">
			<s:textfield name="firstName" label="firstName"></s:textfield>
			<s:textfield name="lastName" label="lastName"></s:textfield>
			<s:textfield name="email" label="email"></s:textfield>
			<s:submit></s:submit>
		</s:form>
		<table cellpadding="1" cellspacing="1" border="1">
			<thead>
				<tr>
					<td>Id</td>
					<td>FirstName</td>
					<td>LastName</td>
					<td>Email</td>
					<td colspan="2" align="center">操作</td>
				</tr>
			</thead>
			<s:iterator value="#request.emps" var="emp">
				<tbody>
					<tr>
						<td>${empId}</td>
						<td>${firstName}</td>
						<td>${lastName}</td>
						<td>${email}</td>
						<td><a href="emp-edit.action?empId=${empId}">Edit</a></td>
						<td><a href="emp-delete.action?empId=${empId}">Delete</a></td>
					</tr>
				</tbody>
			</s:iterator>
		</table>
	</center>
</body>
</html>