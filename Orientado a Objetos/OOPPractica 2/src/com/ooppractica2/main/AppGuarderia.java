package com.ooppractica2.main;
import com.ooppractica2.model.Guardia;
import com.ooppractica2.model.Persona;
import com.ooppractica2.model.Tutor;

public class AppGuarderia {

	public static void main(String[] args) {
		Persona persona;
		persona = new Tutor("adios","1","tutor","asdad");
		Guardia guard =new Guardia("barreto","2","guardia","guar",null,12);
		Tutor tutor =new Tutor("hola","2","tutor","weqewsd");
		System.out.println(persona.ToString());
		System.out.println(guard.ToString());
		System.out.println(tutor.ToString());
	}

}
