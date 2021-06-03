import java.util.Arrays;

public class Distribuidor  extends Persona {
	
	private int idDistribuidor;
	private Vehiculo veh;
	private String destino;
	private Vacuna vacunas[];
	private int nvacunas;
	
	public Distribuidor(int idDistribuidor, String nombre, String apellido, String dni, Vehiculo veh, String destino) {
		super(nombre, apellido, dni);
		this.idDistribuidor = idDistribuidor;				// se debe autogenerar
		this.veh = veh;
		this.destino = destino;
		this.vacunas = new Vacuna[20];
		this.nvacunas = 0;
	}
	public Distribuidor() {
	}
	public int getIdDistribuidor() {
		return idDistribuidor;
	}
	public void setIdDistribuidor(int idDistribuidor) {
		this.idDistribuidor = idDistribuidor;
	}
	public Vehiculo getVeh() {
		return veh;
	}
	public void setVeh(Vehiculo veh) {
		this.veh = veh;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Vacuna[] getVacunas() {
		return vacunas;
	}
	public void setVacunas(Vacuna[] vacunas) {
		this.vacunas = vacunas;
	}
	public int getNvacunas() {
		return nvacunas;
	}
	public void setNvacunas(int nvacunas) {
		this.nvacunas = nvacunas;
	}
	public void transportar() {
		
	}
	public void agregarVacuna(Vacuna vac) {
		this.vacunas[this.nvacunas] = vac;
		this.nvacunas++ ;
	}
	
	public boolean equals( Object b) {
		if ( !( b instanceof Distribuidor))
			return false;
		Distribuidor p = (Distribuidor) b;
		return this.idDistribuidor==p.idDistribuidor && this.dni == p.dni;
	}
	@Override
	public String toString() {
		return "Distribuidor [idDistribuidor=" + idDistribuidor + ", veh=" + veh + ", destino=" + destino
				+ ", " + super.toString() + "]";
	}


	
}
