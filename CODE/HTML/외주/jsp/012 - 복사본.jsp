<%@ page language="java" contentType="text/html; charset=EUC-KR"

    pageEncoding="EUC-KR"%>

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<title>Insert title here</title>

</head>

<body>

난 jsp야<br/>      <!-- html 주석 -->



<% 



request.setCharacterEncoding("UTF-8"); //받아올 데이터의 인코딩

String name = request.getParameter("name"); 

%>



<hr>

<%

out.print(name+"님 환영합니다 !!!!");

%>
<hr>

</body>

</html>

