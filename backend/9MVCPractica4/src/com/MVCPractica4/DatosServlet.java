package com.MVCPractica4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MVCPractica4.model.DatosPersonales;


@WebServlet("/DatosServlet")
public class DatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre=null;
		String aMaterno=null;
		String aPaterno=null;
		String sexo=null;
		int altura=0;
		int peso=0;
		String [] Mascotas;
		nombre=request.getParameter("txtName");
		aMaterno=request.getParameter("txtMaterno");
		aPaterno=request.getParameter("txtPaterno");
		altura=Integer.parseInt( request.getParameter("numAltura"));
		peso=Integer.parseInt( request.getParameter("numPeso"));
		sexo=request.getParameter("radSex");
		//Mascotas=(request.getParameterValues("ckmascota"));
		/*response.setContentType("text/html");
		response.getWriter().append("Nombre: "+nombre+"<br>");
		response.getWriter().append("Apellidos: "+aMaterno+" "+aPaterno+"<br>");
		response.getWriter().append("Altura: "+altura+"<br>");
		response.getWriter().append("Peso: "+peso+"<br>");
		response.getWriter().append("Sexo: "+sexo+"<br>");
		response.getWriter().append("Mascotas"+"<br>");
		for (int i = 0; i < Mascotas.length; i++) {
			response.getWriter().append(Mascotas[i]+"<br>");
		}
		*/
		DatosPersonales Persona =new DatosPersonales();
		
		Persona.setNombre(nombre);
		Persona.setApellidoMaterno(aMaterno);
		Persona.setApellidoPaterno(aPaterno);
		Persona.setAltura(altura);
		Persona.setPeso(peso);
		Persona.setSexo(sexo);
		//Persona.setMascotas(Mascotas); 
		
		DatosPersonales Persona2=new DatosPersonales();
		ArrayList<DatosPersonales> personita=new ArrayList<DatosPersonales>();
		Persona2 = new DatosPersonales();
		Persona2.setNombre(request.getParameter("txtName"));
		Persona2.setApellidoMaterno(request.getParameter("txtMaterno"));
		Persona2.setApellidoPaterno(request.getParameter("txtPaterno"));
		Persona2.setAltura(Integer.parseInt( request.getParameter("numAltura")));
		Persona2.setPeso(Integer.parseInt( request.getParameter("numPeso")));
		Persona2.setSexo(request.getParameter("radSex"));
		Persona2.setMascotas(request.getParameterValues("ckmascota"));
		personita.add(Persona2);
		for(int i=1;i<10;i++) {
			Persona2=new DatosPersonales();
			Persona2.setNombre("Persona "+i);
			Persona2.setApellidoMaterno("Apellido "+i);
			Persona2.setApellidoPaterno("Apellido "+i);
			Persona2.setAltura(i);
			Persona2.setPeso(i);
			Persona2.setSexo(request.getParameter("radSex"));
			Persona2.setMascotas(request.getParameterValues("ckmascota"));
			personita.add(Persona2);
		}
		
		PrintWriter salida = response.getWriter();
		response.setContentType("text/html charset=UTF-8");
		salida.println("<html>");
		salida.println("<head>");
		salida.println("<title>");
		salida.println("Esto es una Prueba");
		salida.println("</title>");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("<Table>");
		salida.println("<tr>");
		salida.println("<th> Nombre </th>");
		salida.println("<th> Apellido Materno </th>");
		salida.println("<th> Apellido Paterno </th>");
		salida.println("<th> Altura </th>");
		salida.println("<th> Peso </th>");
		salida.println("<th> Sexo </th>");
		salida.println("<th> Mascotas </th>");
		salida.println("</tr>");
		
		personita.forEach(DatosPersonales ->{
			salida.println("<tr>");
			salida.println("<td>"+DatosPersonales.getNombre()+"</td>");
			salida.println("<td>"+DatosPersonales.getApellidoMaterno()+"</td>");
			salida.println("<td>"+DatosPersonales.getApellidoPaterno()+"</td>");
			salida.println("<td>"+DatosPersonales.getAltura()+"</td>");
			salida.println("<td>"+DatosPersonales.getPeso()+"</td>");
			salida.println("<td>"+DatosPersonales.getSexo()+"</td>");
			salida.println("<td>"+DatosPersonales.getMascotas()+"</td>");
			salida.println("<tr>");
			
		});
		
		salida.println("</Table>");
		salida.println("</body>");
		salida.println("</html>");
		salida.close();
		
	}

}
