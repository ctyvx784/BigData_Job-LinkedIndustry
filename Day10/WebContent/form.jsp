<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<%
   String num = request.getParameter("num");
   String name = request.getParameter("name");
   String gender = request.getParameter("gender");
   String color = request.getParameter("color");
   String url = request.getParameter("url");
   
   out.print(num + "<br>");
   out.print(name + "<br>");
   out.print(gender + "<br>");
   out.print(color + "<br>");
   out.print(url + "<br>");
   out.print("<table border = '1'><tr>");
   out.print("<th> 학번 </th>");
   out.print("<td>"+ num + " </td>");
   out.print("</tr>");
   out.print("<tr>");
   out.print("<th> 이름 </th>");
   out.print("<td>"+ name + " </td>");
   out.print("</tr>");
   out.print("<tr>");
   out.print("<th> 성별 </th>");
   out.print("<td>"+ gender + " </td>");
   out.print("</tr>");
   out.print("<tr>");
   out.print("<th> 색상 </th>");
   out.print("<td>"+ color + " </td>");
   out.print("</tr>");
   out.print("<tr>");
   out.print("<th> URL </th>");
   out.print("<td>"+ url + " </td>");
   out.print("</tr>");
   out.print("</table>");   
%>

<body bgcolor = "<% out.print(color); %>">
<table border="1">
<tr>
   <th> 학번 : </th>
   <td><% out.print(num); %></td>
</tr>
<tr>
   <th> 이름 : </th>
   <td> <a href = "<%= url %>"><%out.print(name); %></a> </td>
</tr>
<tr>
   <th> 성별 : </th>
   <td><%out.print(gender);%></td>
</tr>
<tr>
   <th> 색상 : </th>
   <td><% out.print(color); %></td>
</tr>
<tr>
   <th> URL : </th>
   <td><% out.print(url); %></td>
</tr>
</table>
</body>
</html>
