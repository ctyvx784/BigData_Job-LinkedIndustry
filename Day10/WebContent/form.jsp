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

	//요청 파라미터를 받는 것. html부분과 일치되야한다.
	//반환형이 String이다.
	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String url = request.getParameter("url");
	
	/*
	//out은 클라이언트로 내려보내라는 뜻
	out.print("<table border='2'>"); 
	out.print("<tr>");
	out.print("<th> 학번 </th>");
	out.print("<td>"+ num +"</td>");

	out.print("<tr>");
	out.print("<th> 이름 </th>");
	out.print("<td>" + name + "</td>");

	out.print("<tr>");
	out.print("<th> 성별 </th>");
	out.print("<td>" + gender + "</td>");
	*/

%>




<table border="2">
	<tr>
		<th> 학번 </th>
		<td><% out.print(num); %></td>
	
	<tr>
		<th> 이름 </th>
		<!-- <a href = 링크 걸 곳> 걸 곳 이름 </a> -->
		<td><a href = "<%= url %>"><%= name %></a></td>
	
	<tr>
		<th> 성별 </th>
		<td><% 
				if(gender==null){
					out.print("성별을 선택하지 않았습니다."); 
				}else if(gender.equals("M")){
					out.print("남자");
				}else if(gender.equals("F")){
					out.print("여자");
				}
		%></td>
		
</table>

</body>
</html>