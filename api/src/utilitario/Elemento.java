package utilitario;

public class Elemento {
//ATRIBUTOS
	private int id;
	private String nombre;
	private int costoMantenimiento;
//METODOS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCostoMantenimiento() {
		return costoMantenimiento;
	}
	public void setCostoMantenimiento(int costoMantenimiento) {
		this.costoMantenimiento=costoMantenimiento;
	}
	
}
