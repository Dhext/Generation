
public class main {

	public static void main(String[] args) {
		Funciones f=new Funciones();
		/*System.out.println(f.facotrial(5));
		int i[]= {6,2,5,0};
		i=f.bouble(i);
		for(int n=0;n<i.length;n++) {
			System.out.println(i[n]);
		}
		String nn="12asdasd2adsd32";
		System.out.println(f.substring(nn));
		int a[]= {1,3,2,5,6,8,7,0,9,4};
		i=f.bouble(a);
		System.out.println(f.busqueda(a, 7));*/
		int c[]= {6,2,5,0,1,0,8,1};
		 c=f.duplicado(c);
		for(int n=0;n<c.length;n++) {
			System.out.println(c[n]);
		}
	}


}
