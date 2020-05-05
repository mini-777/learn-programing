<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<meta charset="utf-8">
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String age = request.getParameter("age");

    %>
    <%
        if(id.equals("abcd") && pw.equals("z1234")) {
    %>
    <script>alert('로그인에 성공하셨습니다.');</script>
    <% 
        }else{ %>
    <script>alert('로그인에 실패하였습니다.');</script>
       <% }
    
     %>

</body>
</html>