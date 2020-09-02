package Logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import presentacion.Componente;
import utilitario.ConexionBD;
import utilitario.Ingrediente;
import utilitario.EsqueletoPlatillo;

public class Platillo extends Componente {
	private EsqueletoPlatillo objEsqueleto;
	private ConexionBD db;

	/*
	 * Metodo que recibe el tamano maximo e instancia el objEsqueleto global que se
	 * usa en los otros metodos, usa la BD para calcular el nuevo ID del platillo
	 */
	public Object construirPlatillo(int tamano) {
		db = ConexionBD.getInstancia();
		ArrayList<EsqueletoPlatillo> objTemp = db.getPlatillo();
		int idTemp = 0;
		for (int i = 0; i < objTemp.size(); i++) {
			EsqueletoPlatillo objPlatillo = objTemp.get(i);
			if (objPlatillo.getId() >= idTemp) {
				idTemp = objPlatillo.getId();
			}
		}
		objEsqueleto = new EsqueletoPlatillo(tamano, idTemp + 1);
		return objEsqueleto;
	}

	/*
	 * Usa el objEsqueleto globar para guardarlo con sus respectivos atributos en la
	 * BD
	 */
	public boolean guardarElDestinoDlPlatillo() {
		boolean bandera = false;
		if (objEsqueleto.getIngredientes().size() > 0) {
			try {
				db = ConexionBD.getInstancia();
				this.objEsqueleto.calcularPrecio();
				db.insertar(this.objEsqueleto);
				JOptionPane.showMessageDialog(null, "ID de su platillo: " + objEsqueleto.getId());
				bandera = true;
			} catch (Exception e) {
				System.out.println("No se pudo guardar el destino del platillo");
			}
		}

		return bandera;
	}

	/*
	 * Anade el id del ingrediente a la lista correspondiente en objEsqueleto, usa
	 * la BD para verificar la existencia del ingrediente y despues verifica que el
	 * limite del esquelo no sea superado
	 */
	public boolean anadirIngrediente(int id) {
		boolean bandera = false;
		db = ConexionBD.getInstancia();
		ArrayList<Ingrediente> ingredientes = db.getIngrediente();		
		for (int i = 0; i < ingredientes.size(); i++) {
			Ingrediente ingrediente = ingredientes.get(i);
			if (ingrediente.getId() == id) {
				if (objEsqueleto.getLimite() > objEsqueleto.getIngredientes().size()) {
					System.out.println("Anadir Ingrediente: " + ingrediente.getId());
					objEsqueleto.anadirIng(id);
					bandera = true;
				}
			}
		}
		return bandera;
	}

	/* Invoca el metodo removerIng de objEsqueleto */
	public boolean eliminarIngrediente(int id) {
		return objEsqueleto.removerIng(id);
	}
}
