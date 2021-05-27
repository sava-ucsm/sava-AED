import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
	private JLabel label1;
	private JLabel label2;
	private JTextField t1;
	private JTextField t2;
	private JButton BT1;
	private JButton BT2;
	String a,b;
	
	
	public Login() {
		setLayout(null);
		label1 = new JLabel("Usuario: ");
		label1.setBounds(10,10,100,30);
		add(label1);
		t1 = new JTextField();
		t1.setBounds(120,17,150,20);
		add(t1);
		label2 = new JLabel("Contrase�a: ");
		label2.setBounds(10,35,100,30);
		add(label2);
		t2 = new JTextField();
		t2.setBounds(120,40,150,20);
		add(t2);
		
		BT1 = new JButton("Aceptar");
		BT1.setBounds(10,80,100,30);
		add(BT1);
		BT1.addActionListener(this);
		
		BT2 = new JButton("Cancelar");
		BT2.setBounds(160,80,100,30);
		add(BT2);
		BT2.addActionListener(this);
	}
	public MenuPrincipal() {
		
	}
	public MenuPersonalSalud() {
		
	}
	public MenuDistribuidor() {
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == BT1) {
			String nombre="", contra="";
			Usuario Us = new Usuario();
			nombre = t1.getText();
			contra = t2.getText();
			String resul = Us.validarUsuario(nombre, contra);
			JOptionPane.showMessageDialog(BT1,resul);
		}
		if(e.getSource()==BT2) {
			t1.setText(null);
			t2.setText(null);
		}
	}

	public static void main(String[] args) {
		
		Login login1 = new Login();
		login1.setBounds(0,0,300,165);
		login1.setVisible(true);
		
		Scanner entrada = new Scanner(System.in); 
		
		
		boolean salir = false;
		int opcion;
		while(!salir){
               System.out.println("-----Menu Principal-------");
	           System.out.println("1. Ver vacunas pendientes ");
	           System.out.println("2. Opcion 2");
	           System.out.println("3. Opcion 3");
	           System.out.println("4. Salir");
	            
	           System.out.println("Escribe una de las opciones");
	           opcion = entrada.nextInt();
	            
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion 1");
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion 2");
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la opcion 3");
	                   break;
	                case 4:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo n�meros entre 1 y 4");
	           }
	            
		 }
			
		}
		
}


