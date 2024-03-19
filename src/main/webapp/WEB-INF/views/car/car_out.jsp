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
				<th>사원번호</th>
				<th>지점명</th>
				<th>차량명</th>
				<th>수량</th>
				<th>가격</th>
				<th>판매액</th>
			</tr>
			<c:forEach items="${list}" var="s">
			<tr style="text-align: center;">
				<td>${s.sawonnum}</td>
				<td>${s.jijum}</td>
				<td>${s.carname}</td>
				<td>${s.carsu}</td>
				<td>${s.carprice}</td>
				<td>${s.carsu * s.carprice}</td>
			</tr>
			</c:forEach>
			<!-- 페이징 처리 -->
			<tr>
			<td>
			<% Car_page_DTO dto = (Car_page_DTO)request.getAttribute("dto");%>
			<!-- 페이징 처리 끝 -->
			<!-- 페이징 처리2 -->
			<tr>
			<td>
			<% if(dto.get시작페이지() != 1) {	%>
			<a href="car_out?현재페이지=<%= dto.get시작페이지() - 1 %>&페이지보여줄글수=<%= dto.get페이지보여줄글수() %>">◀</a>
			<% }
				for(int s = dto.get시작페이지(); s<= dto.get끝페지(); s++ ){
					if (s == dto.get현재페이지()){
						%>
						<b><span style="color: red;"><%= s %></span></b>
						<%
					}else{
						%>
						<a href="car_out?현재페이지=<%= s %>&페이지보여줄글수=<%= dto.get페이지보여줄글수()%>"><%= s %></a>
						<%
					}
				}
				if (dto.get끝페지() != dto.get전체페이지()){
					%>
					<a href="car_out?현재페이지=<%=dto.get끝페지()+1%>&페이지보여줄글수=<%= dto.get페이지보여줄글수()%>">▶</a>
					<%
				}
			%>
			</td>
			</tr>

		</table>
	</form>
</body>
</html>