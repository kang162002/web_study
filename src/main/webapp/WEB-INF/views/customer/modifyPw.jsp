<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>비밀번호 변경 페이지</h2>
	<form action="/customer/modifyPw" method="post">
		변경할 비밀번호 : <input type="password" name="newPassword" placeholder="새비밀번호"  required>
		<button type="submit">비밀번호 변경</button>
		<button type="button" onClick="location.href='/customer/mypage'">마이페이지로~</button>
		
	</form>
</body>
</html>