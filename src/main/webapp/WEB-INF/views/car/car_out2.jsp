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
			<tr>
				<th>사원번호</th>
				<th>지점명</th>
				<th>차량명</th>
				<th>수량</th>
				<th>가격</th>
				<th>판매액</th>
			</tr>
			<c:forEach items="${list}" var="s">
			<tr>
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
				<c:if test="${paging.startpage!=1} ">
					<a href="car_out?xianpage=${paging.startpage-1}&xianshiliang=${paging.xianshiliang}">◀</a>
				</c:if>	
				<c:forEach begin="${paging.startpage }" end="${paging.endpage}" var="s">
				<c:choose>
					<c:when test="${s==paging.xianpage}">
						<b><span>${s}</span></b>					
					</c:when>
					<c:when test="${s !=paging.xianpage }">
						<a href="car_out?xianpage=${s}&xianshiliang=${paging.xianshiliang}">${s}</a>
					</c:when>
				</c:choose>
				</c:forEach>
				<c:if test="${paging.endpage != paging.zhongliang}">
					<a href="car_out?xianpage=${paging.endpage+1}&xianshiliang=${paging.xianshiliang}">▶</a>					
				</c:if>
			</td>
			</tr>
			<!-- 페이징 처리 끝 -->
		</table>
	</form>
</body>
</html>