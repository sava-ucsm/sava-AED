import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
	private Local reflocal;
	private JLabel labelBienvenida;
	private JButton BtMostrarLisPac, BtRegisPac,BtRegisPerSa, BtVacun, BtMostrarStock, BtSalir,BtRegisVacun;
	
	public Principal(Local reflocal) {
		this.reflocal=reflocal;
		this.getContentPane().setBackground(Color.decode("#d2fdbc"));
		setLayout(null);
		labelBienvenida = new JLabel("BIENVENIDO A SAVA");
		labelBienvenida.setBounds(95,0,500,50);
		labelBienvenida.setFont(new Font("Helvetica",Font.BOLD, 20));
		add(labelBienvenida);
		
		BtMostrarLisPac = new JButton("1. Mostrar Lista de Pacientes");
		BtMostrarLisPac.setBounds(15,60,200,30);
		BtMostrarLisPac.setForeground(Color.white);
		BtMostrarLisPac.setBackground(Color.decode("#418325"));
		add(BtMostrarLisPac);
		BtMostrarLisPac.addActionListener(this);
		
		BtRegisPac = new JButton("2.Registrar Pacientes");
		BtRegisPac.setBounds(15,110,200,30);
		BtRegisPac.setForeground(Color.white);
		BtRegisPac.setBackground(Color.decode("#418325"));
		add(BtRegisPac);
		BtRegisPac.addActionListener(this);
		
		BtRegisPerSa = new JButton("3.Registrar Personal de Salud");
		BtRegisPerSa.setBounds(15,160,200,30);
		BtRegisPerSa.setForeground(Color.white);
		BtRegisPerSa.setBackground(Color.decode("#418325"));
		add(BtRegisPerSa);
		BtRegisPerSa.addActionListener(this);
		
		BtVacun = new JButton("4. vacunar");
		BtVacun.setBounds(15,210,200,30);
		BtVacun.setForeground(Color.white);
		BtVacun.setBackground(Color.decode("#418325"));
		add(BtVacun);
		BtVacun.addActionListener(this);
		
		
		BtRegisVacun = new JButton("5. Registrar Vacuna");
		BtRegisVacun.setBounds(15,260,200,30);
		BtRegisVacun.setForeground(Color.white);
		BtRegisVacun.setBackground(Color.decode("#418325"));
		add(BtRegisVacun);
		BtRegisVacun.addActionListener(this);
		
		BtMostrarStock = new JButton("6. Mostrar stock de vacunas");
		BtMostrarStock.setBounds(15,310,200,30);
		BtMostrarStock.setForeground(Color.white);
		BtMostrarStock.setBackground(Color.decode("#418325"));
		add(BtMostrarStock);
		BtMostrarStock.addActionListener(this);
		
		BtSalir = new JButton("7. Salir");
		BtSalir.setBounds(15,360,200,30);
		BtSalir.setForeground(Color.white);
		BtSalir.setBackground(Color.decode("#418325"));
		add(BtSalir);
		BtSalir.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		InterfazPaciente intpac=new InterfazPaciente(this.reflocal);
		if(e.getSource()==BtMostrarLisPac ) {
			
			intpac.menu();
		}
		if(e.getSource()==BtRegisPac) {
			Registro intRpac=new RegistroPaciente(this.reflocal.getGestionPacientes());
			intRpac.registrar();
		}
		if(e.getSource()==BtRegisPerSa) {
			Registro intRpersonal=new RegistroPersonalSalud(this.reflocal);
			intRpersonal.registrar();	
		}
		if(e.getSource()==BtVacun) {
			intpac.InterVacunar();
		}
		if(e.getSource()==BtRegisVacun) {
			
			this.reflocal.getInventario().llamarARegistrar();
		}
		if(e.getSource()==BtSalir) {
			Login login1 = new Login(reflocal);
			login1.setBounds(0,0,300,165);
			login1.setVisible(true);
			login1.setLocationRelativeTo(null);
			login1.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(false);
		}
		if(e.getSource()==BtMostrarStock) {
			MostrarStockVacunas MosStocVac = new MostrarStockVacunas(this.reflocal);
			MosStocVac.setBounds(0,0,400,400);
			MosStocVac.setVisible(true);
			MosStocVac.setLocationRelativeTo(null);
			MosStocVac.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(false);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Local lo= new Local(new Direccion("Cayma","Arequipa"),"SANA 4");
		Login login1 = new Login(lo);
		login1.mostrar_interfaz();
		}
	
}
