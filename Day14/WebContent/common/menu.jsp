<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="<%= request.getContextPath()%>/user/register.jsp">회원가입</a></li> <!-- 웹 상의 절대 경로 -->
		<li><a href="/Day14/user/login.jsp">로그인</a></li>
		<!-- 바로 데이터베이스 접근하는것이므로 DAO가 있는 kdata에 가야한다. -->
		<li><a href="<%= request.getContextPath()%>/list.kdata">회원리스트</a></li>
	</ul>
</body>
</html>