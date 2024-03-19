<%@page import="com.ezen.seo0308.book.Book_DTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ezen.seo0308.book.Book_Page_DTO"%>
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
<form action="booksave" method="post" enctype="multipart/form-data">
		<table border="1" align="center">
			<tr>
				<th>저자명</th>
				<th>도서명</th>
				<th>내용</th>
				<th>가격</th>
				<th>출판일자</th>
				<th>표지</th>
				<th>카운트</th>
				<th>삭제</th>
				<th>수정</th>
			</tr>
			<c:forEach items="${list}" var="s">
			<tr>
				<td><a href="bookdeteil?bnum=${s.bnum}">${s.bname}</a></td>
				<td>${s.bwriter}</td>
				<td>${s.bcontent}</td>
				<td>${s.bprice}</td>
				<td>${s.bdate}</td>
				<td><img src="./image/${s.bimage}" width="100px"></td>
				<td>${s.bcount}</td>
				<td><a href="bookdelete?bnum=${s.bnum}&image=${s.bimage}">삭제</a></td>
				<td><a href="bookmodify?bnum=${s.bnum}">수정</a></td>
			</tr>
			</c:forEach>
			<!-- 페이징 처리 -->
<!-- 			<tr> -->
<!-- 			<td colspan="9" style="text-align: center;"> -->
<%-- 				<c:if test="${paging.startPage!=1 }"> --%>
<%-- 					<a href="bookpage?nowPage=${paging.startPage-1}&cntPerPage=${paging.cntPerPage}">◀</a> --%>
<%-- 				</c:if> --%>
<%-- 			<c:forEach begin="${paging.startPage}" end="${paging.endPage}" var="s"> --%>
<%-- 				<c:choose> --%>
<%-- 					<c:when test="${s==paging.nowPage}"> --%>
<%-- 					<b><span style="color: blue;">${s}  </span></b> --%>
<%-- 					</c:when> --%>
<%-- 					<c:when test="${s != paging.nowPage}"> --%>
<%-- 						<a href="bookpage?nowPage=${s}&cntPerPage=${paging.cntPerPage}">${s}  </a> --%>
<%-- 					</c:when> --%>
<%-- 				</c:choose> --%>
<%-- 			</c:forEach> --%>
<%-- 			<c:if test="${paging.endPage != paging.lastPage}"> --%>
<%-- 				<a href="bookpage?nowPage=${paging.endPage+1}&cntPerPage=${paging.cntPerPage}">▶</a>	 --%>
<%-- 			</c:if> --%>
<!-- 			</td> -->
<!-- 			</tr> -->
<tr>
<td>
<% Book_Page_DTO paging = (Book_Page_DTO)request.getAttribute("paging");
				ArrayList<Book_DTO> list1 = (ArrayList<Book_DTO>)request.getAttribute("list");
			%>
<%
    // 페이징 처리
    if (paging.getStartPage() != 1) {
%>
        <a href="bookpage?nowPage=<%= paging.getStartPage() - 1 %>&cntPerPage=<%= paging.getCntPerPage() %>">◀</a>
<%
    }
    for (int s = paging.getStartPage(); s <= paging.getEndPage(); s++) {
        if (s == paging.getNowPage()) {
%>
            <b><span style="color: blue;"><%= s %></span></b>
<%
        } else {
%>
            <a href="bookpage?nowPage=<%= s %>&cntPerPage=<%= paging.getCntPerPage() %>"><%= s %></a>
<%
        }
    }
    if (paging.getEndPage() != paging.getLastPage()) {
%>
        <a href="bookpage?nowPage=<%= paging.getEndPage() + 1 %>&cntPerPage=<%= paging.getCntPerPage() %>">▶</a>
<%
    }
%>
</td>
</tr>
<!-- 페이징 처리 끝 -->
			<!-- 페이징 처리 끝 -->
			
		</table>
	</form>
</body>
</html>