package utilitario;

public class Ingrediente {
//ATRIBUTOS
	private int id;
	private int precio;
	private String nombre;
	private String dirImagen;

	//METODOS
	public int getPrecio() {
		return this.precio;
	}
	public int getId(){
		return this.id;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirImagen() {
		return dirImagen;
	}
	public void setDirImagen(String dirImagen) {
		this.dirImagen = dirImagen;
	}
}
