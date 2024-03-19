<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>간단한 계시판</title>
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
	<form action="">
		<table border="1" align="center">
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
					<td><a href="boarddelete?bnum=${s.bnum}">${s.bnum}</a></td>
					<td>${s.writer}</td>
					<td>
					<c:if test="${s.indent > 0}">
						<c:forEach var="i" begin="1" end="${s.indent}">
						ㄴ
						</c:forEach>
					</c:if>
					<a href="boarddetail?bnum=${s.bnum}">${s.title}</a> 
					</td>
					<td>${s.content}</td>
					<td>${s.writerday}</td>
					<td>${s.readcnt}</td>
					<td>${s.groups}</td>
					<td>${s.step}</td>
					<td>${s.indent}</td>
				</tr>
			</c:forEach>
			   <!-- 페이징처리 -->
				<tr style="border-left: none;border-right: none;border-bottom: none">
				   <td colspan="5" style="text-align: center;">
				   
				   <c:if test="${paging.startPage!=1 }">
				      <a href="page?nowPage=${paging.startPage-1 }&cntPerPage=${paging.cntPerPage}">◀</a>
				      
				   </c:if>   
				   
				      <c:forEach begin="${paging.startPage }" end="${paging.endPage}" var="p"> 
				         <c:choose>
				            <c:when test="${p == paging.nowPage }">
				               <b><span style="color: red;">${p}</span></b>
				            </c:when>   
				            <c:when test="${p != paging.nowPage }">
				               <a href="page?nowPage=${p}&cntPerPage=${paging.cntPerPage}">${p}</a>
				            </c:when>   
				         </c:choose>
				      </c:forEach>
				      <c:if test="${paging.endPage != paging.lastPage}">
				      <a href="page?nowPage=${paging.endPage+1}&cntPerPage=${paging.cntPerPage }">▶</a>
				   </c:if>

				   </td>
				</tr>
				<!-- 페이징처리 -->
		</table>
	</form>
</body>
</html>
