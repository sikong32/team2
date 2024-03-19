<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
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
	text-align: center;
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

td:nth-child(3) {
	text-align: left;
}
</style>
</head>
<body>
	<form action="reply" method="get">
		<table border="1" align="center">
		<caption>자세히 보기</caption>
			<tr>
				<th>글번호</th>
				<th>작가</th>
				<th>글제목</th>
				<th>글내용</th>
				<th>작성일자</th>
				<th>조회수</th>
				<th>그룹수</th>
				<th>스탭수(내려쓰기)</th>
				<th>인던트(들여쓰기수)</th>
			</tr>
			<c:forEach items="${list}" var="s">
				<tr>
					<td><input type="hidden" name="bnum" value="${s.bnum}">${s.bnum}</td>
					<td>${s.writer}</td>
					<td>${s.title}</td>
					<td>${s.content}</td>
					<td>${s.writerday}</td>
					<td>${s.readcnt}</td>
					<td>${s.groups}</td>
					<td>${s.step}</td>
					<td>${s.indent}</td>
				</tr>
			</c:forEach>
				<tr>
				</tr>
			<tr>
				<td colspan="10">
<!-- 					<input type="text" name="comment"> -->
				<input type="submit" value="댓글">
				<input type="button" value="돌아가기" onclick="location.href='boardout'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>