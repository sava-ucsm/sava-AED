import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InterfazPaciente extends JFrame implements ActionListener {

	private JLabel label1;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	
	private JTextArea textA1;
	private JScrollPane scrollpane1;
	
	public InterfazPaciente() {
		this.setTitle("SAVA - Mostrar Lista de Pacientes");
		//etiquetas
		setLayout(null);
		
		label1 = new JLabel("¿Que desea mostrar?",SwingConstants.CENTER);// se mostrara centrado
		label1.setBounds(90,5,220,30); 
		//label1.setForeground(Color.red);
		//Border border = BorderFactory.createLineBorder(Color.ORANGE);
		//label1.setBorder(border);
		this.add(label1);
		
		//botones
		boton1= new JButton("Vacunados");
		boton1.setBounds(140,70,120,30);
		boton1.setForeground(Color.white);
		boton1.setBackground(Color.decode("#418325"));
		add(boton1);
		boton1.addActionListener(this);

		boton2= new JButton("No vacunados");
		boton2.setBounds(140,140,120,30);
		boton2.setForeground(Color.white);
		boton2.setBackground(Color.decode("#418325"));
		add(boton2);
		boton2.addActionListener(this);
		
		boton3= new JButton("General");
		boton3.setBounds(140,210,120,30);
		boton3.setForeground(Color.white);
		boton3.setBackground(Color.decode("#418325"));
		add(boton3);
		boton3.addActionListener(this);
		
		boton4= new JButton("Retornar");
		boton4.setBounds(20,290,100,30);
		boton4.setForeground(Color.white);
		boton4.setBackground(Color.decode("#418325"));
		add(boton4);
		boton4.addActionListener(this);
		
		boton5= new JButton("Retornar");
		boton5.setBounds(20,360,100,30);
		boton5.setForeground(Color.white);
		boton5.setBackground(Color.decode("#418325"));
		add(boton5);
		boton5.addActionListener(this);
		//JTextArea y JScrollPane
		textA1 = new JTextArea();
		textA1.setEditable(false);
		scrollpane1 = new JScrollPane(textA1);
		scrollpane1.setBounds(20,40,340,300);//(x,y,ancho,alto)
		scrollpane1.setVisible(false);
		add(scrollpane1);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== boton1) {
			this.InterVacunados();
		}
		if(e.getSource()== boton2) {
			this.InterNoVacunados();
		}
		if(e.getSource()== boton3) {
			this.InterGeneral();
		}
		if(e.getSource()== boton4) { //retornar
			
		}
		if(e.getSource()== boton5) {
			
			this.setBounds(0,0,400,400);
			this.setLocationRelativeTo(null);
			boton1.setVisible(true);
			boton2.setVisible(true);
			boton3.setVisible(true);
			boton4.setVisible(true);
			scrollpane1.setVisible(false);
			label1.setText("¿Que desea mostrar?");
		}
	}
	public void menu() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.decode("#d2fdbc"));
		this.setBounds(0,0,400,400);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	public void InterVacunados() { //mostrara solo los pacientes vacunados
		label1.setText("Lista de Vacunados");
		this.setBounds(0,0,400,450);
		this.setLocationRelativeTo(null);
		//textA1.setText();
		scrollpane1.setVisible(true);
		boton1.setVisible(false);
		boton2.setVisible(false);
		boton3.setVisible(false);
		boton4.setVisible(false);
		
		
	}
	public void InterNoVacunados() { //mostrara solo los pacientes no vacunados
		label1.setText("Lista de no Vacunados");
		this.setBounds(0,0,400,450);
		this.setLocationRelativeTo(null);
		//textA1.setText();
		scrollpane1.setVisible(true);
		boton1.setVisible(false);
		boton2.setVisible(false);
		boton3.setVisible(false);
		boton4.setVisible(false);
	}
	public void InterGeneral() { //mostrara todo los pacientes
		label1.setText("Lista General");
		this.setBounds(0,0,400,450);
		this.setLocationRelativeTo(null);
		//textA1.setText();
		scrollpane1.setVisible(true);
		boton1.setVisible(false);
		boton2.setVisible(false);
		boton3.setVisible(false);
		boton4.setVisible(false);
	}

}
