package com.pruebas.main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int mes, dia,faltantes;
		final int dias =365;
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce mes:");
		mes=sc.nextInt();
		System.out.println("introduce dia:");
		dia=sc.nextInt();
		switch (mes) {
		case 1:
			faltantes = (365-dia);
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 2:
			faltantes = (365-(dia+31)); 
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 3:
			faltantes = (365-(dia+59));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 4:
			faltantes = (365-(dia+90));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 5:
			faltantes = (365-(dia+120));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 6:
			faltantes = (365-(dia+151));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 7:
			faltantes = (365-(dia+181));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 8:
			faltantes = (365-(dia+212));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 9:
			faltantes = (365-(dia+243));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 10:
			faltantes = (365-(dia+273));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 11:
			faltantes = (365-(dia+304));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		case 12:
			faltantes = (365-(dia+334));  
			System.out.println("dias faltantes: "+faltantes);
			break;
		default:
			break;
		}
	}
}
