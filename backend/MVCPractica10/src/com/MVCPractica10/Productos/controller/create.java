package com.MVCPractica10.Productos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class create
 */
@WebServlet("/create")
public class create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String nombreProduct=request.getParameter("nombreProducto");
			double precioProducto=Double.parseDouble(request.getParameter("precioProducto"));;
			int state=0;
			final String user="root";
			final String pass="admin";
			final String url="jdbc:mysql://localhost:3306/tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			Connection conn=null;
			Statement stmnt=null;
			
			PrintWriter salida= response.getWriter();
			try {
				response.setContentType("text/html charset='UTF-8'");
				
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				conn=DriverManager.getConnection(url,user,pass);
				stmnt=conn.createStatement();
				state= stmnt.executeUpdate("Insert into productos (NombreProducto, PrecioProducto) values ('"+nombreProduct+"',"+precioProducto+")");
					if(state==0) {
						System.out.println(state);
						request.setAttribute("bandera", false);
					}else {
						System.out.println(state);
						request.setAttribute("bandera", true);
					}
					RequestDispatcher rst =request.getRequestDispatcher("create.jsp");
					rst.forward(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					stmnt.close();
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			salida.close();
			
		
		}

	}


