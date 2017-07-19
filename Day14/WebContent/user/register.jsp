<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
li {
	background-color: gold
}

li {display
	
}
</style>
<script src="../js/jquery-3.2.1.js"></script>
<script>
	$(function() {
		$("#idcheck").click(function() {
			//alert("9999");
			$.ajax({
				url : "../idcheck.kdata",
				data : {"id" : $("#id").val()},
				dataType : "text",	//text,json,xml을 가져올수 있다.
				success : function(data){
					//console.log("success");
					//console.log(data);
					if(data==0)
						$("#msg").html("중복");
					else
						$("#msg").html("사용가능");
				},
				error : function () {
					console.log("error");
				}
				
			});
		})
	});
</script>
</head>
<body>

	회원가입 - register.jsp
	<form action="../register.kdata">
		<ul>
			<li>아이디: <input type="text" name="id" value="test" id="id"> <input
				type="button" value="중복확인" id="idcheck"></li>
			<li>비밀번호: <input type="password" name="pw" value="1234"></li>
			<li>이름: <input type="text" name="name" value="홍길동"></li>
			<li>프로필 사진: <input type="file" name="file"></li>
		</ul>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>