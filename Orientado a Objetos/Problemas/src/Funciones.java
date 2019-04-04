

public class Funciones {
	private int valorFinal=1;
	public Funciones() {
		
	}
	public int facotrial(int valorInicial) {
		for(int i=1;i<=valorInicial;i++) {
			valorFinal=i*valorFinal;
		}
		return valorFinal;
	}
	public int[] bouble(int ordena[] ) {
		int Aux;
		for(int a=0;a<ordena.length;a++) {
			for(int i=0;i<ordena.length-1;i++) {
				if(ordena[i] > ordena[i+1]) {
					Aux=ordena[i];
					ordena[i]=ordena[i+1];
					ordena[i+1]=Aux;
				}
			}
		}	
		return ordena;
	}
	public int Suma(int valorInicial) {
		for(int i=1;i<=valorInicial;i++) {
			valorFinal=i+valorFinal;
		}
		return valorFinal;
	}
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	public int substring(String subs) {
		char c;
		String num;
		int sum=0;
		for(int i=0;i<subs.length();i++) {
			c=subs.charAt(i);
			num=Character.toString(c);
			if(isNumeric(num)) {
				sum=sum+Integer.parseInt(num);
			}
		}
			return sum;
	}
	   
	public int[] duplicado(int[] remover){
		
		Boolean band=true;
		for (int a = 0; a < remover.length; a++) {
			for (int i = 1; i < remover.length; i++) {
				if(remover[a]==remover[i]&&a!=i) {
					int[] remover2 =new int[remover.length-1] ;
					for (int j = 0; j < remover.length-1; j++) {
						if(j==remover.length||j==remover.length-1){
							
						}
						else if(a<=j) {
								remover2[j]=remover[j+1];
						 }else {
							 remover2[j]=remover[j];
						 }
					}
					remover=remover2;
				}
			}
		}
		
		return remover;
		}
	public int busqueda(int[] buscar,int num) {
		int i=0;
		int mid=0;
		int iterator=0;
		int der=buscar.length-1;
		boolean bandera=true;
		while(bandera) {
			
			mid=(der+i)/2;
			if(buscar[mid]==num)return mid;
			else if(buscar[der]==num)return der;
			else if(buscar[i]==num)return i;
			else if(buscar[der]>num&&buscar[i]<num)der=der-1;
			else if(buscar[i]<num&&buscar[der]>num)i=i+1;
			else {bandera= false;
				System.out.println("numero no encontrado");
			}
		}
			
		
		return i;
		
	}

}
