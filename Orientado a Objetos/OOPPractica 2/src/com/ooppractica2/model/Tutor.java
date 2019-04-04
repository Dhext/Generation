package com.ooppractica2.model;
;

public class Tutor extends Persona{
	private String placa;
	Estudiante nino=new Estudiante();
	public Tutor() {
		
	}
	public Tutor(String placa) {
		this.placa = placa;
	}
	public Tutor(String nombre,String id,String rol,String placa) {
		super(nombre,id,rol);
		this.placa = placa;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public String ToString() {
		return ("Nombre: "+super.getNombre()+"\n"+"Id: "+super.getId()+"\n"+"rol: "+super.getRol()+"\n"+"Placa: "+placa+"\n");
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
