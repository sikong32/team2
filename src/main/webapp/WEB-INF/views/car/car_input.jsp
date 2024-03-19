<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="car_save">
		<table border="1" align="center">
			<tr>
				<th>지점명</th>
				<td><select name="jijum">
				<option value="서울">서울
				<option value="부산">부산
				<option value="광주">광주
				<option value="전주">전주
				</select></td>
			</tr>
			<tr>
				<th>차량명</th>
				<td><input type="text" name="carname"></td>
			</tr>
			<tr>
				<th>수량</th>
				<td><input type="number" name="carsu"></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="number" name="carprice"></td>
			</tr>
			<tr>
				<th><input type="submit" value="전송"></th>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>