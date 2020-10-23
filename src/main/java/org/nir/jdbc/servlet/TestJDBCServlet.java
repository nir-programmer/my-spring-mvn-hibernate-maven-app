package org.nir.jdbc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestJDBCServlet
 */
public class TestJDBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
	String user = "springstudent"; 
	String pass = "springstudent";
	
	String driver = "com.mysql.jdbc.Driver";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			//load the driver class implementation 
			Class.forName(driver);
			
			//get connection to the database
			Connection conn = DriverManager.getConnection(jdbcUrl ,user , pass);
			
			PrintWriter out = response.getWriter();
			
			out.println("Connection inside servlet Success");
			
			
			
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			throw new ServletException(exception);
			
		}
		
	}

}
