<%@page import="com.ezen.seo0308.car.Car_DTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ezen.seo0308.car.Car_page_DTO"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table border="1" align="center">
			<tr style="text-align: center;">
				<th>지점명</th>
				<th>판매액</th>
			</tr>
			<c:forEach items="${list}" var="s">
			<tr style="text-align: center;">
				<td>${s.jijum}</td>
				<td>${s.tot}</td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>