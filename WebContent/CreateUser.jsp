<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Introduce el nombre de usuario</p>
<form action="/ClaseWeb/CreateUser" method="post">
<input type="text" name="username" />
<p>Introduce la password</p>
<input type="password" name="password" />
<p>Retype the password</p>
<input type="password" name="password2"/>

<input type="submit" value="Enviar" />
</form>




<% String variable = request.getParameter("username"); %>
<% String variable2 = request.getParameter("password"); %>
<% String variable3 = request.getParameter("password2"); %>



</body>
</html>
