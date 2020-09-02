package presentacion;

import javax.swing.JOptionPane;

import Logica.Implementador;
import cableado.IRecaudo;

public abstract class PagosAbs {
	private Implementador imp;
	
	public int captarPago(int idFactura, int valor, int cliente, String direccion) {
		return imp.captarPago(idFactura, valor,cliente, direccion);
	}
	
	public void setImp(Implementador imp){
		this.imp=imp;
	}
}
