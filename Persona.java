
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected String dni;
    protected Direccion direccion;
    protected int edad;

    //Constructor
    //Constructor para Paciente
   public Persona(String nombre, String apellido, String sexo, String dni, Direccion direccion, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.dni = dni;
		this.direccion = direccion;
		this.edad = edad;
	}
   //Constructor para Distribuidor y Personal
   public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
   }
 
	public String getNombre() {
		return nombre;
	}

	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
    
} //Cierre de la clase