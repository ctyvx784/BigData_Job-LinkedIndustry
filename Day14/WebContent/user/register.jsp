<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style >
	li{ background-color:gold}
	li{display}
</style>
</head>
<body>

회원가입 - register.jsp
<form action="../register.kdata">
	<ul>
		<li>아이디: <input type="text" name="id" value="test">
					<input type="button" value="중복확인"></li>
		<li>비밀번호: <input type="password" name="pw" value="1234"></li>
		<li>이름: <input type="text" name="name" value="홍길동"></li>
		<li>프로필 사진: <input type="file" name="file"></li>
	</ul>
	<input type="submit" value="회원가입">
</form>
</body>
</html>