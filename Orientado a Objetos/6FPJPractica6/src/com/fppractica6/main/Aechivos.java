package com.fppractica6.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Aechivos {

	public static void main(String[] args) throws IOException {
		File archivo = null;
		FileReader reader=null;
		BufferedReader buffer=null;
		try {
			archivo= new File("c:\\a\\Hola.java");
			reader = new FileReader(archivo);
			buffer =new BufferedReader(reader);
			String line="";
			while ((line=buffer.readLine())!=null) {
			System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
