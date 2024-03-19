<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		table{
			margin: auto;
		}
	</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>총점</th>
			<th>직위</th>
			<th>수령액</th>
		</tr>
		<c:forEach items="${list}" var="list">
		<tr>
			<td>${list.serial}</td>
			<td>${list.name}</td>
			<td>${list.tel}</td>
			<td>${list.score_dto.tot}</td>
			<td>${list.insa_dto.rank}</td>
			<td>${list.insa_dto.total_pay}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>