<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Introducir nombre de tabla</p>
<form action="/ClaseWeb/Consulta">
<input type="text" name="TableName" />
<p>Introducir valores</p>
<input type="text" name="values" />
<input type="submit" value="Enviar" />
</form>
<% String variable = request.getParameter("TableName"); %>
<% String variable2 = request.getParameter("values"); %>


</body>
</html>