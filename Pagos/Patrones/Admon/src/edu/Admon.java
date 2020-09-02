package edu;

import javax.swing.JOptionPane;
import cableado.IGestor;

public class Admon implements IGestor{

	@Override
	public boolean gestioarVentas(String idFactura, String idEmpleado) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "gestioarVentas");
		return false;
	}

	@Override
	public boolean gestionarInventario(String idIngrediente, int operacion) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "gestioarInventario");
		return false;
	}

	@Override
	public boolean gestionarElemento(String idElemento, int operacion) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "gestioarElemento");
		return false;
	}

	@Override
	public boolean gestionarFondos() {
		JOptionPane.showMessageDialog(null, "Nomina Calculada");
		return false;
	}

}
