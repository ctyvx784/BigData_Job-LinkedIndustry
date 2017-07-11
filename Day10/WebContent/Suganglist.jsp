<%@page import="kdata.manager.Sugang"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kdata.manager.SugangManager"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
	List<Sugang> list = new ArrayList<>();
	SugangManager mg = new SugangManager();
	list = mg.selectSugang();
	
	%>
	<table border="2">
	<tr>
		<th>학번</th>
		<th>이름</th>
		<th>과목명</th>
		<th>성적</th>
		
	</tr>
	
	<%
	for(int i=0; i< list.size(); i++) {
		Sugang s = list.get(i);
	%>
	<tr>
		<td> <%= s.getStuId() %></td>
		<td><a href="selectone.jsp?name=<%=s.getsName()%>"><%= s.getsName() %></a></td>
		<td> <%= list.get(i).getSubName() %></td>
		<td> <%= list.get(i).getGrade() %></td>
	</tr>
	<%	
	}	
	%>
	</table>
</body>
</html>