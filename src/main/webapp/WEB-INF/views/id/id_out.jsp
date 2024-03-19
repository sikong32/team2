<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form {
	background-color: #fff;
	border-radius: 8px;
	padding: 20px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

table {
	width: auto;
	border-collapse: collapse;
	margin-top: 20px;
}

th, td {
	padding: 10px;
	text-align: left;
}

th {
	background-color: #4caf50;
	color: white;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

a {
	text-decoration: none;
	color: #007BFF;
}

a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<form action="">
		<table border="1" align="center">
			<tr>
				<th>아이디</th>
				<th>비번</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>성별</th>
				<th>거주지</th>
				<th>취미</th>
				<th>인사말</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach items="${list}" var="s">
				<tr>
					<td>${s.id}</td>
					<td>${s.pw}</td>
					<td>${s.name}</td>
					<td>${s.tel}</td>
					<td>${s.sb}</td>
					<td>${s.address}</td>
					<td>${s.hobby}</td>
					<td>${s.insa}</td>
					<td><a href="id_modifysearch?id=${s.id}">수정</a></td>
					<td><a href="id_deletesearch?id=${s.id}">삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>