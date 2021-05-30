//BOX
public class Vacuna implements Comparable <Vacuna> {
	String marca;
	double efectividad;
	int cantidad;
	double temperaturaPromedio;
	int numDosis;
	Fecha fecha;
	
	public Vacuna(String marca, double efectividad, int cantidad, double temperaturaPromedio, int numDosis,
			Fecha fecha) {
		super();
		this.marca = marca;
		this.efectividad = efectividad;
		this.cantidad = cantidad;
		this.temperaturaPromedio = temperaturaPromedio;
		this.numDosis = numDosis;
		this.fecha = fecha;
	}
	public void aumentarStock(int cant ) {
		this.cantidad = cantidad + cant;
	}
	public void disminuirStock(int cant) {
		this.cantidad = cantidad - cant;
		if( this.cantidad <= 0) {
			this.cantidad = 0;
			System.out.println("Se agoto el stock de la Vacuna "+ marca);
		}
	}
	
	public int compareTo(Vacuna o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
