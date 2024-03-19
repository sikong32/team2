<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function check() {
	var f = document.from1;
	// 이름 검사
	var vname = /^[가-힣]{3,5}$/;
	var cname =f.name.value;
	if(cname == ""){
	alert("이름은 공백이 안됩니다.")
	f.name.select();
	return false;
	}
	if(!vname.test(cname)){
	alert("이름은 오직 한글로만 3~5 자이내");
	f.name.select();
	return false;
	}
	// 나이 검사 숫자로만 3자리 0~150
	var cage = f.age.value;
	var vage = /^[\d]{1,3}$/;
	if(cage==""){
	alert("나이는 공백이 안됩니다.");
	f.age.select();
	return false;
	}
	if(!vage.test(cage)){
	alert("나이는 숫자로만 3자리 이내");
	f.age.select();
	return false;
	}
	if(cage<1 || cage>150){
	alert("나이는 1~150까지만 입력 가능합니다.");
	f.age.select();
	return false;
	}
	f.submit();
	}
</script>
</head>
<body>
	<form action="yuhyo_save" name="from1">
		<table border="1" align="center">
		<caption> 요효성 검사 </caption>
			<tr>
				<th>이름</th>
				<th><input type="text" name="name" id="name"></th>
			</tr>
			<tr>
				<th>나이</th>
				<th><input type="number" name="age" id="age"></th>
			</tr>
			<tr>
				<th><input type="submit" value="전송"></th>
				<th><input type="reset" value="취소"></th>
			</tr>
		</table>
	</form>
</body>
</html>