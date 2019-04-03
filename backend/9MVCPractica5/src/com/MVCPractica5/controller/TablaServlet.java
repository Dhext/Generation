package com.MVCPractica5.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TablaServlet")
public class TablaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cat = Integer.parseInt(request.getParameter("cantidad"));
		int nuemro = Integer.parseInt(request.getParameter("cantidad"));
		PrintWriter salida = response.getWriter();
		response.setContentType("text/html charset=UTF-8");
		salida.println("<html>");
		salida.println("<head>");
		salida.println("<title>");
		salida.println("Esto es una Prueba");
		salida.println("</title>");
		salida.println("</head>");
		salida.println("<body>");
		for(int j = 1; j <= nuemro;j++) {
			salida.println("<Table border=1>");
			salida.println("<tr>");
			salida.println("<th>num1</th>");
			salida.println("<th>X</th>");
			salida.println("<th>num2</th>");
			salida.println("<th>=</th>");
			salida.println("<th>total</th>");
			salida.println("</tr>");
			for (int i = 1; i <= cat; i++) {
				salida.println("<tr>");
				salida.println("<td> "+j+" </td>");
				salida.println("<td> "+" x "+ "</td>");
				salida.println("<td> "+i+" </td>");
				salida.println("<td>"+" = "+"</td>");
				salida.println("<td> "+i*j+" </td>");
				salida.println("</tr>");	
			}
			salida.println("</Table>");
		}			
		salida.println("</body>");
		salida.println("</html>");
		salida.close();
	}

}
