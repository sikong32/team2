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
	<form action="">
		<table border="1" align="center" style="text-align: center;">
			<tr>
				<th>이름</th>
				<th>나이</th>
			</tr>
			
			<tr>
				<th>${yuhyo_DTO.name}</th>
				<th>${yuhyo_DTO.age}</th>
			</tr>
		</table>
	</form>
</body>
</html>