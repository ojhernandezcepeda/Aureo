package cableado;

public interface IDespacho {
	boolean despacharPedido(int idFactura);
	String verificarEntrega();
}
