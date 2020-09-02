package vista;

import javax.swing.JOptionPane;

import cableado.ILienzo;
import cableado.IRecaudo;
import utilitario.*;



public class Aureo {
	public static void main(String args[]) {
		Cargador cf = new Cargador("front");
		Class cls=null;
		try {
			cls=  cf.getClase("Platillo");
			if(cls!=null) {
				ILienzo il = (ILienzo)cls.newInstance();
				il.construirPlatillo();
				//il.guardarElDestinoDlPlatillo();
				/*Ingrediente objIngrediente = new Ingrediente();
				objIngrediente.setIdIngrediente("2");
				objIngrediente.setNombreIngrediente("Pechuga de Pollo");
				objIngrediente.setValorIngrediente(6000);
				Operaciones op = new Operaciones();
				op.insertar(objIngrediente);*/
			}
			
		}catch(Exception e) {}	
		
		Cargador cb = new Cargador("back");
		try {
			cls=  cb.getClase("Pagos");
			if(cls!=null) {
				IRecaudo ir = (IRecaudo)cls.newInstance();
				//ir.captarPago("1", 158.000);
			}
			
		}catch(Exception e) {}		
	}
	
} 