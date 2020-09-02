package vista;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import cableado.ILienzo;
import cableado.IRecaudo;
import utilitario.ConexionBD;
import utilitario.EntradaSalida;

public class ControladorPagos {
	private VistaPagos view;
	private IRecaudo model;
	private JButton objBoton;
	private JTextField objTextField;
	private JLabel objLbl;	
	private EntradaSalida io;
	private ConexionBD db;
	private JTextArea objTxtArea;
	private int idPlatillo;

	public ControladorPagos(VistaPagos objVista, IRecaudo modelRecaudo) {
		this.view = objVista;
		this.model = modelRecaudo; 
		objBoton = new JButton();
		objTextField = new JTextField();
		objLbl= new JLabel();
		objTxtArea = new JTextArea();
		io = new EntradaSalida();
		db = ConexionBD.getInstancia();
		idPlatillo = 0;
	}

	public void iniciar() {
		view.setTitle("Aureo - Pagos");
		objBoton = view.getJbPagar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnPagarActionPerformed(evt);
		});
		view.setJbPagar(objBoton);
		
		objBoton = view.getJbSeleccion();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnSeleccionActionPerformed(evt);
		});
		view.setJbSeleccion(objBoton);				
		
	}

	private void jbtnSeleccionActionPerformed(ActionEvent evt) {
		idPlatillo = io.entradaInt("Digite el id del platillo a pagar");
		String texto = "Detalle Platillo: "+idPlatillo;
		objLbl = view.getJlblDetalleFactura();		
		objLbl.setText(texto);
		view.setJlblDetalleFactura(objLbl);		
		objTxtArea = view.getTextArea();
		String aux1 = "";
		int aux2 = 0;
		try {
			aux1=db.detallePlatillo(idPlatillo);
			aux2=db.getPrecioPlatillo(idPlatillo);
			objTxtArea.setText(aux1 + "\n \nTotal: "+aux2);
			view.setTextArea(objTxtArea);
			objBoton = view.getJbSeleccion();
			objBoton.setVisible(false);
			view.setJbSeleccion(objBoton);
			view.repaint();			
		}catch(Exception e) {
			
		}
	}

	private void jbtnPagarActionPerformed(ActionEvent evt) {		
		objTextField = view.getTxtDireccion();
		String direccion = objTextField.getText();
		objTextField = view.getTxtCliente();
		
		int cliente = 0;
		int valor = 0;
		try {
			cliente = Integer.parseInt(objTextField.getText());
			valor = io.entradaInt("Inserte el dinero");
		} catch (Exception e) {
		}	
		if(cliente > 0) {
			int retorno = 0;
			retorno = model.captarPago(idPlatillo, valor, cliente, direccion);
			if (retorno > 0) {
				io.salida("Su cambio: "+retorno);
			}
		}				
	}

}
