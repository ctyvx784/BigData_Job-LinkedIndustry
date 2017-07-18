<%@page import="kdata.project.dto.UserDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원 상세 정보 - detail.jsp
	<form action="../detail.kdata">
		<% UserDTO user = (UserDTO)request.getAttribute("user");%>
		
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>프로필</th>
				<th>가입일</th>
			</tr>
			<tr>
				<td><%=user.getId() %></td>
				<td><%=user.getName()%></td>
				<td><img src="./profile/<%=user.getProfile()%>"></td>
				<td><%=user.getRefDate()%></td>
			</tr>
		</table>
		
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>프로필</th>
				<th>가입일</th>
			</tr>
			
			<tr>
				<!-- el에서는 getAttribute로 받은 변수를 사용한다. -->
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td> <img src="./profile/${requestScope.user.profile }"></td>
				<td>${user.refDate }</td>
			</tr>
		</table>
	</form>
</body>
</html>