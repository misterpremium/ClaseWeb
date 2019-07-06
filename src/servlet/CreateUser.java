package servlet;
//import lib.ConnectSQL;
//import lib.Variables;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import lib.ConnectSQL;
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
		out.println("<p> Las contrase�as son diferentes. </p>");

}*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
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
	
	System.out.println("las contrase�as son iguales");
	out.println("<p> Se ha creado correctamente el usuario "+ username +" </p>");

	
	/*
	String ok;
	response.setContentType("text/html");
	String DBname = request.getParameter("users");
	ok = ConnectSQL.Connect(DBname);
	out.println("<h1>" + ok + "</h1>");
	out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">");
	out.println("<a href=\"http://25.91.187.37:8080/SitioWebFinal/\">Volver al inicio</a>");
	*/
	
	
	
}
else {
	
	out.println("<p> Las contrase�as son diferentes. </p>");
	out.println("<a type=\"button\" class=\"btn btn-warning\"  href=\"/ClaseWeb/docs/join.jsp\">Reintentar</a>");
	
	System.out.println("Las contrase�as no coinciden");
}

}
////



	

		
		

















//////////////////////////
	
	




	public static void main(String[] args) {

			}
}


