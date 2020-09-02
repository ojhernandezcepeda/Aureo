package Logica;

import java.util.ArrayList;

import utilitario.ConexionBD;
import utilitario.Entrega;
import utilitario.Factura;

public class InformadorEntregas {
//ATRIBUTOS
	private Entrega entrega;
	private ConexionBD db = ConexionBD.getInstancia();;
//METODOS
	/*Crea una clase entrega*/	
	
	public void registrarEntrega(int factura, String opinion, int tiempoEntrega) {		
		entrega = new Entrega();
		boolean bandera=true;
		ArrayList<Entrega> entregas = db.getEntregas();
		if (db.getFacturaXid(factura)==null)
			bandera=false;
		if(bandera) {
			for (int i = 0; i < entregas.size(); i++) {
				if (factura==entregas.get(i).getIdFacturaAsociada()) {
					bandera=false;
				}
			}
		}
		
		if(bandera) {
			ArrayList<Entrega> objTemp = db.getEntregas();
			int idTemp = 0;
			for (int i = 0; i < objTemp.size(); i++) {
				Entrega objEntrega = objTemp.get(i);
				if (objEntrega.getId() >= idTemp) {
					idTemp = objEntrega.getId();
				}
			}
			entrega.setId(idTemp + 1);
			entrega.setIdFacturaAsociada(factura);
			entrega.setOpinion(opinion);
			entrega.setTiempoEntrega(tiempoEntrega);
			db.insertar(entrega);
		}					
	}
	/*Genera una lista de las entregas*/
	public String consultarEntregas() {
		String listado="";
		ArrayList<Entrega> entregas = db.getEntregas();
		for (int i = 0; i < entregas.size(); i++) {
			listado = listado + "\nId: " + entregas.get(i).getId() +
					  "\n	factura: " + entregas.get(i).getIdFacturaAsociada() +
					  "\n	cliente: " + db.getFacturaXid(entregas.get(i).getIdFacturaAsociada()).getIdCliente() +
					  "\n	tiempo entrega: " + entrega.getTiempoEntrega()+
					  "\n	opinion: " + entrega.getOpinion();
		}
		return listado;
	}
}