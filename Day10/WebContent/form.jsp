<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<%
String color = request.getParameter("Bcolor");
%>

<title>Insert title here</title>
</head >
<body bgcolor="<% out.print(color); %>">

 

<%	

	//��û �Ķ���͸� �޴� ��. html�κа� ��ġ�Ǿ��Ѵ�.
	//��ȯ���� String�̴�.
	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String url = request.getParameter("url");
	
	/*
	//out�� Ŭ���̾�Ʈ�� ����������� ��
	out.print("<table border='2'>"); 
	out.print("<tr>");
	out.print("<th> �й� </th>");
	out.print("<td>"+ num +"</td>");

	out.print("<tr>");
	out.print("<th> �̸� </th>");
	out.print("<td>" + name + "</td>");

	out.print("<tr>");
	out.print("<th> ���� </th>");
	out.print("<td>" + gender + "</td>");
	*/

%>




<table border="2">
	<tr>
		<th> �й� </th>
		<td><% out.print(num); %></td>
	
	<tr>
		<th> �̸� </th>
		<!-- <a href = ��ũ �� ��> �� �� �̸� </a> -->
		<td><a href = "<%= url %>"><%= name %></a></td>
	
	<tr>
		<th> ���� </th>
		<td><% 
				if(gender==null){
					out.print("������ �������� �ʾҽ��ϴ�."); 
				}else if(gender.equals("M")){
					out.print("����");
				}else if(gender.equals("F")){
					out.print("����");
				}
		%></td>
		
</table>

</body>
</html>