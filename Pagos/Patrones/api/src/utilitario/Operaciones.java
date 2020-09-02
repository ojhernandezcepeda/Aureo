package utilitario;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import org.neodatis.odb.*;

public class Operaciones {
	
	public void insertar(Object ob) {
		ODB odb = ODBFactory.open("AUREO.DB");
			odb.store(ob);
			odb.close();
			JOptionPane.showMessageDialog(null, "insersion realizada");
	}
	
	public ArrayList<Ingrediente> getIngrediente() {
		ODB odb = ODBFactory.open("AUREO.DB");
		Objects<Ingrediente> objects = odb.getObjects(Ingrediente.class);
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		while(objects.hasNext()) {
			Ingrediente objIng = objects.next();
			ingredientes.add(objIng);
		}
		odb.close();
		return ingredientes;
	}
}
