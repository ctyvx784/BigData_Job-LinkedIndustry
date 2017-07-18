<%@page import="kdata.project.dto.UserDTO" %>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

회원 리스트 -list.jsp
<form action="../register.kdata">
<%
	List<UserDTO> list = (List<UserDTO>) request.getAttribute("list");
	out.println(list);
%>
<table>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>프로필</th>
		<th>가입일</th>
	</tr>
	<%for(UserDTO user : list) {%>
		<tr>
			<td><%= user.getId() %></td>
			<td><%= user.getName() %></td>
			<td><%= user.getProfile() %></td>
			<td><%= user.getRegDate() %></td>
			
		</tr>
	<%
		}	
	%>
</table>
</form>
</body>
</html>