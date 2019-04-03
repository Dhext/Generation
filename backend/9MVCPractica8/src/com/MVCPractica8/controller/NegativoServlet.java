package com.MVCPractica8.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NegativoServlet")
public class NegativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		int resultado=Integer.parseInt(String.valueOf(request.getAttribute("resultado")));
		int suma=(int) request.getAttribute("resultado");
		salida.append(" "+resultado+" ");
		salida.close();
	}

}
