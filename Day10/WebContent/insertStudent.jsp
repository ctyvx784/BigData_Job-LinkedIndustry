<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="kdata.manager.Student"%>
<%@page import="kdata.manager.StudentManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
insertStudent.jsp <br>
<%
	
	StudentManager mg = new StudentManager();
		
	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	
	Student s = new Student(num,name,gender);
	
	
	int result=0;
	result = mg.insert(s);
	
	if(result == 0){
		out.print("»ğÀÔ ½ÇÆĞ");
	}else
		out.print("»ğÀÔ ¼º°ø");
	
%>
</body>
</html>