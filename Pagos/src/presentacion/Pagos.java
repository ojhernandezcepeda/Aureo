package presentacion;

import Logica.AbstraccionRefinada;
import Logica.Efectivo;
import cableado.IRecaudo;
import utilitario.EntradaSalida;

public class Pagos implements IRecaudo {

	@Override
	public int captarPago(int idFactura, int valor, int cliente, String direccion) {
		int cambio = 0;
		EntradaSalida io = new EntradaSalida();
		String[] opciones= {"Efectivo","PayPal","TarjetaCredito"};		
		try {
			if(io.seleccionar(opciones,"Seleccionar forma de pago").equals("Efectivo")) {
				PagosAbs abs = new AbstraccionRefinada();			
				abs.setImp(new Efectivo());				
				cambio = abs.captarPago(idFactura, valor, cliente, direccion);	
			}			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		return cambio;
	}

}
