import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

	private JLabel labelBienvenida;
	private JButton BtMostrarLisPac, BtRegisPac, BtVacun, BtMostrarStock, BtSalir;
	
	public Principal() {
		
		setLayout(null);
		labelBienvenida = new JLabel("BIENVENIDO A SAVA");
		labelBienvenida.setBounds(95,0,500,50);
		labelBienvenida.setFont(new Font("Helvetica",Font.BOLD, 20));
		add(labelBienvenida);
		
		BtMostrarLisPac = new JButton("1. Mostrar Lista de Pacientes");
		BtMostrarLisPac.setBounds(15,80,200,30);
		add(BtMostrarLisPac);
		BtMostrarLisPac.addActionListener(this);
		
		BtRegisPac = new JButton("2.Registrar Pacientes");
		BtRegisPac.setBounds(15,130,200,30);
		add(BtRegisPac);
		BtRegisPac.addActionListener(this);
		
		BtVacun = new JButton("3. vacunar");
		BtVacun.setBounds(15,180,200,30);
		add(BtVacun);
		BtVacun.addActionListener(this);
		
		BtMostrarStock = new JButton("4. Mostrar stock de vacunas");
		BtMostrarStock.setBounds(15,230,200,30);
		add(BtMostrarStock);
		BtMostrarStock.addActionListener(this);
		
		BtSalir = new JButton("5. Salir");
		BtSalir.setBounds(15,280,200,30);
		add(BtSalir);
		BtSalir.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==BtSalir) {
			Login login1 = new Login();
			login1.setBounds(0,0,300,165);
			login1.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()==BtMostrarStock) {
			MostrarStockVacunas MosStocVac = new MostrarStockVacunas();
			MosStocVac.setBounds(0,0,400,400);
			MosStocVac.setVisible(true);
			this.setVisible(false);
			
		}
		
	}
}
