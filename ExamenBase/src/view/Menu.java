package view;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Menu extends JFrame {
	
	private JButton btnRegresar = new JButton("Regresar");
	private final JLabel lblNombre = new JLabel("Nombre:  ");
	private final JTextField txtNombre = new JTextField();
	private final JLabel lblNss = new JLabel("NSS: ");
	private final JTextField txtNss = new JTextField();
	
	private final JLabel lblResultado = new JLabel("[resultado]");

	private final JTextField txtSexo = new JTextField();
	private final JTextField txtEdad = new JTextField();
	private final JLabel lblEdad = new JLabel("Edad: ");
	private final JTextField txtPeso = new JTextField();
	private final JLabel lblPeso = new JLabel("Peso: ");
	private final JTextField txtAltura = new JTextField();
	private final JLabel lblSexo = new JLabel("Sexo: ");
	private final JLabel lblAltura = new JLabel("Altura: ");
	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Banco System");
		JPanel contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 382);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});*/
		btnRegresar.setBackground(Color.WHITE);
		
		btnRegresar.setBounds(227, 290, 96, 23);
		contentPane.add(btnRegresar);
				
		JLabel lblBancoSystems = new JLabel("Calculo de IMC");
		lblBancoSystems.setFont(new Font("Bitstream Vera Serif", Font.BOLD, 20));
		lblBancoSystems.setBounds(136, 12, 176, 23);
		contentPane.add(lblBancoSystems);
				
		JLabel lblMuneClientes = new JLabel("Resultados");
		lblMuneClientes.setFont(new Font("Bitstream Vera Serif", Font.BOLD, 12));
		lblMuneClientes.setBounds(171, 47, 112, 23);
		contentPane.add(lblMuneClientes);
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 83, 70, 15);
		
		contentPane.add(lblNombre);
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(98, 81, 225, 19);
		
		contentPane.add(txtNombre);
		lblNss.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNss.setBounds(10, 111, 70, 15);
		
		contentPane.add(lblNss);
		txtNss.setEditable(false);
		txtNss.setColumns(10);
		txtNss.setBounds(98, 109, 225, 19);
		
		contentPane.add(txtNss);
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Dialog", Font.BOLD, 15));
		lblResultado.setBounds(10, 231, 352, 23);
		
		contentPane.add(lblResultado);
		txtSexo.setEditable(false);
		txtSexo.setColumns(10);
		txtSexo.setBounds(98, 139, 78, 19);
		
		contentPane.add(txtSexo);
		txtEdad.setEditable(false);
		txtEdad.setColumns(10);
		txtEdad.setBounds(245, 139, 78, 19);
		
		contentPane.add(txtEdad);
		lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdad.setBounds(171, 142, 70, 15);
		
		contentPane.add(lblEdad);
		txtPeso.setEditable(false);
		txtPeso.setColumns(10);
		txtPeso.setBounds(98, 175, 78, 19);
		
		contentPane.add(txtPeso);
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setBounds(10, 178, 70, 15);
		
		contentPane.add(lblPeso);
		txtAltura.setEditable(false);
		txtAltura.setColumns(10);
		txtAltura.setBounds(245, 175, 78, 19);
		
		contentPane.add(txtAltura);
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setBounds(10, 142, 70, 15);
		
		contentPane.add(lblSexo);
		lblAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura.setBounds(171, 178, 70, 15);
		
		contentPane.add(lblAltura);
		
		
	
	}
	
	public void setNombre(String nombre) {
		this.txtNombre.setText(nombre);
	}
	public void setNss(String nss) {
		this.txtNss.setText(nss);
	}
	public void setEdad(String edad) {
		this.txtEdad.setText(edad);
	}
	public void setSexo(String sexo) {
		this.txtSexo.setText(sexo);
	}
	public void setPeso(String peso) {
		this.txtPeso.setText(peso);
	}
	public void setAltura(String altura) {
		this.txtAltura.setText(altura);
	}
	
	public void setResultado(String resultado) {
		this.lblResultado.setText(resultado);
	}
	
	public void addRegresar(ActionListener close)
	{
		btnRegresar.addActionListener(close);
	}


}
