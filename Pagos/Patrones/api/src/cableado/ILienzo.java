package cableado;

public interface ILienzo {
	Object construirPlatillo();
	boolean guardarElDestinoDlPlatillo();
	boolean anadirIngrediente(String id);
	boolean eliminarIngrediente(String id);
}
