package edu;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Logica.ModeloFondos;
import Logica.ModeloInventario;
import Vista.VistaFondos;
import Vista.VistaInventario;

public class ControladorFondos {
	// ATRIBUTOS
	private VistaFondos view;
	private ModeloFondos model;
	private JButton objBoton;
	private JTextArea objTextArea;
	// METODOS

	public ControladorFondos(VistaFondos view, ModeloFondos model){
			this.view = view;
	        this.model = model;
	        objBoton = new JButton();
	        objTextArea = new JTextArea();
	    }

	public void iniciar() {
		view.setTitle("Gestor de Fondos");
		/* Añadir Action Listener a los Botones de la interfaz */
		objBoton = view.getJbListar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbListar(evt);
		});

		view.setJbListar(objBoton);

		objBoton = view.getJbInsertar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbContratar(evt);
		});
		view.setJbListar(objBoton);

		objBoton = view.getJbDespedir();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbDespedir(evt);
		});
		view.setJbDespedir(objBoton);
		
		objBoton = view.getJbGenerarNomina();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbGenerarNomina(evt);
		});
		view.setJbGenerarNomina(objBoton);
	}

	private void jbListar(ActionEvent evt) {
		objTextArea = view.getTextArea();
		objTextArea.setText(model.listarEmpleados());
		view.setTextArea(objTextArea);
		view.repaint();
	}
	
	private void jbGenerarNomina(ActionEvent evt) {
		objTextArea = view.getTextArea();
		objTextArea.setText(model.generarNomina());
		view.setTextArea(objTextArea);
		view.repaint();
	}

	private void jbContratar(ActionEvent evt) {
		String nombre, rol;
		int gananciaNeta;
		nombre = JOptionPane.showInputDialog("Intruzca el nombre del empleado");
		rol = JOptionPane.showInputDialog("Intruzca el rol del empleado");
		try {
			gananciaNeta = Integer.parseInt(JOptionPane.showInputDialog("Intruzca el salario"));
		} catch (Exception e) {
			gananciaNeta = 0;
		}
		model.contratarEmpleado(nombre, rol, gananciaNeta);
	}

	private void jbDespedir(ActionEvent evt) {
		int id = -1;
		try {
			id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del empleado a despedir"));
		} catch (Exception e) {}
		model.despedirEmpleado(id);
	}
}