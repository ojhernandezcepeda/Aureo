package utilitario;

public class Empleado {
//ATRIBUTOS
	private int id;
	private String nombre;
	private String rol;
	private int gananciaNeta;
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
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public int getGananciaNeta() {
		return gananciaNeta;
	}
	public void setGananciaNeta(int gananciaNeta) {
		this.gananciaNeta = gananciaNeta;
	}
	
}
