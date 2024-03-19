<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><t:insertAttribute name="title" /></title>

<style type="text/css">
#container {
}

#top {
}

#body {
	text-align: center;
	width: 100%;
}
#footer {
	position: fixed;
	bottom: 0px;
	width: 100%;
	text-align: center;
	font-size: 12px;
	line-height: 30px;
	background-color: gray;
	color: white;
}
form {
	background-color: #fff;
	border-radius: 8px;
	padding: 20px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
table {
	width: auto;
	border-collapse: collapse;
}
th, td {
	padding: 10px;
	text-align: left;
}
input[type="text"], input[type="password"] {
	width: calc(100% - 12px);
	padding: 6px;
	margin-bottom: 10px;
	box-sizing: border-box;
}
input[type="button"], input[type="submit"], input[type="reset"] {
	background-color: #4caf50;
	color: white;
	padding: 10px 15px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}
input[type="button"]:hover, input[type="submit"]:hover, input[type="reset"]:hover
	{
	background-color: #45a049;
}
textarea {
	width: calc(100% - 12px);
	padding: 6px;
	margin-bottom: 10px;
	box-sizing: border-box;
}
th {
	text-align: center;
}
#idc {
	background-color: #008CBA;
}
#idc:hover {
	background-color: #005580;
}
</style>
</head>
<body>
	<div id="container">
		<div id="top">
			<t:insertAttribute name="top" />
		</div>
		<div id="body">
			<t:insertAttribute name="body" />
		</div>
		<div id="footer">
			<t:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>