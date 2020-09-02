package presentacion;
import cableado.ILienzo;

public abstract class Componente implements ILienzo{

	@Override
	public Object construirPlatillo(int tamano) {
		return null;
	}

	@Override
	public boolean guardarElDestinoDlPlatillo() {		
		return false;
	}

	@Override
	public boolean anadirIngrediente(int id) {
		return false;
	}

	@Override
	public boolean eliminarIngrediente(int id) {
		return false;
	}
}