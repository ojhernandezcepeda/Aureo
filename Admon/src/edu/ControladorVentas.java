package edu;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextArea;
import Logica.ModeloVentas;
import Vista.VistaVentas;

public class ControladorVentas {
// ATRIBUTOS
	private VistaVentas view;
	private ModeloVentas model;
	private JButton objBoton;
	private JTextArea objTextArea;
// METODOS

	public ControladorVentas(VistaVentas view, ModeloVentas model) {
		this.view = view;
		this.model = model;
		objBoton = new JButton();
		objTextArea = new JTextArea();
	}

	public void iniciar() {
		view.setTitle("Gestor de Inventario");
		/* Añadir Action Listener a los Botones de la interfaz */
		objBoton = view.getJbFacturas();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbFacturas(evt);
		});

		view.setJbFacturas(objBoton);

		objBoton = view.getJbGanancias();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbGanancias(evt);
		});
		view.setJbFacturas(objBoton);

	}

	private void jbFacturas(ActionEvent evt) {
		objTextArea = view.getTextArea();
		objTextArea.setText(model.listarVentas());
		view.setTextArea(objTextArea);
		view.repaint();
	}

	private void jbGanancias(ActionEvent evt) {
		objTextArea = view.getTextArea();
		objTextArea.setText(model.revisarGanancias());
		view.setTextArea(objTextArea);
		view.repaint();
	}
}