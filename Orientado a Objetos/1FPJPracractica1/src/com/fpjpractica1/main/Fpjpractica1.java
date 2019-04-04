package com.fpjpractica1.main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Fpjpractica1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 - practica 1 Hola Mundo");
		System.out.println("2 - practica 2 Scanner");
		System.out.println("3 - practica 3 Area del Triangulo");
		System.out.println("4 - practica 4 Switch");
		System.out.println("5 - practica 5 if & else");
		System.out.println("6 - practica 6 Edades");
		System.out.println("Opcion: ");
		int opc=entrada.nextInt();
		switch (opc) {
		case 1:
			//practica 1 
			//mostar hola mundo
			System.out.println("hola mundo");
			break;
		case 2:
			//practica 2
			//aceptar un valor desde el teclado
			// para acetar un valor del teclado se nesesita el obj scaner y la o las variables donde se almacenaran los valores
			String nombre=" ";
			
			System.out.println("Cual es tu nombre ");
			nombre=entrada.nextLine();
			System.out.println("Tu nombre es: "+nombre );
			break;
		case 3:
			//practica 3
			//introducir la base y la altura de un triangulo y calcular su area
			float base=0; 
			float altura=0;
			System.out.println("dame la base: ");
			base=entrada.nextFloat();
			System.out.println("dame la altura: ");
			altura=entrada.nextFloat();
			System.out.println("el area es: "+(base*altura)/2);
			break;
		case 4:
			//introducir los ias de la semana y mostrar los en cadena
			int dia=0;
			System.out.println("introduce el dia de la semana. ");
			dia= entrada.nextInt();
			switch (dia) {
			case 1:
				System.out.println("Es lunes");
				break;
			case 2:
				System.out.println("Es martes");
				break;
			case 3:
				System.out.println("Es miercoles");
				break;
			case 4:
				System.out.println("Es juevez");
				break;
			case 5:
				System.out.println("Es viernes");
				break;
			case 6:
				System.out.println("Es sabado");
				break;
			case 7:
				System.out.println("Es domingo");
				break;
			default:
				System.out.println("Dia no encontrado");
				break;
			}
			break;
		case 5:
			//preactica 5 
			//pedir edad al usuario si es menor de 5 es niño si es mayor o igual a 5 y menor  igual a 18 entonces
			//si es mayor igual a 18 y menor que 36 mostrar chavo ruco si es 37 mostrar viejo
			int edad=0;
			System.out.println("Cual es tu edad: ");
			edad= entrada.nextInt();
			if(edad<5) {
				System.out.println("Nino");
			}else if(edad >= 5 && edad<18) {
				System.out.println("Adolecente");
			}else if(edad>18 && edad<36) {
				System.out.println("Joven");
			}else if(edad>37 && edad<100) {
				System.out.println("Viejo");
			}else {
				System.out.println("Edad fuera de los parametros");
			}
			break;
		case 6:
			//series 1 al 100
			for(int i=0;i<=100;i++) {
				System.out.println(i);
			}
			break;
		case 7:
			//calcular num primo
			boolean isprimo=true;
			int numero=0;
			System.out.println("Introduce numero: ");
			numero= entrada.nextInt();
			int a =2;
			while (isprimo==true) {
			 if(a<numero) {
				 a++;
			 }else{
				break; 
			 }	
			 if(numero%a==0) {
					isprimo=false;
				}
			}
			System.out.println("el numero introducido es primo? "+isprimo);
			for(int i=2;i<numero;i++) {
				if(numero%i==0) {
					isprimo=false;
				}
			}
			System.out.println("el numero introducido es primo? "+isprimo);
		case 8:
			//sumar pares del 2 al 2000
			int cout=2;
			int acum=0;
			while (cout<=2000) {
				acum+=cout;
				cout+=2;
			}
			System.out.println("la suma de los pares del 2 al 2000 es "+ acum);
			break;
		case 9: 
			//pedir el radio de un circulo y calcular su radio
			final double PI =3.14151921863579;
			double radio= 0.0;
			double area=0.0;
			System.out.println("introduce el radio de un circulo");
			radio=entrada.nextDouble();
			area=PI*(radio*radio);
			System.out.println("el area es: " + area);
			break;
		case 10:
			//serie fibonaci
			int cantidad=0;
			System.out.println("cantidad de numeros a pedir");
			cantidad=entrada.nextInt();
			int fibo=1;
			int antfibo=1;
			int tem=0;
			for(int f=1;f<cantidad;f++) {
				tem=fibo;
				fibo=fibo+antfibo;
				antfibo=tem;
			}
			System.out.println("el valor fibonacci en la pocicion "+ cantidad +" es igual a "+fibo);
			break;
		case 11:
			final int ELEMENTOS_VECTOR= 100;
			final int LIMITE=100;
			int[] Ar= new int[LIMITE];
			Random rnd=new Random(System.currentTimeMillis());
			for(int i=0;i<ELEMENTOS_VECTOR;i++) {
				Ar[i]=rnd.nextInt(100);
			}
			for(int i=0;i<ELEMENTOS_VECTOR;i++) {
				System.out.print(" "+Ar[i]);
			}
			System.out.println("");
			Arrays.sort(Ar);
			for(int i=0;i<ELEMENTOS_VECTOR;i++) {
				System.out.print(" "+Ar[i]);
			}
			break;
		default:
			break;
		}
		entrada.close();
		
	}

}
