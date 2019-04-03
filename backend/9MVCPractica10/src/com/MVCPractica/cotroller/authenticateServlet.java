package com.MVCPractica.cotroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/authenticateServlet")
public class authenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("txtUsuario");
		String pass = request.getParameter("txtPass");
		
		
		if(user.equals("admin") && pass.equals("123")) {
			HttpSession objSesion = request.getSession(true);
			objSesion.setAttribute("Usuario", user);
			objSesion.setAttribute("password", pass);
			objSesion.setMaxInactiveInterval(30);
			response.sendRedirect("logeado.jsp");
		}else {
			RequestDispatcher dispacher =request.getRequestDispatcher("index.jsp");
		
		}
	}

}
