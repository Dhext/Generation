
public class Listaligada {
	private Nodo head;
	public Listaligada() {
		head=null;
	}
	public void add(Object value) {
		
		if(this.head==null) {
			this.head=new Nodo(value);
		}else {
			Nodo nodoActual = this.head;
				while(nodoActual.getNext()!=null) {
					nodoActual = nodoActual.getNext();
				}
				nodoActual.setNext(new Nodo(value));
			
		}
		
	}
	
	public void print() {
		Nodo nodoActual = this.head;
		while(nodoActual.getNext()!=null) {
			System.out.print(nodoActual.getValue()+", ");
			nodoActual = nodoActual.getNext();
		}
		System.out.println(nodoActual.getValue());
	}

	public Object get(int value) {
		int i=0;
		Nodo nodoActual = this.head;
		while(i!=value) {
			nodoActual = nodoActual.getNext();
			i++;
			if(nodoActual.getNext()==null) {
				return "nodo no existe";
			}
		}
		return nodoActual.getValue();
	}
	
}
