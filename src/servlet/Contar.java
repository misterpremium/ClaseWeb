package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lib.Variables;
import src.Count;


/**
 * Servlet implementation class Contar
 */
@WebServlet("/Contar")
public class Contar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contar() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

		String TableName =  request.getParameter("TableName");
		Variables.NameTable(TableName);
		PrintWriter out = response.getWriter();
		out.println("<h1>In progress </h1>");
		try {
			//TableImport.createTable(TableName);
			Count.CountRow(TableName);
			out.println("<p> Succed!!! </p>");
			out.println("<p>"+ Count.CountRow(TableName) +"</p>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("<p> Faild </p>");

		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
