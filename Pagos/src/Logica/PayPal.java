package Logica;

import utilitario.EntradaSalida;

public class PayPal extends Implementador{
//METODOS

	@Override
	public int captarPago(int idPlatillo, int valor, int cliente, String direccion) {
		EntradaSalida io = new EntradaSalida();
		io.salida("Logica no implementada");
		return 0;
	}
}
