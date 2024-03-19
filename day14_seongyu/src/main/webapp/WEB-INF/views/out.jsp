<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<table border="1" width="350px" align="center">
<caption>회원정보 출력</caption>
<tr>
	<th>아이디</th>
	<th>이름</th>
	<th>전화</th>
	<th>총점</th>
	<th>직위</th>
	<th>수령액</th>
</tr>
<c:forEach items="${list}" var="a">
<tr>
	<td>${a.id}</td>
	<td>${a.name}</td>
	<td>${a.phone}</td>
	<td>${a.tot}</td>
	<td>${a.insaDTO.revel}</td>
	<td>${a.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>