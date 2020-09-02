package edu;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Logica.ModeloInventario;
import Vista.VistaInventario;

public class ControladorInventario {
//ATRIBUTOS
	private VistaInventario view;
    private ModeloInventario model;
    private JButton objBoton;
    private JTextArea objTextArea;
//METODOS

	public ControladorInventario(VistaInventario view, ModeloInventario model){
		this.view = view;
        this.model = model;
        objBoton = new JButton();
        objTextArea = new JTextArea();
    }
	public void iniciar(){
		view.setTitle("Gestor de Inventario");
        /*Añadir Action Listener a los Botones de la interfaz*/
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
		objTextArea=view.getTextArea();
		objTextArea.setText(model.listar());
		view.setTextArea(objTextArea);
		view.repaint();
	}
	private void jbInsertar(ActionEvent evt) {
		String nombre, dirImagen;
		int precio;
		nombre = JOptionPane.showInputDialog("Intruzca el nombre del ingrediente");
		dirImagen = JOptionPane.showInputDialog("Intruzca la direccion de la \n imagen del ingrediente");
		try {
			precio = Integer.parseInt(JOptionPane.showInputDialog("Intruzca el precio del ingrediente"));
		} catch (Exception e) {
			precio=0;
		}
		model.anadir(nombre, dirImagen, precio);
	}
	private void jbEliminar(ActionEvent evt) {
		int id=-1;
		try {
			id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del ingrediente que desea eliminar"));
		} catch (Exception e) {
			
		}
		model.eliminar(id);
	}
	
}