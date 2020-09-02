package Logica;

import java.util.ArrayList;

import utilitario.ConexionBD;
import utilitario.EntradaSalida;
import utilitario.Factura;

public class Efectivo extends Implementador {
	@Override
	public int captarPago(int idPlatillo, int valor, int cliente, String direccion) {
		int cambio = -1;
		objFac = new Factura();
		EntradaSalida io = new EntradaSalida();
		System.out.println("Efectivo.captarPago");
		int ganancia = 0;
		try {
			db = ConexionBD.getInstancia();
			int verdadero = db.getPrecioPlatillo(idPlatillo);
			if (verdadero <= valor) {
				cambio = valor - verdadero;
				objPlatillo = db.getEsqueletoPlatillo(idPlatillo);
				int idCandidato = obtenerID();
				objFac.setIdFactura(idCandidato);
				objFac.setIdCliente(cliente);
				objFac.setDireccionEntrega(direccion);
				objFac.setIdPlatillo(idPlatillo);
				io.salida("Pago realizado, Factura: # "+objFac.getIdFactura());
				db.insertar(objFac);

			} else {
				io.salida("Pago no realizado, recursos insuficientes");
			}
		} catch (Exception e) {
		}
		return cambio;
	}

	/*
	 * Usa la BD para calcular el nuevo ID de la factura
	 */
	private int obtenerID() {
		ArrayList<Factura> objTemp = db.getFactura();
		int idTemp = 0;
		for (int i = 0; i < objTemp.size(); i++) {
			Factura objFactura = objTemp.get(i);
			if (objFactura.getIdFactura() >= idTemp) {
				idTemp = objFactura.getIdFactura();
			}
		}
		return idTemp + 1;
	}

}