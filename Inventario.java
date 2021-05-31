public class Inventario{
	
	private  OrderListLinked<Vacuna> inventarioVacuna;

	public void muestraSalidaEntradasGeneral(Vacuna x) {
		Node<Vacuna> aux = inventarioVacuna.getFirst();
		int busqueda = inventarioVacuna.search(x);
		if (busqueda != -1) {
			for(int i = 0 ;aux != null ; aux =aux.getNext(),i++) 
				if (aux.getData().equals(x)) {
					System.out.println(x);
				}
		}
		else {
			System.out.println("No se encontro");
		}
		
	}
	
	public void muestrarVacuna(Vacuna x) {
		Node<Vacuna> aux = inventarioVacuna.getFirst();
		int busqueda = inventarioVacuna.search(x);
		if (busqueda != -1) {
			for(int i = 0 ;aux != null ; aux =aux.getNext(),i++) 
				if (aux.getData().equals(x)) {
					System.out.println(x);
				}
		}
		else {
			System.out.println("No se encontro");
		}
		
	}
	
	public void aumentarStock(Vacuna x, int cant) {
		Node<Vacuna> aux = inventarioVacuna.getFirst();
		int busqueda = inventarioVacuna.search(x);
		if (busqueda != -1) {
			for(int i = 0 ;aux != null ; aux =aux.getNext(),i++) 
				if (aux.getData().equals(x)) {
					x.aumentarStockVacuna(cant);
				}
		}
		else {
			System.out.println("No se encontro");
		}
	}
	
	public void disminuirStock(Vacuna x, int cant) {
		Node<Vacuna> aux = inventarioVacuna.getFirst();
		int busqueda = inventarioVacuna.search(x);
		if (busqueda != -1) {
			for(int i = 0 ;aux != null ; aux =aux.getNext(),i++) 
				if (aux.getData().equals(x)) {
					x.disminuirStockVacuna(cant);
				}
		}
		else {
			System.out.println("No se encontro");
		}	
	}
	
	public void insertarVacuna(Vacuna x) {
		inventarioVacuna.insertLast(x);
	}
	
	public void borrarVacuna(Vacuna x) {
		inventarioVacuna.remove(x);
	}
	
	public void reporteGeneral() {
		toString();
	
	}
	// 
	public int buscarVacuna(Vacuna x) {
		int contador  = inventarioVacuna.search(x);
		if (contador != -1) {
			return contador;
		}
		else {
			System.out.println("No se encontro");
			return -1;
		}
	}
	
	public boolean isEmptyList() {
		return inventarioVacuna.isEmptyList();
	}
	
	public int cantidadVacunas(){
		return inventarioVacuna.length();
	}
	
	public String toString() {
		String str="";
		Node<Vacuna> aux = inventarioVacuna.getFirst();
		for(int i =  0 ; aux!=null ; aux = aux.getNext(),i++)
			str += aux.toString() + "\n";
		return str;
	}
	
}

