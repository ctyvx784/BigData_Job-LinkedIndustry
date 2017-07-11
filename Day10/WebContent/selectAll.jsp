<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kdata.manager.Student"%>
<%@page import="kdata.manager.StudentManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
	List<Student> list = new ArrayList<>();
	StudentManager mg = new StudentManager();
	list = mg.selectAll();
	
	%>
	<table border="2">
	<tr>
		<th>학번</th>
		<th>이름</th>
		<th>성별</th>
		
	</tr>
	
	<%
	for(int i=0; i< list.size(); i++) {
	%>
	<tr>
		<td> <%= list.get(i).getStuId() %></td>
		<td> <%= list.get(i).getSName() %></td>
		<td> <%= list.get(i).getGender() %></td>
	</tr>
	<%	
	}	
	%>
	</table>
</body>
</html>