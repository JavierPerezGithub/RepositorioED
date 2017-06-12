import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class DarthMaul extends JPanel
{
	private JLabel lblLabel;
	private JLabel lbllabel2;
	JButton btnVolver;
	FontsStarWars cf= new FontsStarWars();
	JTextPane txtpnHola;
	private JScrollPane scrollPane;

	
	public DarthMaul()
	{
		setBackground(Color.BLACK);
		setBounds(0, -27, 1128, 337);
		setLayout(null);
		
		lblLabel = new JLabel("");
		lblLabel.setIcon(new ImageIcon(DarthMaul.class.getResource("/objetos/2.gif")));
		lblLabel.setBounds(22, 32, 246, 209);
		add(lblLabel);
		
		lbllabel2 = new JLabel("");
		lbllabel2.setIcon(new ImageIcon(DarthMaul.class.getResource("/objetos/tumblr_mv72mbz4611sx2peuo3_500.gif")));
		lbllabel2.setBounds(551, 32, 450, 192);
		add(lbllabel2);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFocusPainted(false);
		btnVolver.setFocusable(false);
		btnVolver.setIcon(null);
		btnVolver.setContentAreaFilled(false);
		btnVolver.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnVolver.setBackground(Color.YELLOW);
		btnVolver.setForeground(Color.ORANGE);
		btnVolver.setFont(cf.MyFont(0, 15));
		btnVolver.setBounds(22, 243, 117, 35);
		add(btnVolver);
		
		scrollPane = new JScrollPane();
		scrollPane.setWheelScrollingEnabled(false);
		scrollPane.setBounds(278, 32, 236, 209);
		add(scrollPane);
		
		txtpnHola = new JTextPane();
		scrollPane.setViewportView(txtpnHola);
		txtpnHola.setText("Darth Maul fue un zabrak dathomiriano y Lord Sith que vivi� durante los �ltimos a�os de la Rep�blica Gal�ctica y en los a�os previos a la Guerra Civil Gal�ctica. Maul naci� de la madre Talzin y se cri� como un Hermano de la Noche en Dathomir, antes de ser tomado por Darth Sidious como su aprendiz . Maul aprendi� el arte del combate con sables l�ser y tom� una hoja doble de sable l�ser como sable de luz personal, convirti�ndose en un arma para ser utilizada en contra de la Orden Jedi. ");
		txtpnHola.setFont(cf.MyFont(0, 15));
		txtpnHola.setForeground(Color.ORANGE);
		txtpnHola.setEditable(false);
		txtpnHola.setBackground(Color.BLACK);
	}


	public void setControlador(ControladorMaul controMaul)
	{
		
		btnVolver.addActionListener(controMaul);
	}
}

