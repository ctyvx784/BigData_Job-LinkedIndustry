<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="./js/jquery-3.2.1.js"></script>
<script>
	/* $function(){
		$("[type='text']").val();
		
	} */
</script>
</head>
<body>
	<!-- 서블릿은 get post가 중요하다 -->
	<form action="test.lny" method="get">
		<ul>
			<li>학번: <input type="text" name="num"></li>
			<li>이름: <input type="text" name="name"></li>
		
		</ul>
		<input type="text" id="num">
		<input type="text" id="name">
		<input type="submit">
	</form>
</body>
</html>