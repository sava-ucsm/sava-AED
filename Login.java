import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
	private Local reflocal;
	private JLabel label1, label2;
	private JTextField t1, t2;
	private JButton BT1, BT2;
	String a,b;
	
	
	public Login(Local reflocal) {
		this.reflocal=reflocal;
		
		this.getContentPane().setBackground(Color.decode("#d2fdbc"));
		setLayout(null);
		label1 = new JLabel("Usuario: ");
		label1.setBounds(10,10,100,30);
		add(label1);
		t1 = new JTextField();
		t1.setBounds(120,17,150,20);
		add(t1);
		label2 = new JLabel("Contraseña: ");
		label2.setBounds(10,35,100,30);
		add(label2);
		t2 = new JTextField();
		t2.setBounds(120,40,150,20);
		add(t2);
		
		BT1 = new JButton("Aceptar");
		BT1.setBounds(10,80,100,30);
		BT1.setForeground(Color.white);
		BT1.setBackground(Color.decode("#418325"));
		add(BT1);
		BT1.addActionListener(this);
		
		BT2 = new JButton("Cancelar");
		BT2.setBounds(160,80,100,30);
		BT2.setForeground(Color.white);
		BT2.setBackground(Color.decode("#418325"));
		add(BT2);
		BT2.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		if(e.getSource() == BT1) {
			String nombre="", contra="";
			Usuario Us = new Usuario();
			nombre = t1.getText().trim();
			contra = t2.getText().trim();
			String resul = Us.validarUsuario(nombre, contra);
			JOptionPane.showMessageDialog(BT1,resul);
			if(resul.equals("Acceso denegado"))
			{
				
				JOptionPane.showMessageDialog(null,"vuelve a logearte");
				t1.setText(null);
				t2.setText(null);
			}
			else {
				Principal principal1 = new Principal(reflocal);
				principal1.setTitle("Menu Principal");
				principal1.setBounds(0,0,400,500);
				principal1.setVisible(true);
				principal1.setLocationRelativeTo(null);
				principal1.setDefaultCloseOperation(EXIT_ON_CLOSE);
				this.setVisible(false);
				
			}
		}
		
		if(e.getSource()==BT2) {
			t1.setText(null);
			t2.setText(null);
		}
	}
	public void mostrar_interfaz() {
		this.setTitle("Inicio de Sesion");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(0,0,300,165);
		this.setResizable(true);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

	
		
}


