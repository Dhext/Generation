package Arraylist;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class main {

	public static void main(String[] args) {
		PriorityQueue arreglo = new PriorityQueue();//priority saca los valores del menor al mayor sin ordenarse
		arreglo.add(8);
		arreglo.add(30);
		arreglo.add(20);
		arreglo.add(15);
		arreglo.add(3);
		arreglo.add(5);
		arreglo.add(6);
		arreglo.add(9);
		arreglo.add(10);
		
			System.out.println(arreglo.peek());
			System.out.println(arreglo);
		
		
	}

}
