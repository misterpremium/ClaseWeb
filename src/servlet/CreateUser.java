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

	private static final long serialVersionUID = 2L;
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

String username =  request.getParameter("username");
String password = request.getParameter("password");
String password2 = request.getParameter("password2");
if (password.equals(password2)){
	
	System.out.println("las contraseñas son iguales");
	out.println("<p> Se ha creado correctamente el usuario "+username+" </p>");
}
else {
	
	out.println("<p> Las contraseñas son diferentes. </p>");
	out.println("<a href =\"/ClaseWeb/docs/join.jsp\"> Reintenttar </a>");
	System.out.println("Las contraseñas no coinciden");
}
out.println("<p> Se ha creado correctamente el usuario "+username+" </p>");


}

	public static void main(String[] args) {

			}
}