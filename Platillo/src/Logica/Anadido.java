package Logica;

import presentacion.Componente;

public class Anadido extends Decorador{
	//CONSTRUCTOR
	public Anadido(Componente componente) {
		super(componente);
	}

	//METODOS
	public boolean agregarAnadido(int id) {
		//Verificar ingrediente;
		//if ingrediente verificado{
		super.anadirIngrediente(id);
		return true;
		//else return false;
	}
}
