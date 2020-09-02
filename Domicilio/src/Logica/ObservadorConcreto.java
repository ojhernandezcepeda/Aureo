package Logica;

public class ObservadorConcreto extends Observador{
//ATRIBUTOS
	private DomicilioConcreto sujeto;
	private Object estadoDeObservador;
	private String Opinion;
	private int tiempoEntrega;
//METODOS
	@Override
	public void actualizar() {
		
	}
	public int tomarTiempo() {
		return 0;
	}
	public void recibirOpinion() {
		
	}
}
