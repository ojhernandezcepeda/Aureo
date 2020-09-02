package utilitario;
import java.util.ArrayList;

import javax.swing.JOptionPane;
//ATRIBUTOS
public class EsqueletoPlatillo {
	private int id;
	private int precio;
	private ArrayList<Integer> ingredientes;
	private int limite;
//METODOS
	/*Constructo que recibe el tamano y el ID*/
	public EsqueletoPlatillo(int tamano, int ID) {
		this.limite = tamano;		
		this.id = ID;
		ingredientes = new ArrayList<Integer>();
	}
	
	/*Retorna una lista de enteros con los IDs de
	 * los respectivos ingredientes contenidos en la clase*/
	public ArrayList<Integer> getIngredientes(){
		return this.ingredientes;
	}
	
	/*Recorre la lista de ingredientes contenidos en la clase
	 * y recorre la lista de ingredientes existentes en la BD para calcular
	 * la sumatoria de precios de los ingredientes contenidos en la
	 * clase*/
	public void calcularPrecio() {
		ConexionBD db = ConexionBD.getInstancia();		
		ArrayList<Ingrediente> ingredientes = db.getIngrediente();
		this.precio = 0;
		for(int i = 0; i< this.ingredientes.size(); i++) {	
			for (int j = 0; j < ingredientes.size(); j++) {
				if(this.ingredientes.get(i) == ingredientes.get(j).getId()) {
					this.precio = ingredientes.get(j).getPrecio() + this.precio;
				}
			}					
		}		
	}
	
	/*Anade el entero del ingrediente en la lista de ingredientes
	 * contenidos en la clase*/
	public void anadirIng(int objeto) {		
		ingredientes.add(objeto);		
		System.out.println("Cantidad de ingredientes actual: "+this.ingredientes.size());
	}
	
	/*Remueve un elemento de la lista de ingredientes contenidos en 
	 * la clase*/
	public boolean removerIng(int id) {
		boolean bandera1 = false;
		for(int i = 0; i<ingredientes.size();i++) {
			int ingrediente = ingredientes.get(i);
			if(ingrediente == id && bandera1 == false) {
				ingredientes.remove(i);
				bandera1 = true;
				System.out.println("Ingrediente Eliminado: "+ingrediente);
			}
		}
		System.out.println("Cantidad de ingredientes actual"+this.ingredientes.size());
		return bandera1;
	}

	/*Retorna el ID del esqueleto platillo*/
	public int getId() {
		return id;
	}
	
	/*Retorna el Limite de ingredientes
	 * del esqueleto platillo*/
	public int getLimite() {
		return this.limite;
	}
	
	public int getPrecio() {
		return this.precio;
	}
}
