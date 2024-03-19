<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
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
	<form action="id_search2" method="get">
		<table border="1" align="center">
			<tr>
				<th>id</th>
				<td><input type="text" name="id_search"></td>
			</tr>
			<tr>
			<th>
			<input type="submit" value="전송">
			<input type="reset" value="취소">
			</th>
			</tr>
		</table>
	</form>
</body>
</html>