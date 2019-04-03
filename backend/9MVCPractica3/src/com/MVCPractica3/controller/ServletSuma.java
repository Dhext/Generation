package com.MVCPractica3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletSuma")
public class ServletSuma extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double num1 = Double.parseDouble(request.getParameter("numUno"));
		double num2 = Double.parseDouble(request.getParameter("numDos"));
		double res = num1+num2;
		response.getWriter().append(num1+" + "+num2+" = "+res);
	}

}
