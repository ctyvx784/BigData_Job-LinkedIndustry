<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
/* CSS영역 */
	body { background-color:gold; color:red}
</style>
<script>
/* JavaScript 영역 */
function test(){
	window.alert("JavaScript 테스트!");
}
 
</script>
</head>
<body onload = "test()">
<%
	Class.forName("java.lang.Object");

	out.println("<h1>JSP 영역 #1</h1>");
	
	for(int i=1;i<=10;i++){
		out.print("hello<br>");
	}
%>
<h1>HTML 영역</h1>
<%
out.print("JSP 영역 #2");
%>
</body>
</html>