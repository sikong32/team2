<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="id_mdifyfix">
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
			</tr>
			<c:forEach items="${list}" var="s">
				<tr>
					<td><input type="text" name="id" readonly="readonly" value="${s.id}"></td>
					<td><input type="text" name="pw" placeholder="${s.pw}"></td>
					<td><input type="text" name="name" placeholder="${s.name}"></td>
					<td><input type="text" name="tel" placeholder="${s.tel}"></td>
					<td>
					<input type="radio" name="sb" value="남자" >남자
					<input type="radio" name="sb" value="여자" >여자
					</td>
					<td><input type="text" name="address" placeholder="${s.address}"></td>
					<td><input type="text" name="hobby" placeholder="${s.hobby}"></td>
					<td><textarea rows="5px" cols="20px" name="insa" placeholder="${s.insa}">					
					</textarea> </td>
				</tr>
			</c:forEach>
			<tr>
				<th><input type="submit" value="수정"> <input
					type="reset" value="취소"></th>
			</tr>
		</table>
	</form>
</body>
</html>