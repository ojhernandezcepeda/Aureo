package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JTextField;


public class VistaDomicilio extends JFrame {
	
	private JTextField textDireccion;
	private JTextField txtCliente;
	private JScrollPane scroll;
	private JTextArea textArea;
	private JLabel jlblFactura1, jlblDireccion, jlblSeleccionar, jlblCliente;
	private JButton jbDespachar, jbVerificar, jbSeleccion;

	/**	
	 * Create the frame.
	 */
	public VistaDomicilio() {
		setResizable(false);
		setTitle("Aureo - Domicilio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 500);		
		
		jlblFactura1 = new JLabel("Detalles Factura:");
		jlblFactura1.setBounds(15, 15, 195, 21);						
		
		jlblDireccion = new JLabel("Direccion Entrega");
		jlblDireccion.setBounds(228, 114, 249, 25);
		
		jbSeleccion = new JButton("Seleccionar");
		jbSeleccion.setBounds(374, 17, 103, 23);
		
		jlblCliente = new JLabel("Nombre del Cliente");
		jlblCliente.setBounds(228, 46, 249, 23);
		
		jlblSeleccionar = new JLabel("Seleccionar Factura");
		jlblSeleccionar.setBounds(228, 17, 136, 22);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(228, 150, 249, 20);
		textDireccion.setEditable(false);
		textDireccion.setColumns(10);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(228, 83, 249, 20);
		txtCliente.setEditable(false);
		txtCliente.setColumns(10);
						
		jbDespachar = new JButton("Despachar Entrega");
		jbDespachar.setBounds(228, 329, 249, 23);
		
		
		jbVerificar = new JButton("Verificar Entrega");
		jbVerificar.setBounds(228, 363, 249, 23);
		
		textArea = new JTextArea();
		textArea.setBounds(15, 45, 195, 340);
		textArea.setEditable(false);
		scroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);		
		
		setLayout(null);
		add(jbVerificar);
		add(jbDespachar);		
		add(textDireccion);
		add(txtCliente);
		add(jlblFactura1);
		add(jlblDireccion);
		add(jbSeleccion);
		add(jlblCliente);
		add(jlblSeleccionar);
		add(scroll);
		add(textArea);
	}

	public JTextField getTextDireccion() {
		return textDireccion;
	}

	public void setTextDireccion(JTextField textDireccion) {
		this.textDireccion = textDireccion;
	}

	public JTextField getTxtCliente() {
		return txtCliente;
	}

	public void setTxtCliente(JTextField txtCliente) {
		this.txtCliente = txtCliente;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getJbDespachar() {
		return jbDespachar;
	}

	public void setJbDespachar(JButton jbDespachar) {
		this.jbDespachar = jbDespachar;
	}

	public JButton getJbVerificar() {
		return jbVerificar;
	}

	public void setJbVerificar(JButton jbVerificar) {
		this.jbVerificar = jbVerificar;
	}

	public JButton getJbSeleccion() {
		return jbSeleccion;
	}

	public void setJbSeleccion(JButton jbSeleccion) {
		this.jbSeleccion = jbSeleccion;
	}

	public JLabel getJlblFactura1() {
		return jlblFactura1;
	}

	public void setJlblFactura1(JLabel jlblFactura1) {
		this.jlblFactura1 = jlblFactura1;
	}
	
	

}