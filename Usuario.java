
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
	
	public String validarUsuario(String usuario, String contrasena)
	{
		if(usuario.equals("Pablo") & contrasena.equals("Pablo123")) 
		{
			String a = ("Acceso permitido " + usuario);
		return a;
		}
		else {
			String b = "Acceso denegado";
		return b;
		}
	}
	
}
