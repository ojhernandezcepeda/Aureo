package edu;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Logica.ModeloElementos;
import Vista.VistaElementos;

public class ControladorElementos {
	// ATRIBUTOS
	private VistaElementos view;
	private ModeloElementos model;
	private JButton objBoton;
	private JTextArea objTextArea;
	// METODOS

	public ControladorElementos(VistaElementos view, ModeloElementos model){
			this.view = view;
	        this.model = model;
	        objBoton = new JButton();
	        objTextArea = new JTextArea();
	    }

	public void iniciar() {
		view.setTitle("Gestor de Elementos");
		/* Añadir Action Listener a los Botones de la interfaz */
		objBoton = view.getJbListar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbListar(evt);
		});

		view.setJbListar(objBoton);

		objBoton = view.getJbInsertar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbInsertar(evt);
		});
		view.setJbListar(objBoton);

		objBoton = view.getJbEliminar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbEliminar(evt);
		});
		view.setJbEliminar(objBoton);
	}

	private void jbListar(ActionEvent evt) {
		objTextArea = view.getTextArea();
		objTextArea.setText(model.listar());
		view.setTextArea(objTextArea);
		view.repaint();
	}

	private void jbInsertar(ActionEvent evt) {
		String nombre;
		int costoMantenimiento;
		nombre = JOptionPane.showInputDialog("Intruzca el nombre del Elemento");
		try {
			costoMantenimiento = Integer.parseInt(JOptionPane.showInputDialog("Intruzca el costo de mantenimiento \n del Elemento"));
		} catch (Exception e) {
			costoMantenimiento = 0;
		}
		model.anadir(nombre, costoMantenimiento);
	}

	private void jbEliminar(ActionEvent evt) {
		int id = -1;
		try {
			id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del Elemento que desea eliminar"));
			model.eliminar(id);
		} catch (Exception e) {

		}
		
	}

}
