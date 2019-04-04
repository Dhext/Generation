package com.ooppractica2.model;

public abstract class Persona implements Personable{
	//atributos
	private String nombre;
	private String id;
	private String rol;
	//constructores
	public Persona() {

	}
	public Persona(String nombre,String id,String rol) {

		this.nombre=nombre;
		this.id=id;
		this.rol=rol;
	}
	//getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String ToString() {
		return("Nombre: "+nombre+"\n"+"Id: "+id+"\n"+"rol: "+rol+"\n");
	}

}
