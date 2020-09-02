package cableado;

public interface ILienzo {
	Object construirPlatillo(int tamano);
	boolean guardarElDestinoDlPlatillo();
	boolean anadirIngrediente(int id);
	boolean eliminarIngrediente(int id);
}
