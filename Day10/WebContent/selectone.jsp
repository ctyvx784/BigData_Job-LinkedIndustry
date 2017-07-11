<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kdata.manager.Student"%>
<%@page import="kdata.manager.StudentManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String n = request.getParameter("name");
	StudentManager mg = new StudentManager();
	
	%>
	<table border="2">
	<tr>
		<th>학번</th>
		<th>이름</th>
		<th>성별</th>
		
	</tr>
	
	<%
		Student s = mg.selectByName(n);
	
	%>
	<tr>
		<td> <%= s.getStuId() %></td>
		<td> <%= s.getSName() %></td>
		<td> <%= s.getGender() %></td>
	</tr>
	</table>
</body>
</html>