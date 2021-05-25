import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class RegistroPaciente extends JFrame implements Registro, ActionListener {
	/*
	 //celeste verde morado 
	 colo blanco fondo
	 boton secundario 
	 boton primarios celete
	 
	*/
	
	//labels
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	//botones
	private JButton boton1;
	private JButton boton2;
	//TextField
	private JTextField tf1,tf2,tf3,tf4;
	
	public RegistroPaciente() {
		this.setTitle("SAVA - Registro Paciente");
		//etiquetas
		setLayout(null);
		/*
		label1 = new JLabel("SAVA");
		label1.setBounds(30,20,300,30); //label.setBounds(X, Y, ancho, alto);
		this.add(label1);
		*/
		label1 = new JLabel("Registro Paciente");
		label1.setBounds(150,10,300,30); // al centro
		this.add(label1);
		
		label2 = new JLabel("Nombre:");
		label2.setBounds(20,40,100,30);
		this.add(label2);
		//apellido
		label3 = new JLabel("Dni:");
		label3.setBounds(20,90,100,30);
		this.add(label3);
		
		label4 = new JLabel("Distrito:");
		label4.setBounds(20,140,100,30);
		this.add(label4);
		
		label5 = new JLabel("Telefono:");
		label5.setBounds(20,190,100,30);
		this.add(label5);
		//botones
		boton1= new JButton("Salir");
		boton1.setBounds(70,250,100,30);
		add(boton1);
		boton1.addActionListener(this);

		boton2= new JButton("Registrar");
		boton2.setBounds(220,250,100,30);
		add(boton2);
		boton2.addActionListener(this);
		
		tf1=new JTextField();
		tf1.setBounds(80,45,250,20);
		add(tf1);
		tf2=new JTextField();
		tf2.setBounds(80,95,200,20);
		add(tf2);
		tf3=new JTextField();
		tf3.setBounds(80,145,200,20);
		add(tf3);
		tf4=new JTextField();
		tf4.setBounds(80,195,200,20);
		add(tf4);
		
	}
	//distrito, ciudad
	@Override
	public void actionPerformed(ActionEvent e) { //registra eventos que suceden en la interfaz como presionar un boton
		if(e.getSource()== boton1) { //si el boton 1 se presiona hace
			System.exit(0);
		}
		if(e.getSource()== boton2) {
			setTitle(tf1.getText());
			//label1.setVisible(false);
		}
	}
	
	public void registrar() {
		this.setBounds(0,0,400,350);
		this.setVisible(true);
		this.setResizable(false); // deja o no que el ususario modifique la ventana
		this.setLocationRelativeTo(null);
		//
		/*
		String nombre;
		String rpta;
		String dni;
		boolean salir; //determinara si quiere salir de la interfaz
		Scanner sc= new Scanner(System.in);
		Paciente p;
		do {
			
			System.out.println("--------------------------------------------");
			System.out.println("SAVA \t\t\t Resgistro Paciente\n\n");
			System.out.print("Nombre: \t");
			nombre=sc.next();
			System.out.print("Dni: \t");
			dni=sc.next();
			System.out.print("Distrito: \t");
			System.out.print("Telefono: \t");
			System.out.println("--------------------------------------------");
			p= new Paciente(nombre,dni);
			if(!this.existeRegistro(p))
				GestionPacientes.agregarPaciente(p);
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
		*/
	}
	public boolean existeRegistro(Persona p){
		if(GestionPacientes.buscar((Paciente)p))
				return true;
		return false;
	}
	
}
