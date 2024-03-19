<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="id_loginfix" method="get">
		<table border="1" align="center">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id"></td>				
			</tr>
			<tr>
				<th>비번</th>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<th>
				<input type="submit" value="전송">
				<input type="reset" value="취소">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>