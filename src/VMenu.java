
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
public class VMenu extends JFrame {

	JPanel contentPane;
	JLabel lblVader;
	FontsStarWars cf= new FontsStarWars();
	JButton btnSith;
	JButton btnMaul;
	
	/**
	 * Create the frame.
	 */
	public VMenu() {
		setUndecorated(true);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(VMenu.class.getResource("/objetos/5.png")));
		setForeground(Color.BLACK);
		setBackground(SystemColor.desktop);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 288);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSith = new JButton("exit");
		btnSith.setFocusable(false);
		btnSith.setContentAreaFilled(false);
		btnSith.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnSith.setIcon(null);

		btnSith.setBackground(Color.YELLOW);
		btnSith.setForeground(Color.ORANGE);
		btnSith.setFont(cf.MyFont(0, 28));
		btnSith.setBounds(959, 190, 130, 98);
		contentPane.add(btnSith);
		
		btnMaul = new JButton("Darth Maul");
		btnMaul.setFocusable(false);
		btnMaul.setContentAreaFilled(false);
		btnMaul.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnMaul.setIcon(null);
		btnMaul.setBounds(10, 254, 222, 34);
		btnMaul.setBackground(Color.YELLOW);
		btnMaul.setForeground(Color.ORANGE);
		btnMaul.setFont(cf.MyFont(0, 28));
		contentPane.add(btnMaul);
		
		lblVader = new JLabel("");
		
		lblVader.setFont(new Font("Star Jedi Outline", Font.BOLD, 28));
		lblVader.setHorizontalAlignment(SwingConstants.CENTER);
		lblVader.setMaximumSize(new Dimension(52, 14));
		lblVader.setIcon(new ImageIcon(VMenu.class.getResource("/objetos/1.jpg")));
		lblVader.setBounds(0, -27, 1128, 337);
		contentPane.add(lblVader);
	}

	public void setControlador(controladorVMenu l) 
	{
		lblVader.addMouseListener(l);
		btnSith.addActionListener(l);
		btnMaul.addActionListener(l);
		
	}
}
