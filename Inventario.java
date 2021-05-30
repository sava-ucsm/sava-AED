//BOX
public class Inventario{
	
	private  Node<Vacuna> first;
	private int count;

	
	public void aumentarStock(Vacuna x, int cant) {
		Node<Vacuna> aux = this.first;
		int controlador = 0; 
		for(int i = 0 ;aux != null ; aux =aux.getNext(),i++) 
			if (aux.getData().equals(x)) {
				x.aumentarStock(cant);
				controlador = 1;
			}
		if (controlador == 0 ) {
			System.out.println("No se aumento Stock ya que no se encontro esa vacuna");
		}
	}
	public void disminuirStock(Vacuna x, int cant) {
		Node<Vacuna> aux = this.first;
		int controlador = 0; 
		for(int i = 0 ;aux != null ; aux =aux.getNext(),i++) 
			if (aux.getData().equals(x)) {
				x.disminuirStock(cant);;
				controlador = 1;
			}
		if (controlador == 0 ) {
			System.out.println("No se disminuyo Stock ya que no se encontro esa vacuna");
		}		
	}
	
	public void crearNuevaVacuna(Vacuna x) {
		if(this.isEmptyList()) {
			this.first = new Node<Vacuna>(x,this.first);
			this.count++;
		}
		else {
			Node<Vacuna> lastNode = getLastNode();
			lastNode.setNext(new Node<Vacuna>(x));
			this.count++;
		}	
	}
	
	private Node<Vacuna> getLastNode(){
		Node<Vacuna> aux = this.first;
		while (aux.getNext()!=null)
			aux = aux.getNext();
		return aux;
	}
	
	public void borrarVacuna(Vacuna x) {
		Node<Vacuna> aux = this.first;
		Node<Vacuna> anterior = null;
		Node<Vacuna> actual = null;
		Node<Vacuna> siguiente = null;
		int pocisionX = 0;
		if (buscarVacuna(x) != -1 ) {
			System.out.println("Se borrara el elemento " + x);
			pocisionX = buscarVacuna(x);
			int posicionAnterior = pocisionX - 1;
			int posicionSiguiente = pocisionX + 1;
					
			for(int i =  0 ; aux!=null ; aux = aux.getNext(),i++) {
				if ( i == pocisionX ) 
					actual = aux;
				if ( i == posicionAnterior ) 
					anterior = aux;
				if ( i == posicionSiguiente ) 
					siguiente = aux;
			}
			if (pocisionX == 0) {
				this.first=siguiente;
				this.count--;
			}
			else {
				if (pocisionX == this.length()-1) {
					anterior.setNext(null);
					this.count--;
				}
				else {
					anterior.setNext(siguiente);
					this.count--;
				}
			}
			actual = null;
		}
		else
			System.out.println("NO SE BORRO EL ELEMENTO -> " + x  + " <- YA QUE NO SE ENCONTRO");
		
	}
	public void reporteGeneral() {
		toString();
		
	}

	public int buscarVacuna(Vacuna x) {
		Node<Vacuna> aux = this.first;
		for(int i = 0 ;aux != null ; aux =aux.getNext(),i++) 
			if (aux.getData().equals(x))
				return i;
		return -1;
	}
	
	
	public boolean isEmptyList() {
		return this.first == null;
	}
	
	public int length(){
		return this.count;
	}
	
	public String toString() {
		String str="";
		Node<Vacuna> aux = this.first;
		for(int i =  0 ; aux!=null ; aux = aux.getNext(),i++)
			str +="[" +i+"] = "+aux.getData()+"\n";
		return str;
	}
	

}


