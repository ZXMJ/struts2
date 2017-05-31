<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
</head>
<body>
	<s:form action="testUpload.action" method="post"
		enctype="multipart/form-data">
		<s:file name="upload" label="File" />
		<s:textfield name="desc" value="%{desc[0]}" label="Desc"></s:textfield>
		<s:file name="upload" label="File" />
		<s:textfield name="desc" value="%{desc[1]}" label="Desc"></s:textfield>
		<s:file name="upload" label="File" />
		<s:textfield name="desc" value="%{desc[2]}" label="Desc"></s:textfield>
		<s:submit />
	</s:form>
</body>
</html>