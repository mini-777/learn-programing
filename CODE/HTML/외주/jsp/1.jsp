<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>jsp</title>
<style>
    td {
        padding : 10px;
    }
</style>
</head>
<body>
    <h1>회원정보를 입력하세요</h1>
    <form action ="2.jsp" method="post">
        <table border="1" style="border-spacing:0px;">
        <tr>
            <td>이름 : </td>
            <td><input type="text" name="name"style="width:100px" required></td>
        </tr>
        <tr>
            <td>이메일 : </td>
            <td><input type="email" name="mail" style="width:100px" required></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="항목검사"></td>
        </tr>
        </table>
    </form>

</body>
</html>