import java.util.Scanner;

public class RegistroPersonalSalud implements Registro {
	public void registrar() {
		String nombre;
		String dni;
		String user;
		String password;
		String rpassword;
		String especialidad;
		String rpta;
		PersonalSalud ps;
		boolean salir; //determinara si quiere salir de la interfaz
		Scanner sc= new Scanner(System.in);
		do {
			
			System.out.println("--------------------------------------------");
			System.out.println("SAVA \t\t\t Resgistro Personal salud\n\n");
			System.out.print("Nombre: \t");
			nombre=sc.next();
			//apellido
			System.out.print("Dni: \t");
			dni=sc.next();
			System.out.print("Especialidad: \t");
			especialidad=sc.next();
				
			System.out.println("--------------------------------------------");
			ps=new PersonalSalud(nombre,dni,especialidad);
			if(!this.existeRegistro(ps))
				Local.agregarPersonal(ps);
			else {
				System.out.print("Error: la persona ya esta registrada");
			}
			
			System.out.println("¿Desea continuar? s/n ");
			rpta = sc.next();
			
			if(rpta.equals("s") || rpta.equals("si") || rpta.equals("S") || rpta.equals("SI"))
				salir= false;
			else
				salir= true;
			System.out.println("\n\n\n");
		}while(!salir);
	}
	public boolean existeRegistro(Persona p) {
		if(Local.getPersonal((PersonalSalud)p)!=null)
			return true;
		return false;
	} 
}
