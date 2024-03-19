<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#idc").click(function() {
			var id = $("#id").val();
			alert("id체크 확인하러 가기");
			$.ajax({
				type : "post",
				async : true,
				url : "idchek",
				data : {
					"id" : id
				},
				dataType : "text",
				success : function(result) {
					if (result == "ok") {
						alert("사용가능 아이디");
					} else {
						alert("이미 사용중인 아이디");
					}
				},
				error : function() {
					alert("에러다.");
				}
			});
		});
	});
</script>
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
	<form action="id_save" method="get">
		<table border="1" align="center">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" id="id" required="required">
					<input type="button" value="ID중복확인" id="idc"></td>
			</tr>
			<tr>
				<th>비번</th>
				<td><input type="password" name="pw" id="pw"
					required="required"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="tel" id="tel"></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><input type="radio" name="sb" value="남자">남자 <input
					type="radio" name="sb" value="여자">여자</td>
			</tr>
			<tr>
				<th>거주지</th>
				<td><input type="text" name="address" id="address"></td>
			</tr>
			<tr>
				<th>취미</th>
				<td><input type="text" name="hobby" id="hobby"></td>
			</tr>
			<tr>
				<th>인사말</th>
				<td><textarea rows="5px" cols="20px" name="insa"></textarea></td>
			</tr>
			<tr>
				<th><input type="submit" value="전송"> <input
					type="reset" value="취소"></th>
			</tr>
		</table>
	</form>
</body>
</html>