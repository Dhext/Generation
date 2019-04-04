package com.ooppractica2.model;

public class Estudiante extends Persona{
 private String materias;
public Estudiante() {
	
}
public Estudiante(String materias) {
	this.materias=materias;
}
public String getMaterias() {
	return materias;
}

public void setMaterias(String materias) {
	this.materias = materias;
}
@Override
public void registroEntrada() {
	// TODO Auto-generated method stub
	
}
@Override
public void registroSalida() {
	// TODO Auto-generated method stub
	
}
 
}
