<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="bookcomment" method="post">
		<table border="1" align="center">
			<tr>
				<th>저자명</th>
				<th>도서명</th>
				<th>내용</th>
				<th>가격</th>
				<th>출판일자</th>
				<th>표지</th>
				<th>카운트</th>
			</tr>
			<c:forEach items="${list}" var="s">
			<tr>
<%-- 				<td><input type="hidden" name="bnum" value="${s.bnum}"></td> --%>
				<td>${s.bname}</td>
				<td>${s.bwriter}</td>
				<td>${s.bcontent}</td>
				<td>${s.bprice}</td>
				<td>${s.bdate}</td>
				<td><img src="./image/${s.bimage}" width="100px"></td>
				<td>${s.bcount}</td>
			</tr>
			</c:forEach>
<!-- 			<tr> -->
<!-- 				<th colspan="2"><input type="submit" value="전송"> -->
<!-- 				<input type="reset" value="취소"> -->
<!-- 				</th> -->
<!-- 			</tr> -->
		</table>
	</form>
</body>
</html>