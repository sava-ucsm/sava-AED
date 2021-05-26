
public class Usuario {
	private String usuario;
	private String contrasena;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public void validarUsuario(String usuario, String contrasena)
	{
		if(usuario.equals("Pablo") & contrasena.equals("Pablo123")) 
		{
			System.out.print("Acceso permitido "+usuario);
		}
		else 
			System.out.print("Vuelve a logearte");
	}
	
}
