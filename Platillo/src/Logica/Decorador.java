package Logica;

import presentacion.Componente;

public class Decorador extends Componente{
	//ATRIBUTOS
	private Componente componente;
	//CONSTRUCTOR
	public Decorador(Componente componente) {
		super();
		this.componente = componente;
	}
}
