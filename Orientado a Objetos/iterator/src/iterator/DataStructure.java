package iterator;

import java.util.*;
import java.util.Map.Entry;

public class DataStructure {

	public static void main(String[] args) {
		List<String> miLista = new ArrayList<String>();
		for(int i=9;i>0;i--) {
			miLista.add(String.valueOf(i));
		}
		miLista.sort(Comparator.naturalOrder());
		
		Iterator miIterator = miLista.iterator();
		while (miIterator.hasNext()) {
			System.out.println("Elemento " + miIterator.next());
			
		}
		String prueba = "Trie";
			
		System.out.println("Se encientra numeros 2 "+miLista.contains("2"));
		
		
		Vector<String> miVector =new Vector<String>();
		for(int i=9;i>0;i--) {
			miVector.add(String.valueOf(i));
		}
		Enumeration miEnumeration=miVector.elements();
		System.out.println("Vectores");
		while (miEnumeration.hasMoreElements()) {
			System.out.println("Elemento "+miEnumeration.nextElement());
		}
		
		
		
		HashMap<Integer, Integer> miHash =new HashMap<Integer, Integer>();
		
			for(int i2=0,i=9;i2<9;i2++,i--) {
				miHash.put(i, i2);
				
			}
		miHash.put(9,2);
		
		 for (Entry<Integer, Integer> entry : miHash.entrySet())  {
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue()); 
	    } 
		
	}

}
