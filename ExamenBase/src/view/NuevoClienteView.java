package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.SystemColor;
import javax.swing.JComboBox;

public class NuevoClienteView extends JFrame {

	public JButton btnGuardar = new JButton("Guardar");
	public JButton btnCancelar = new JButton("Cancelar");
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JComboBox comboSexo = new JComboBox();

	/**
	 * Launch the application.
	 * 
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { NuevoEmpleadoView frame = new
	 * NuevoEmpleadoView(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the frame.
	 */
	public NuevoClienteView() {
		setTitle("Cliente Nuevo - Banco System's");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 317, 342);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCalculoDeImc = new JLabel("Calculo de IMC");
		lblCalculoDeImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculoDeImc.setFont(new Font("Bitstream Vera Serif", Font.BOLD, 20));
		lblCalculoDeImc.setBounds(17, 12, 274, 23);
		contentPane.add(lblCalculoDeImc);

		JLabel lblNuevoCliente = new JLabel("Llena el formulario");
		lblNuevoCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoCliente
				.setFont(new Font("Bitstream Vera Serif", Font.BOLD, 12));
		lblNuevoCliente.setBounds(17, 46, 274, 23);
		contentPane.add(lblNuevoCliente);

		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(17, 102, 70, 15);
		contentPane.add(lblNombre);

		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdad.setBounds(0, 147, 87, 15);
		contentPane.add(lblEdad);

		JLabel lblSaldo = new JLabel("Peso:");
		lblSaldo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaldo.setBounds(46, 192, 41, 15);
		contentPane.add(lblSaldo);

		txtNombre = new JTextField();
		txtNombre.setBounds(105, 100, 163, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtEdad = new JTextField();
		txtEdad.setBounds(105, 145, 26, 19);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);

		txtPeso = new JTextField();
		txtPeso.setBounds(102, 189, 41, 19);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		btnGuardar.setForeground(SystemColor.text);
		btnGuardar.setBackground(SystemColor.textHighlight);

		
		btnGuardar.setBounds(176, 257, 92, 25);
		contentPane.add(btnGuardar);
				btnCancelar.setForeground(SystemColor.text);
				btnCancelar.setBackground(SystemColor.textHighlight);

		
				btnCancelar.setBounds(33, 257, 105, 25);
		contentPane.add(btnCancelar);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setBounds(141, 147, 41, 15);
		contentPane.add(lblSexo);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura.setBounds(150, 195, 41, 15);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(201, 189, 67, 19);
		contentPane.add(txtAltura);
		
		
		comboSexo.setBounds(192, 143, 76, 22);
		comboSexo.addItem("Hombre");
		comboSexo.addItem("Mujer");
		contentPane.add(comboSexo);
	}
	public void addCancelarListener (ActionListener cancelar){
		btnCancelar.addActionListener(cancelar);
	}
	public void addGuardarListener (ActionListener guardar){
		btnGuardar.addActionListener(guardar);
	}
	public String getNombre()
	{
		return txtNombre.getText();
	}
	public String getEdad()
	{
//		return Integer.parseInt(txtEdad.getText());
		return txtEdad.getText();
	}
	
	public char getSexo()
	{
		String sexoString = (String) comboSexo.getSelectedItem(); 
		
		if(sexoString == "Mujer") {
			return 'M';
		} else {
			return 'H';
		}
		
	}
	public String getPeso()
	{
//		return Double.parseDouble(txtPeso.getText());
		 return txtPeso.getText();
	}
	public String getAltura()
	{
//		return Double.parseDouble(txtAltura.getText());
		return txtAltura.getText();
	}
	public void setNombre(String nombre) {
		this.txtNombre.setText(nombre);
	}
	public void setEdad(String edad) {
		this.txtEdad.setText(edad);
	}
//	public void setSexo(String sexo) {
//		this.txtSexo.setText(sexo);
//	}
	public void setPeso(String peso) {
		this.txtEdad.setText(peso);
	}
	public void setAltura(String altura) {
		this.txtEdad.setText(altura);
	}
}
