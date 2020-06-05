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
        String pw = request.getParameter("id");
    %>
    <script>
        if((<% id %> == "") || (<% pw %> == "")){
            alert("모든항목을 입력해주세요");
        }else{
        alert('아이디 : ' + <%=id%> + '\n비밀번호 : '+ <%=pw%>);
        location.href="3.jsp"
        }
    </script>
       
</body>
</html>