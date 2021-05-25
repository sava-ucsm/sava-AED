
public class PersonalSalud extends Persona{
	private int idPersonal;//por defecto
	private String especialidad;
	private String usuario;//por defecto
	private String password;//por defecto 
	
	//equals comparando id personal 
	
	
	//nombre apellido dni especialidad
	public PersonalSalud(String nombre, String apellido, String dni,int idPersonal, String especialidad, String usuario, String password) {
		super(nombre, apellido, dni);
		this.idPersonal = idPersonal;
		this.especialidad = especialidad;
		this.usuario = usuario;
		this.password = password;
	}
	
	public int getIdPersonal() {
		return idPersonal;
	}
	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
