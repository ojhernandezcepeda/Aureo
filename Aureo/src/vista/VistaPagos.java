package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaPagos extends JFrame {

	private JPanel panelGeneral;
	private JTextField txtDireccion, txtCliente;		
	private JTextArea textArea;
	private JButton jbSeleccion, jbPagar;
	private JLabel jlblNombreCliente, jlblSeleccionarFactura, jlblDireccion,  jlblDetalleFactura;
	
	
	/**
	 * Create the frame.
	 */
	public VistaPagos() {
		setResizable(false);
		setTitle("Aureo - Pagos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 500);
		
		
		panelGeneral = new JPanel();
		panelGeneral.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(panelGeneral);
		panelGeneral.setLayout(null);				 
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(228, 150, 249, 20);
		txtDireccion.setColumns(10);
		panelGeneral.add(txtDireccion);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(228, 83, 249, 20);
		txtCliente.setColumns(10);
		panelGeneral.add(txtCliente);
		
		jlblDetalleFactura = new JLabel("Detalle Platillo:");
		jlblDetalleFactura.setBounds(15, 18, 195, 21);
		panelGeneral.add(jlblDetalleFactura);
		
		textArea = new JTextArea();
		textArea.setBounds(15, 45, 195, 340);
		textArea.setEditable(false);
		panelGeneral.add(textArea);
		
		jlblDireccion = new JLabel("Direccion Entrega");
		jlblDireccion.setBounds(228, 114, 249, 25);
		panelGeneral.add(jlblDireccion);
		
		jbSeleccion = new JButton("Seleccionar");
		jbSeleccion.setBounds(374, 17, 103, 23);
		panelGeneral.add(jbSeleccion);
		
		jlblNombreCliente = new JLabel("Cedula del Cliente");
		jlblNombreCliente.setBounds(228, 46, 249, 23);
		panelGeneral.add(jlblNombreCliente);
		
		jlblSeleccionarFactura = new JLabel("Seleccionar Platillo");
		jlblSeleccionarFactura.setBounds(228, 17, 136, 22);
		panelGeneral.add(jlblSeleccionarFactura);
		
		jbPagar = new JButton("Pagar Factura");
		jbPagar.setBounds(228, 363, 249, 23);
		panelGeneral.add(jbPagar);	
		
		add(panelGeneral);
	}


	public JPanel getPanelGeneral() {
		return panelGeneral;
	}


	public void setPanelGeneral(JPanel panelGeneral) {
		this.panelGeneral = panelGeneral;
	}



	public JTextField getTxtDireccion() {
		return txtDireccion;
	}


	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}


	public JTextField getTxtCliente() {
		return txtCliente;
	}


	public void setTxtCliente(JTextField txtCliente) {
		this.txtCliente = txtCliente;
	}


	public JTextArea getTextArea() {
		return textArea;
	}


	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}


	public JButton getJbSeleccion() {
		return jbSeleccion;
	}


	public void setJbSeleccion(JButton jbSeleccion) {
		this.jbSeleccion = jbSeleccion;
	}


	public JButton getJbPagar() {
		return jbPagar;
	}


	public void setJbPagar(JButton jbPagar) {
		this.jbPagar = jbPagar;
	}


	public JLabel getJlblDetalleFactura() {
		return jlblDetalleFactura;
	}


	public void setJlblDetalleFactura(JLabel jlblDetalleFactura) {
		this.jlblDetalleFactura = jlblDetalleFactura;
	}
	
	
}