package com.MVCPractica4.model;

public class DatosPersonales {
	private String nombre;
	private String apellidoPadre;
	private String apellidoMadre;
	private int peso;
	private int altura;
	private String sexo;
	private String[] mascotas;
	public DatosPersonales() {
		
	}
	public DatosPersonales(String nombre,String apellidoPadre,String apellidoMadre,int peso,int altura,String sexo,String[] mascotas) {		
		this.nombre=nombre;
		this.apellidoPadre=apellidoPadre;
		this.apellidoMadre=apellidoMadre;
		this.peso=peso;
		this.altura=altura;
		this.sexo=sexo;
		for(int i = 0;i<mascotas.length;i++) {
			this.mascotas[i]=mascotas[i];
		}
	}
	public String toString() {
		String miMascota="";
		for(String mascota:mascotas) {
			miMascota+=mascota+" ";
		}
		return "Nombre "+ nombre +"Apellido Materno "+apellidoMadre+"Apellido Paterno "+apellidoPadre+"Peso "+peso+"Altura "+altura+"Sexo "+sexo+"Mascotas "+miMascota;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellidoPaterno() {
		return this.apellidoPadre;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPadre=apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return this.apellidoMadre;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMadre=apellidoMaterno;
	}
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
	public int getAltura() {
		return this.altura;
	}
	public void setAltura(int altura) {
		this.altura=altura;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}
	public String getMascotas() {
		String miMascota="";
		for(String mascota:mascotas) {
			miMascota+=mascota+" ";
		}
		return miMascota;
	}
	public void setMascotas(String[] mascotas) {
		
			this.mascotas=mascotas;
	}
	
}
