<%@page import="com.ultra.product.bean.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>普通标签</title>
</head>
<body>
	<s:debug></s:debug>
	<br><br>
	<s:url value="/testUrl" var="url1">
		<!-- value值不可能为对象属性时，value即为属性值 -->
		<s:param name="productName" value="11"></s:param>
	</s:url>
	${url1}
	<br><br>
	<s:url value="/testUrl" var="url2">
		<!-- ognl会自动解析value -->
		<s:param name="productName1" value="productName"></s:param>
		<!-- 如果是拼字符串，用单引号引着 -->
		<s:param name="productName2" value="'productName'"></s:param>
	</s:url>
	${url2}
	<br><br>
	<s:url action="testActionUrl" namespace="/url" method="save" var="url3">
		<s:param name="productName" value="productName"></s:param>
		<s:param name="productName2" value="'productName'"></s:param>
	</s:url>	
	${url3}
	<br><br>
	<!-- 新url中添加旧url参数 -->
	<s:url action="testActionUrl" namespace="/url" method="save" var="url4">
		<s:param name="productName" value="productName"></s:param>
		<s:param name="name" value="#parameters.name[0]"></s:param>
	</s:url>	
	${url4}
	<br><br>
	<!-- 
		新url中添加旧url表单数据
		includeParams
			get:拼接form表单的get请求
			all:拼接form表单的post或者get请求
	 -->
	<s:url action="testActionUrl" namespace="/url" method="save" var="url5"  includeParams="all">
	</s:url>	
	${url5}
	<br><br>
	<!-- 创建一个变量存放到域对象中 -->
	<s:set var="desc" value="productName" scope="request"></s:set>
	${requestScope.desc }
	<br><br>
	<s:set var="desc" value="'productName'" scope="session"></s:set>
	${sessionScope.desc }
	<br><br>
	<!-- 将value值压入值栈，并在标签结束后弹出值栈 -->
	<s:push value="#attr.product">
		--${productName}--${productDesc}--${productPrice}--
	</s:push>
	<br><br>
	<s:if test="#parameters.age[0]<18&&#parameters.age[0]>0">
		未成年人...
	</s:if>
	<s:elseif test="#parameters.age[0]>=18">
		成年人...
	</s:elseif>
	<s:else>
		未知...
	</s:else>
	<br><br>
	<s:date name="#session.sessionDate" format="yyyy-MM-dd HH:mm:ss"/>
	<br><br>
	<%
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1002,"bb","bb",1000));
		list.add(new Product(1004,"dd","dd",1700));
		list.add(new Product(1003,"cc","cc",1600));
		list.add(new Product(1005,"ee","ee",1900));
		list.add(new Product(1001,"aa","aa",1200));
		request.setAttribute("list", list);
	%>
	<!-- 添加比较类 -->
	<s:bean var="sort" name="com.ultra.bean.ProductComparator"></s:bean>
	<!-- 对集合排序 -->
	<s:sort comparator="sort" source="#request.list">
		<s:iterator>
			<s:property/><br><br>
		</s:iterator>
	</s:sort>
	<br><br>
	<!-- 迭代器遍历 -->
	<!-- %{}强制进行OGNL解析 -->
	<s:iterator value="#request.list" var="prod">
		<s:property value="productName"/>
		<br><br>
	</s:iterator>
	<br><br>
	<s:a href="A010Index.jsp">to index</s:a>
	<br><br>
	<br><br>
	<br><br>
	
</body>
</html>