package com.fppractica7.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File archivo =null;
		FileWriter pw=null;
		try {
			archivo= new File("c:\\a\\c.txt");
			pw = new FileWriter(archivo);
			try {
				pw.write("hola");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		finally {
			try {
				pw.close();
			} catch (Exception exx) {
				exx.printStackTrace();
			}
			
		}
	}

}
