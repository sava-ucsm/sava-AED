import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MostrarStockVacunas extends JFrame implements ActionListener{

	private JLabel labelVacuna;
	private JTextArea txtArea;
	private JButton BT1;
	
	public MostrarStockVacunas() {
		
		setLayout(null);
		labelVacuna = new JLabel("Stock Vacunas");
		labelVacuna.setBounds(120,0,500,50);
		labelVacuna.setFont(new Font("Helvetica",Font.BOLD, 20));
		add(labelVacuna);
		
		setLayout(null);
		BT1 = new JButton("Retornar");
		BT1.setBounds(35,42,100,30);
		add(BT1);
		BT1.addActionListener(this);
		
		setLayout(null);
		
		txtArea = new JTextArea();
		txtArea.setBounds(35,80,300,230);
		txtArea.setText("Pfizer 50000-Efectividad 2000");
	    add(txtArea);
	    txtArea.setEditable(false);
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==BT1) {
			Principal principal1 = new Principal();
			principal1.setBounds(0,0,400,400);
			principal1.setVisible(true);
			this.setVisible(false);;

		}
		
	}
}
