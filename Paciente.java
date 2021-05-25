
public class Paciente extends Persona implements Comparable<Paciente>{
	private int idPaciente;//por defecto
	private Vacuna vacuna;
	private int dosis_recibidas=0;
	private boolean est_salud;
	private int telf;

	//nombre dni direccion telefono
	public Paciente(String nombre, String apellido, String sexo, String dni, Direccion direccion, int edad,int codPaciente, Vacuna vacuna,boolean est_salud) {
		super(nombre, apellido, sexo, dni, direccion, edad);
		this.idPaciente = codPaciente;
		this.vacuna = vacuna;
		
		this.est_salud = est_salud;
	}
	//implementamos el metodo compareTo implementado de la interfaz comparable
	public int compareTo(Paciente p) {
		if(this.edad > p.edad) {
			return 1;
		}else {
			return 0;
		}
	}
	public void recibir_dosis() {
		if (dosis_recibidas<2)
			dosis_recibidas++;
		else
			System.out.println("El paciente ya recibio las dos dosis");
	}
	public boolean equals( Object b) {
		if ( !( b instanceof Paciente))
			return false;
		Paciente p = (Paciente) b;
		return this.idPaciente==p.idPaciente && this.dni == p.dni;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
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
	public Boolean getEst_salud() {
		return est_salud;
	}
	public void setEst_salud(Boolean est_salud) {
		this.est_salud = est_salud;
	}
	
	
	



	
	 
	   

	   
	    

}
