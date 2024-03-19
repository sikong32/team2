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
	<form action="id_delete" method="get">
		<table border="1" align="center">
			<tr>
				<th>아이디</th>
				<th>비번</th>
				<th>이름</th>
				<th>주소지</th>
				<th>전화번호</th>
			</tr>
			<c:forEach items="${list}" var="s">
				<tr>
					<td><input type="hidden" name="deleteid" value="${s.id}">${s.id}</td>
					<td><input type="text" name="deletepw" placeholder="비번을 입력해주세요"></td>
					<td>${s.name}</td>
					<td>${s.address}</td>
					<td>${s.tel}</td>
				</tr>
			</c:forEach>
			<tr>
				<th>
				<input type="submit" value="삭제">
				<input type="reset" value="취소">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>