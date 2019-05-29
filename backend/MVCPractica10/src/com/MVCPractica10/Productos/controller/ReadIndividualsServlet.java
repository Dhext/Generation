package com.MVCPractica10.Productos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.group.Response;

import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class ReadIndividualsServlet
 */
@WebServlet("/ReadIndividualsServlet")
public class ReadIndividualsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("idProducto"));
		String nombreProduct="";
		double precioProducto=0;
		int idProducto=0;
		final String user="root";
		final String pass="admin";
		final String url="jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		Connection conn=null;
		Statement stmnt=null;
		ResultSet rs=null;
		PrintWriter salida= response.getWriter();
		try {
			response.setContentType("text/html charset='UTF-8'");
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection(url,user,pass);
			stmnt=conn.createStatement();
			rs= stmnt.executeQuery("select * from productos where idProducto ="+id);
				rs.next();
				
				idProducto=rs.getInt("IdProducto");
				nombreProduct=rs.getString("NombreProducto");
				precioProducto=rs.getDouble("PrecioProducto");
				request.setAttribute("nombreProducto", nombreProduct);
				request.setAttribute("idProducto", idProducto);
				request.setAttribute("precioProducto", precioProducto);
				RequestDispatcher rst =request.getRequestDispatcher("Readindividual.jsp");
				rst.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmnt.close();
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		salida.close();
		
	
	}

}
