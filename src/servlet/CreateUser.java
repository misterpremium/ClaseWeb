package servlet;
//import lib.ConnectSQL;
//import lib.Variables;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//import java.sql.SQLException;
//import java.lang.Throwable;
//import java.sql.*;
@WebServlet("/CreateUser")

	
public class CreateUser extends HttpServlet {

	private static final long serialVersionUID = 1L;
	/*public void doGet(HttpServletRequest request,
            HttpServletResponse response)//RESPONSE Y REQUEST SE PUEDE SUSTITUIR POR CUALQUIER COSA
    throws ServletException, IOException
{
		response.setContentType("text/html");
		
		String username =  request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		PrintWriter out = response.getWriter();
		out.println("<p> Las contraseñas son diferentes. </p>");

}*/
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	//	doGet(request, response);
response.setContentType("text/html");

PrintWriter out = response.getWriter();
out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">");

String username =  request.getParameter("username");
String password = request.getParameter("password");
String password2 = request.getParameter("password2");
System.out.println("Inicio metodo post");
if (password.equals(password2)){
	
	System.out.println("las contraseñas son iguales");
	out.println("<p> Se ha creado correctamente el usuario "+ username +" </p>");
}
else {
	
	out.println("<p> Las contraseñas son diferentes. </p>");
	out.println("<a type=\"button\" class=\"btn btn-warning\"  href=\"/ClaseWeb/docs/join.jsp\">Reintentar</a>");
	
	System.out.println("Las contraseñas no coinciden");
}
System.out.println("Fin metodo post");

}

	public static void main(String[] args) {

			}
}