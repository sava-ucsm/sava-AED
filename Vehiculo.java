
public class Vehiculo {
	private String modelo;
	private String placa;

	public Vehiculo(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}
	public Vehiculo() {
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", placa=" + placa + "]";
	}

}
