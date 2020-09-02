package presentacion;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import cableado.ILienzo;
import utilitario.Operaciones;
import utilitario.Ingrediente;

public class Platillo implements ILienzo{

	@Override
	public Object construirPlatillo() {
		Operaciones op = new Operaciones();
		ArrayList<Ingrediente> objIng= op.getIngrediente();		
		JOptionPane.showMessageDialog(null, objIng.get(0).getNombreIngrediente()+" y " +objIng.get(1).getNombreIngrediente());
		return null;
	}

	@Override
	public boolean guardarElDestinoDlPlatillo() {
		JOptionPane.showMessageDialog(null, "Platillo guardado");
		return false;
		
	}

	@Override
	public boolean anadirIngrediente(String id) {
		return false;
	}

	@Override
	public boolean eliminarIngrediente(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	


}
