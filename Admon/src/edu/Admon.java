package edu;

import javax.swing.JOptionPane;

import Logica.ModeloElementos;
import Logica.ModeloFondos;
import Logica.ModeloInventario;
import Logica.ModeloVentas;
import Vista.VistaElementos;
import Vista.VistaFondos;
import Vista.VistaInventario;
import Vista.VistaVentas;
import cableado.IGestor;
import utilitario.ConexionBD;

public class Admon implements IGestor{

	@Override
	public boolean gestionarVentas() { 
		try {
			System.out.println("gestionarVentas");
			ModeloVentas objModelo = new ModeloVentas();
	        VistaVentas objVista = new VistaVentas();
	        ControladorVentas objControlador = new ControladorVentas(objVista, objModelo);
	        objControlador.iniciar();
	        objVista.setVisible(true);
	        return true;
		} catch (Exception e) {
			return false;		
		}		
	}

	@Override
	public boolean gestionarInventario() {
		try {
			ModeloInventario objModelo = new ModeloInventario();
	        VistaInventario objVista = new VistaInventario();
	        ControladorInventario objControlador = new ControladorInventario(objVista, objModelo);
	        objControlador.iniciar();
	        objVista.setVisible(true);
	        return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean gestionarElemento() {
		try {
			ModeloElementos objModelo = new ModeloElementos();
			VistaElementos objVista = new VistaElementos();
			ControladorElementos objControlador = new ControladorElementos(objVista, objModelo);
			objControlador.iniciar();
	        objVista.setVisible(true);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean gestionarFondos() {
		try {
			System.out.println("Gestion de Fondos");
			ModeloFondos objModelo = new ModeloFondos();
			VistaFondos objVista = new VistaFondos();
			ControladorFondos objControlador = new ControladorFondos(objVista, objModelo);
			objControlador.iniciar();
	        objVista.setVisible(true);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}