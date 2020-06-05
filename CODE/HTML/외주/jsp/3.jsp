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
    <h1>로그인 정보를 입력하세요</h1>
    <form action ="4.jsp" method="post">
        <table border="1" style="border-spacing:0px;">
        <tr>
            <td>아이디 : </td>
            <td><input type="text" name="id"style="width:100px" required></td>
        </tr>
        <tr>
            <td>비밀번호 : </td>
            <td><input type="password" name="pw" style="width:100px" required></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="항목검사"><input type="button" value="취소"></td>
        </tr>
        </table>
    </form>

</body>
</html>