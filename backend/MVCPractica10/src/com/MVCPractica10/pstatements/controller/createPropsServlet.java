package com.MVCPractica10.pstatements.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.orbutil.fsm.Input;


@WebServlet("/createPropsServlet")
public class createPropsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreProduct=request.getParameter("nombreProducto");
		double precioProducto=Double.parseDouble(request.getParameter("precioProducto"));;
		int state=0;
		String result="";
		Properties props =new Properties();
		String nombreArchivo= "config.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
		if(inputStream!=null) {
			props.load(inputStream);
		}else {
			throw new FileNotFoundException("Property file "+nombreArchivo+" No se encontro");
		}
		String url=props.getProperty("url");
		String user=props.getProperty("user");
		String pass=props.getProperty("pass");
		Connection conn=null;
		PreparedStatement stmnt=null;
		
		PrintWriter salida= response.getWriter();
		try {
			response.setContentType("text/html charset='UTF-8'");
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection(props.getProperty("url"),props.getProperty("user"),props.getProperty("pass"));
			stmnt=conn.prepareStatement("Insert into productos (NombreProducto, PrecioProducto) values (?,?)");
			stmnt.setString(1,nombreProduct);
			stmnt.setDouble(2, precioProducto);
			stmnt.execute();
			
				if(state==0) {
					System.out.println(state);
					request.setAttribute("bandera", false);
				}else {
					System.out.println(state);
					request.setAttribute("bandera", true);
				}
				RequestDispatcher rst =request.getRequestDispatcher("Props/createProps.jsp");
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
