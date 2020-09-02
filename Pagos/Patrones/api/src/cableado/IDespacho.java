package cableado;

public interface IDespacho {
	boolean despacharPedido(String idFactura);
	boolean verificarEntrega(String idFactura);
}
