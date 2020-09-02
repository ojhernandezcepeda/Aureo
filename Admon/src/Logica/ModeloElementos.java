package Logica;

import java.util.ArrayList;

import utilitario.ConexionBD;
import utilitario.Elemento;

public class ModeloElementos {
//ATRIBUTOS
	private ConexionBD db;
//METODOS	
	public ModeloElementos() {
		db = ConexionBD.getInstancia();
	}
	public String listar() {
		ArrayList<Elemento> elementos = db.getElemento();
		String ListaElementos = "";
		for (int i = 0; i < elementos.size(); i++) {
			ListaElementos = ListaElementos + elementos.get(i).getId() + ", " + elementos.get(i).getNombre() + ", " + elementos.get(i).getCostoMantenimiento() + "\n";
		}
		return ListaElementos;
	}
	public boolean anadir(String nombre, int costoMantenimiento) {
		Elemento objElemento = new Elemento();
		boolean bandera1=false;
		try {
			ArrayList<Elemento>objTemp = db.getElemento();
			int idTemp = 0;
			for (int i = 0; i < objTemp.size(); i++) {
				objElemento = objTemp.get(i);
				if(objElemento.getId()>= idTemp){
					idTemp = objElemento.getId();			
				}
			}		
			objElemento.setId(idTemp+1);
			objElemento.setNombre(nombre);
			objElemento.setCostoMantenimiento(costoMantenimiento);
			db.insertar(objElemento);
			bandera1=true;
		} catch (Exception e) {
			System.out.println("No se pudo insertar el elemento");
		}
		return bandera1;
	}
	public void eliminar(int id) {
		try {
			db.eliminarElemento(id);
		} catch (Exception e) {
			System.out.println("Pailas, no elimino");
		}	
	}
}
