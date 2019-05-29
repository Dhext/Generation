package com.MVCPractica10.pstatements.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TransactionsServlet")
public class TransactionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		String path=props.getProperty("path");
		String aProducto1 = props.getProperty("senenciaProductos1");
		String aProducto2 = props.getProperty("senenciaProductos2");
		String aProducto3 = props.getProperty("senenciaProductos3");
		String aProducto4 = props.getProperty("senenciaProductos4");
		
		Connection conn=null;
		PreparedStatement stmnt=null;
		PrintWriter salida= response.getWriter();
		try {
			response.setContentType("text/html charset='UTF-8'");
			Class.forName(path).newInstance();
			conn=DriverManager.getConnection(props.getProperty("url"),props.getProperty("user"),props.getProperty("pass"));
			conn.setAutoCommit(false);
			stmnt =conn.prepareStatement(aProducto1);
			stmnt.setString(1,"agua");
			stmnt.setDouble(2, 12);
			stmnt.executeUpdate();
			
			stmnt =conn.prepareStatement(aProducto2);
			stmnt.setString(1,"azucar");
			stmnt.setDouble(2, 22);
			stmnt.executeUpdate();
			
			stmnt =conn.prepareStatement(aProducto3);
			stmnt.setString(1,"sal");
			stmnt.setDouble(2, 32);
			stmnt.executeUpdate();
			
			stmnt =conn.prepareStatement(aProducto4);
			stmnt.setString(1,"alchol");
			stmnt.setDouble(2, 52);
			stmnt.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
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
