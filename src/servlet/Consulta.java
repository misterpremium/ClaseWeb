package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lib.Variables;
import src.Insert;

//import lib.ConnectSQL;
import java.io.*;
import java.sql.SQLException;



@WebServlet("/Consulta")
public class Consulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consulta() {

    }

	
		 public void init() throws ServletException
		  {
		    
		  }
		public void doGet(HttpServletRequest request,
	            HttpServletResponse response)//RESPONSE Y REQUEST SE PUEDE SUSTITUIR POR CUALQUIER COSA
	    throws ServletException, IOException{
			response.setContentType("text/html");

			String TableName =  request.getParameter("TableName");
			String values = request.getParameter("values");
			Variables.NameTable(TableName);
			
			//String ColumnName =  request.getParameter("nameColumn");
			//Variables.NameColumn(ColumnName);
			
			PrintWriter out = response.getWriter();
			out.println("<h1>In progress </h1>");
			try {
				//TableImport.createTable(TableName);
				Insert.InsertValues(TableName, values);
				out.println("<p> Succed!!! </p>");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				out.println("<p> Faild </p>");

			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}


	}


