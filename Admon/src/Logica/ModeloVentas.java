package Logica;

import java.util.ArrayList;

import utilitario.ConexionBD;
import utilitario.EsqueletoPlatillo;
import utilitario.Factura;
import utilitario.Ingrediente;

public class ModeloVentas {
//ATRIBUTOS
	private ConexionBD db;
//METODOS	
	public ModeloVentas() {
		db = ConexionBD.getInstancia();
	}
	public String listarVentas() {
		ArrayList<Factura> facturas = db.getFactura();
		String ListaFacturas = "";
		for (int i = 0; i < facturas.size(); i++) {
			ListaFacturas = ListaFacturas + "Factura Cod " + facturas.get(i).getIdFactura() + ".\n	Cliente: " + facturas.get(i).getIdCliente() + "\n	Dir: " + 
			facturas.get(i).getDireccionEntrega() + "\n "; 
			for (int j = 0; j < facturas.get(i).getIdPlatillos().size(); j++) {
				ListaFacturas = ListaFacturas + "	Platillo nº" + facturas.get(i).getIdPlatillos().get(j) +
								" - Costo: " + db.getPrecioPlatillo(facturas.get(i).getIdPlatillos().get(j)) + "\n";
			}
		}
		return ListaFacturas;
	}
	public String revisarGanancias() {
		ArrayList<Factura> facturas = db.getFactura();
		int Ganancia = 0;
		for (int i = 0; i < facturas.size(); i++) {
			for (int j = 0; j < facturas.get(i).getIdPlatillos().size(); j++) {
				Ganancia = Ganancia + db.getPrecioPlatillo(facturas.get(i).getIdPlatillos().get(j));
			}
		}
		return ("La ganancia total fue de: $" + Ganancia);
	}
}