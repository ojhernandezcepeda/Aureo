package vista;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import cableado.IDespacho;
import cableado.IRecaudo;
import utilitario.ConexionBD;
import utilitario.EntradaSalida;

public class ControladorDomicilio {
	private VistaDomicilio view;
	private IDespacho model;
	private JButton objBoton;
	private JTextField objTextField;
	private JLabel objLbl;
	private JPanel objSubPanel, objPnlGeneral;
	private EntradaSalida io;
	private ConexionBD db;
	private JTextArea objTxtArea;
	private int idFactura;
	private JScrollPane objScroll;

	public ControladorDomicilio(VistaDomicilio objVista, IDespacho modelRecaudo) {
		this.view = objVista;
		this.model = modelRecaudo;
		objBoton = new JButton();
		objTextField = new JTextField();
		objLbl = new JLabel();
		objSubPanel = new JPanel();
		objPnlGeneral = new JPanel();
		objTxtArea = new JTextArea();
		objScroll = new JScrollPane();
		io = new EntradaSalida();
		db = ConexionBD.getInstancia();
		idFactura = 0;
	}

	public void iniciar() {
		objBoton = view.getJbDespachar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnDespacharActionPerformed(evt);
		});
		view.setJbDespachar(objBoton);

		objBoton = view.getJbVerificar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnVerificarActionPerformed(evt);
		});
		objBoton.setVisible(false);
		view.setJbVerificar(objBoton);

		objBoton = view.getJbSeleccion();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnSeleccionActionPerformed(evt);
		});
		view.setJbSeleccion(objBoton);
		
		objScroll = view.getScroll();
		objTxtArea = view.getTextArea();
	}

	private void jbtnSeleccionActionPerformed(ActionEvent evt) {
		idFactura = io.entradaInt("Digite el id de la factura del domicilio");
		String texto = "Detalle Factura: "+idFactura;
		objLbl = view.getJlblFactura1();		
		objLbl.setText(texto);
		view.setJlblFactura1(objLbl);		
		objTxtArea = view.getTextArea();
		try {							
			objTxtArea.setText(db.getDetalleFactura(idFactura));
			objTextField = view.getTxtCliente();
			objTextField.setText(db.getClienteFactura(idFactura));
			view.setTxtCliente(objTextField);
			objTextField = view.getTextDireccion();
			objTextField.setText(db.getDirFactura(idFactura));
			view.setTextDireccion(objTextField);
			view.setTextArea(objTxtArea);
			view.repaint();
		}catch(Exception e) {			
		}
		
	}

	private void jbtnVerificarActionPerformed(ActionEvent evt) {
		io.salidaText(model.verificarEntrega(),"Historico de despachos");
		
	}

	private void jbtnDespacharActionPerformed(ActionEvent evt) {
		if(model.despacharPedido(idFactura)) {
			objBoton = view.getJbVerificar();
			objBoton.setVisible(true);
			view.setJbDespachar(objBoton);
			view.repaint();
		}				
	}

}
