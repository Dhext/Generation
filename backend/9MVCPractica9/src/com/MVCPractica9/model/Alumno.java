package com.MVCPractica9.model;

public class Alumno {
	private String nombreAlumno;
	private double calificacion1;
	private double calificacion2;
	

	public void setAlumno(String nombreAlumno) {
		this.nombreAlumno=nombreAlumno;
	}
	public String getAlumno() {
		return nombreAlumno;
	}
	public void setCalificacion1(double calificacion1) {
		this.calificacion1=calificacion1;
	}
	public double getCalificacion1() {
		return calificacion1;
	}
	public void setCalificacion2(double calificacion2) {
		this.calificacion2=calificacion2;
	}
	public double getCalificacion2() {
		return calificacion2;
	}
}
