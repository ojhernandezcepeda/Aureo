package presentacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Logica.InformadorEntregas;
import Logica.Observador;
import cableado.IDespacho;
import utilitario.EntradaSalida;

public class FabricaDomicilio implements IDespacho {
//ATRIBUTOS
	ArrayList<Observador> observadores;
	private InformadorEntregas objInformador = null;
	private EntradaSalida io = null;
	public FabricaDomicilio() {
		objInformador = new InformadorEntregas();
		io = new EntradaSalida();
	}
	
//METODOS
	@Override
	public boolean despacharPedido(int idFactura) {		
		String[] opciones = {"Excelente","Regular","Malo"};
		objInformador.registrarEntrega(idFactura, io.seleccionar(opciones, "¿Que opina del servicio?"), io.entradaInt("Digite el tiempo de entrega (min)"));
		return true;
	}

	@Override
	public String verificarEntrega() {
		return objInformador.consultarEntregas();		
	}
	
	public void atar(Observador obs) {
		
	}
	public void desatar(Observador obs) {
		
	}
	public void notificar() {
		
	}

}
