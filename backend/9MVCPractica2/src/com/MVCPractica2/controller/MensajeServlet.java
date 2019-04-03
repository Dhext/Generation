package com.MVCPractica2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MensajeServlet")
public class MensajeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String miMensaje="";
		miMensaje = request.getParameter("txtMensaje");
		response.getWriter().append("Tu mensaje fue(metodo get): "+miMensaje);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String miMensaje="";
		miMensaje = request.getParameter("txtMensaje");
		response.getWriter().append("Tu mensaje fue(metodo post): "+miMensaje);
	}

}
