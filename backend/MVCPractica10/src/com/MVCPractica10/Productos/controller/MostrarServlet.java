package com.MVCPractica10.Productos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MVCPractica10.Productos.model.productos;


@WebServlet("/MostrarServlet")
public class MostrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			rs= stmnt.executeQuery("select * from productos");
			productos pt;
			ArrayList<productos> listpt = new ArrayList<productos>();
			while (rs.next()) {
				pt =new productos(rs.getInt("IdProducto"), rs.getDouble("PrecioProducto"), rs.getString("NombreProducto"));
				listpt.add(pt);
			}
			request.setAttribute("list", listpt);
			RequestDispatcher rst =request.getRequestDispatcher("readGeneral.jsp");
			rst.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		salida.close();
		
	}


}
