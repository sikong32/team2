<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="booksave" method="post" enctype="multipart/form-data">
		<table border="1" align="center">
			<tr>
				<th>저자명</th>
				<td><input type="text" name="bweiter"></td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bname"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><input type="text" name="bcontent"></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="text" name="bprice"></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="date" name="bdate"></td>
			</tr>
			<tr>
				<th>표지</th>
				<td><input type="file" name="bimag"></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="전송">
				<input type="reset" value="취소">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>