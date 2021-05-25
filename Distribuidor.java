
public class Distribuidor extends Persona{
	private int idDistribuidor;
	private Vehiculo v;
	public Distribuidor(String nombre, String apellido, String dni,int id,Vehiculo v) {
		super(nombre, apellido, dni);
		this.idDistribuidor = id;
		this.v = v;
	}
	public int getIdDistribuidor() {
		return idDistribuidor;
	}
	public void setIdDistribuidor(int idDistribuidor) {
		this.idDistribuidor = idDistribuidor;
	}
	public Vehiculo getV() {
		return v;
	}
	public void setV(Vehiculo v) {
		this.v = v;
	}
}
