
public class Vacuna implements Comparable <Vacuna> {
	String marca;
	double efectividad;
	int cantidad;
	double temperaturaPromedio;
	int numDosis;
	Fecha fechaES;
	
	public Vacuna(String marca, double efectividad, int cantidad, double temperaturaPromedio, int numDosis,
			Fecha fecha) {
		super();
		this.marca = marca;
		this.efectividad = efectividad;
		this.cantidad = cantidad;
		this.temperaturaPromedio = temperaturaPromedio;
		this.numDosis = numDosis;
	}
	
	public String getMarca() {		return marca;	}
	public void setMarca(String marca) {	this.marca = marca; 	}
	public double getEfectividad() {	return efectividad; 	}
	public void setEfectividad(double efectividad) { 	this.efectividad = efectividad; 	}
	public int getCantidad() { 	return cantidad;	}
	public void setCantidad(int cantidad) {	this.cantidad = cantidad;	}
	public double getTemperaturaPromedio() {	return temperaturaPromedio; 	}
	public void setTemperaturaPromedio(double temperaturaPromedio) {this.temperaturaPromedio = temperaturaPromedio; }
	public int getNumDosis() {	return numDosis; 	}
	public void setNumDosis(int numDosis) {	this.numDosis = numDosis;	}
		
	public void aumentarStockVacuna(int cant ) {		
		this.cantidad = cantidad + cant;
		fechaES.modificarFechaEntrada();
		
	}
	
	public void disminuirStockVacuna(int cant) {
		this.cantidad = cantidad - cant;
		if( this.cantidad <= 0) {
			this.cantidad = 0;
			System.out.println("Se agoto el stock de la Vacuna "+ marca);
		}
		else {
			fechaES.modificarFechaSalida();
		}
	}
	
	public int compareTo(Vacuna vac2) {
		int verificador = this.getMarca().compareTo(vac2.getMarca());
		if(verificador >  0) {
			return 1;
		}else {
			if ( verificador <  0)
				return -1;
			return 0;	
		}
	}
	
	public String toString() {
		String str="";
		str += "Marca\t -> "+ this.marca + "\tCantidad\t -> "+ this.cantidad + "\tEfectividad\t -> " + this.efectividad
		+  "\tTemperatura Promedio\t -> " + this.temperaturaPromedio + "\tNumero de Dosis\t -> " + this.numDosis;
		return str;
	}

}
