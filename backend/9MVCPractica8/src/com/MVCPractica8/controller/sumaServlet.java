package com.MVCPractica8.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sumaServlet")
public class sumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numno=Integer.parseInt(request.getParameter("numUno"));
		int numDos=Integer.parseInt(request.getParameter("numDos"));
		int resultado=numDos+numno; 
		request.setAttribute("resultado",resultado);
		if(resultado==0) {
			RequestDispatcher rs =request.getRequestDispatcher("cero.jsp");
			rs.forward(request, response);
		}else if(resultado==37){
			RequestDispatcher rs =request.getRequestDispatcher("treintaSiete.jsp");
			rs.forward(request, response);
		}
		else if(resultado>0) {
			RequestDispatcher rs =request.getRequestDispatcher("PositivoServlet");
			rs.forward(request, response);
		}else {
			RequestDispatcher rs =request.getRequestDispatcher("NegativoServlet");
			rs.forward(request, response);
		}
		
	}

}
