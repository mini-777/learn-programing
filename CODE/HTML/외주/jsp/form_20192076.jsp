<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <form action ="inputproc_20192076.jsp" method="post">

        <fieldset style="border-color:grey;border: width 1px;border-style:dashed;width: 250px;">
            <legend >회원정보입력</legend>
    
            <label>아이디 : <input type="text" name="id" placeholder="4~8자입력" style="width:100px" required></label>
            <label><br>비밀번호 : <input type="password" name="pw" placeholder="4~8자입력" style="width:100px" required></label>
            <label><br>나이 : <input type="number" name="age" style="width:100px" required></label>
            <br><input type="submit" value="입력하기">
        </fieldset>
        
        
    </form>
</body>
</html>