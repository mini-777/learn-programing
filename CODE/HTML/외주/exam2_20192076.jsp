<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%!
    String name = "홍길동";

    public String getName(){
        return name;
    }

%>
<% String hobby = "등산";%> 

<p>이름은 <%=getName()%>이고 취미는 <%=hobby%></p>
</body>
</html>