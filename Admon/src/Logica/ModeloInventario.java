package Logica;

import java.util.ArrayList;

import utilitario.ConexionBD;
import utilitario.EsqueletoPlatillo;
import utilitario.Ingrediente;

public class ModeloInventario {
//ATRIBUTOS
	private ConexionBD db;
//METODOS	
	public ModeloInventario() {
		db = ConexionBD.getInstancia();
	}
	public String listar() {
		ArrayList<Ingrediente> ingredientes = db.getIngrediente();
		String ListaIngregientes = "";
		for (int i = 0; i < ingredientes.size(); i++) {
			ListaIngregientes = ListaIngregientes + ingredientes.get(i).getId() + ", " + ingredientes.get(i).getNombre() + ", " + ingredientes.get(i).getPrecio() + "\n";
		}
		return ListaIngregientes;
	}
	public boolean anadir(String nombre, String dirImagen, int precio) {
		Ingrediente objIngrediente = new Ingrediente();
		boolean bandera1=false;
		boolean bandera2=false;
		try {
			ArrayList<Ingrediente>objTemp = db.getIngrediente();
			int idTemp = 0;
			for (int i = 0; i < objTemp.size(); i++) {
				objIngrediente = objTemp.get(i);
				if(nombre.equals(objIngrediente.getNombre())) {
					bandera2=true;
				}
				if(objIngrediente.getId()>= idTemp){
					idTemp = objIngrediente.getId();			
				}
			}		
			if (bandera2==false) {
				objIngrediente.setId(idTemp+1);	
				objIngrediente.setNombre(nombre);
				objIngrediente.setPrecio(precio);	
				objIngrediente.setDirImagen(dirImagen);
				db.insertar(objIngrediente);
				bandera1=true;
			}
		} catch (Exception e) {}
		return bandera2;
	}
	public void eliminar(int id) {
		try {
			db.eliminarIngrediente(id);
		} catch (Exception e) {
			System.out.println("Pailas, no elimino");
		}	
	}
}
