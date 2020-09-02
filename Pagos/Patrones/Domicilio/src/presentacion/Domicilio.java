package presentacion;

import javax.swing.JOptionPane;
import cableado.IDespacho;

public class Domicilio implements IDespacho {

	@Override
	public boolean despacharPedido(String idFactura) {
		JOptionPane.showMessageDialog(null, "despacharPedido");
		return false;

	}

	@Override
	public boolean verificarEntrega(String idFactura) {
		JOptionPane.showMessageDialog(null, "verificarEntrega");
		return false;
	}

}
