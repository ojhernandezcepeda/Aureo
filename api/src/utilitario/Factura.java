package utilitario;

import java.util.ArrayList;

public class Factura {
//ATRIBUTOS
	private ArrayList<Integer> idPlatillos;
	private int idFactura;
	private int idCliente;
	private String direccionEntrega;	
//METODOS
	public Factura() {
		idPlatillos = new ArrayList<Integer>();
	}
	public ArrayList<Integer> getIdPlatillos() {
		return idPlatillos;
	}
	public void setIdPlatillo(int idPlatillo) {		
		this.idPlatillos.add(idPlatillo);
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
}
