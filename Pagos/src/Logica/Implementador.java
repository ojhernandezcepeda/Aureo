package Logica;

import utilitario.ConexionBD;
import utilitario.EsqueletoPlatillo;
import utilitario.Factura;

public abstract class Implementador{
//METODOS
	protected ConexionBD db;	
	protected Factura objFac;
	protected EsqueletoPlatillo objPlatillo;
	public abstract int captarPago(int idPlatillo, int valor, int cliente, String direccion);
}
