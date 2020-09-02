package Logica;

import presentacion.FabricaDomicilio;

public class DomicilioConcreto extends FabricaDomicilio{
//ATRIBUTOS
	private Object estadoDeSujeto;
//METODOS
	public void setEstado(Object estadoDeSujeto) {
		this.estadoDeSujeto=estadoDeSujeto;
	}
	public Object getEstado() {
		return this.estadoDeSujeto;
	}
}
