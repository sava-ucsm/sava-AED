
public class Paciente extends Persona implements Comparable<Paciente> {
	
	private int idPaciente;			//por defecto
	private String sexo;
	private Direccion direccion;
	private int edad;
	private Vacuna vacuna;
	private int dosis_recibidas=0;
	private boolean est_salud;
   
	public Paciente(int idPaciente, String nombre, String apellido, String dni, String sexo, Direccion direccion,
			int edad, Vacuna vacuna, int dosis_recibidas, boolean est_salud) {
		super(nombre, apellido, dni);
		this.idPaciente = idPaciente;				// se debe autogenerar
		this.sexo = sexo;
		this.direccion = direccion;
		this.edad = edad;
		this.vacuna = vacuna;
		this.dosis_recibidas = dosis_recibidas;
		this.est_salud = est_salud;
	}
	public Paciente() {
		this.dosis_recibidas = 0;
		this.est_salud = true;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Vacuna getVacuna() {
		return vacuna;
	}
	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}
	public int getDosis_recibidas() {
		return dosis_recibidas;
	}
	public void setDosis_recibidas(int dosis_recibidas) {
		this.dosis_recibidas = dosis_recibidas;
	}
	public boolean isEst_salud() {
		return est_salud;
	}
	public void setEst_salud(boolean est_salud) {
		this.est_salud = est_salud;
	}
	public void recibir_dosis() {
		if (dosis_recibidas<2)
			dosis_recibidas++;
		else
			System.out.println("El paciente ya recibio las dos dosis");
	}
	public int compareTo(Paciente p) {
		return this.dni.compareTo(p.dni);
	}
	public boolean equals( Object b) {
		if ( !( b instanceof Paciente))
			return false;
		Paciente p = (Paciente) b;
		return this.idPaciente==p.idPaciente && this.dni == p.dni;
	}
	@Override
	public String toString() {
		return "Paciente [ " + super.toString() + " idPaciente=" + idPaciente + ", sexo=" + sexo + ", edad=" + edad
				+ ", dosis_recibidas=" + dosis_recibidas + ", est_salud=" + est_salud
				+ "]";
	}
	
	
}
