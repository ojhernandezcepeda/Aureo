package utilitario;

public class Entrega {
	private int id;
	private int idFacturaAsociada;
	private int tiempoEntrega;
	private String Opinion;
	
	public Entrega() {
		tiempoEntrega =0;
		Opinion = "";	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdFacturaAsociada() {
		return idFacturaAsociada;
	}
	public void setIdFacturaAsociada(int idFacturaAsociada) {
		this.idFacturaAsociada = idFacturaAsociada;
	}
	public int getTiempoEntrega() {
		return tiempoEntrega;
	}
	public void setTiempoEntrega(int tiempoEntrega) {
		this.tiempoEntrega = tiempoEntrega;
	}
	public String getOpinion() {
		return Opinion;
	}
	public void setOpinion(String opinion) {
		Opinion = opinion;
	}
	
	
}
