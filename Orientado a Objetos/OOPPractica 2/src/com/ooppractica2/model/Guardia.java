package com.ooppractica2.model;
import java.util.Date;
public class Guardia extends Persona{
	private String puesto;
	private Date horarios;
	private double salario;
	//metodos constructores
	public Guardia() {
		
	}
	public Guardia(String nombre,String id,String rol,String puesto,Date horarios,double salario) {
		super(nombre,id,rol);
		this.horarios=horarios;
		this.puesto=puesto;
		this.salario=salario;
	}
	public Guardia(String puesto,Date horarios,double salario) {
		this.horarios=horarios;
		this.puesto=puesto;
		this.salario=salario;
	}
	//getters y setters
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public Date getHorarios() {
		return horarios;
	}
	public void setHorarios(Date horarios) {
		this.horarios = horarios;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String ToString() {
		return ("Nombre: "+super.getNombre()+"\n"+"Id: "+super.getId()+"\n"+"rol: "+super.getRol()+"\n"+"Puesto: "+puesto+"\n"+"horario: "+horarios+"\n"+"salario: "+salario+"\n");
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
