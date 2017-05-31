<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示</title>
</head>
<body>
<s:debug></s:debug><br><br>
<!-- ognl从对象栈中取值(默认从栈顶开始遍历对象、直到找到或者结束) -->
ognlId:<s:property value="productId"/><br><br>

ELId:${product.productId}<br><br>
<!-- 从栈顶开始，索引是1的对象的productName属性值 -->
ognlName:<s:property value="[1].productName"/><br><br>

ELName:${product.productName}<br><br>

ognlDesc:<s:property value="[1].productDesc"/><br><br>

ELDesc:${product.productDesc}<br><br>

ognlPrice:<s:property value="productPrice"/><br><br>

ELPrice:${product.productPrice}<br><br>

<!-- ognl从Map栈中取值(EL和OGNL都能使用) -->

requestOGNLName:<s:property value="#request.product.productName"/><br><br>

attrOGNLName:<s:property value="#attr.product.productName"/><br><br>

requestELName:${requestScope.product.productName}<br><br>

sessionOGNLName:<s:property value="#session.test.productName"/><br><br>

attrOGNLName:<s:property value="#attr.test.productName"/><br><br>

sessionELName:${sessionScope.test.productName}<br><br>

<!-- ognl操作数组 -->
<%
	String[] array = new String[]{"aa","bb","cc","dd"};
	request.setAttribute("array", array);
%>

ognlLength:<s:property value="#attr.array.length"/><br><br>

ognlValue:<s:property value="#attr.array[0]"/><br><br>

ELValue:${array[1]}<br><br>

<!-- ognl操作集合 -->
<%
	List<String> list = new ArrayList<String>();
	list.add("aa");
	list.add("bb");
	list.add("cc");
	request.setAttribute("list", list);
%>
<!-- 调用普通方法(无参时下面两种等价) -->
ognlSize:<s:property value="#attr.list.size"/><br><br>

ognlSize:<s:property value="#attr.list.size()"/><br><br>

<!-- 从集合中取值 -->
ognlValue:<s:property value="#attr.list[2]"/><br><br>

ognlValue:<s:property value="#attr.list.get(2)"/><br><br>

ELValue:${list[2]}<br><br>

<!-- ognl操作Map -->
<%
	Map<String,String> map = new HashMap<String,String>();
	map.put("aa", "a");
	map.put("bb", "b");
	map.put("cc", "c");
	request.setAttribute("map", map);
%>
ognlMap:<s:property value="#attr.map['aa']"/><br><br>

ognlMap:<s:property value="#attr.map.bb"/><br><br>

ELMap:${requestScope.map.aa }<br><br>

ELMap:${requestScope.map['bb']}<br><br>

<!-- 调用public类的public静态属性 -->
Math@PI:<s:property value="@java.lang.Math@PI"/><br><br>

<!-- 调用public类的public静态方法(需要在配置文件中打开开关) -->
Math@cos():<s:property value="@java.lang.Math@cos(0)"/><br><br>

<!-- 调用对象栈的方法 (下面两种方法等价)-->
<s:property value="setProductName('te')"/>
<s:property value="productName"/><br><br>

<s:property value="[0].setProductName('st')"/>
<s:property value="[0].productName"/><br><br>

<%= request %>
</body>
</html>