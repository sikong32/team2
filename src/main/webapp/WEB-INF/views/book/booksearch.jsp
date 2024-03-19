<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="booksearchout">
		<table border="1" align="center">
			<tr>
				<th><select name="bname">
						<option value="bweiter">저자명
						<option value="bname">도서명
				</select></th>
				<td><input type="text" name="searchname"></td>
			</tr>
			<tr>
				<th><input type="submit" value="전송"> <input
					type="reset" value="취소"></th>
			</tr>
		</table>
	</form>
</body>
</html>