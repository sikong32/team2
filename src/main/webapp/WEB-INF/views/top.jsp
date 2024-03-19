<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
header {
	text-align: center;
	width: 100%;
}

nav {
	text-align: center;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="main">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="main">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">회원관리<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="id_input">회원가입</a></li>
						<li><a href="id_out">회원출력</a></li>
						<li><a href="id_search">회원검색</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">게시판2<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="boardinput">게시판입력2</a></li>
						<li><a href="page">게시판출력</a></li>
						<li><a href="#">게시판검색</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">도서관리<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="bookinput">도서입력</a></li>
						<li><a href="bookpage">도서출력</a></li>
						<li><a href="booksearch">도서검색</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">차관리<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="car_input">차입력</a></li>
						<li><a href="car_out">차출력</a></li>
						<li><a href="car_out3">지점별 판매액</a></li>
						<li><a href="car_out4">차량별 판매액</a></li>
						<li><a href="car_out5">판매액max 사원번호와 지점명</a></li>
						<li><a href="#">차검색</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">유효성 검사<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="yuhyo_input">유효성1</a></li>
						<li><a href="yuhyo_out">차출력</a></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
					<c:when test="${loginOK==true}">
						<li><a href="#"><span class="glyphicon glyphicon-user"></span>${id}님 반갑씁니다.</a></li>
						<li><a href="id_logout"><span
								class="glyphicon glyphicon-log-in"></span>로그아웃</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="id_input"><span
								class="glyphicon glyphicon-user"></span>회원가입</a></li>
						<li><a href="id_login"><span
								class="glyphicon glyphicon-log-in"></span>로그인</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</nav>
</body>
</html>