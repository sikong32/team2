<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

</head>
<body>
	<c:forEach items="${list}" var="s">
		<form action="replysave" method="get">
			<input type="hidden" name="bnum" value="${s.bnum}"> <input
				type="hidden" name="groups" value="${s.groups}"> <input
				type="hidden" name="step" value="${s.step}"> <input
				type="hidden" name="indent" value="${s.indent}">

			<table border="1" align="center">
				<caption>자세히 보기</caption>
				<tr>
					<th>작가</th>
					<td><input type="text" name="writer"></td>
				</tr>
				<tr>
					<th>글제목</th>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<th>글내용</th>
					<td><input type="text" name="content"></td>
				</tr>
				<tr>
				<tr>
					<th colspan="5"><input type="submit" value="전송"> <input
						type="reset" value="취소"></th>
				</tr>
			</table>
		</form>
	</c:forEach>
</body>
<body>

</body>
</html>