package utilitario;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.neodatis.odb.*;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class ConexionBD {
	// Atributos
	private static ConexionBD instancia;

	// Metodos

	/* Constructor privado Singleton */
	private ConexionBD() {
	}

	/* Metodo de ejemplificacion publico */
	public static ConexionBD getInstancia() {
		if (instancia == null) {
			instancia = new ConexionBD();
		}
		return instancia;
	}

	/*
	 * Inserta un objeto en la BD, esta es capaz de verificar el tipo de objeto a
	 * almacenar
	 */
	public void insertar(Object ob) {
		ODB odb = ODBFactory.open("AUREO.DB");
		odb.store(ob);
		odb.close();
		JOptionPane.showMessageDialog(null, "insersion realizada");
	}

	/* Retona una lista de objetos tipo Ingrediente contenidos en la BD */
	public ArrayList<Ingrediente> getIngrediente() {
		ODB odb = ODBFactory.open("AUREO.DB");
		Objects<Ingrediente> objects = odb.getObjects(Ingrediente.class);
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		while (objects.hasNext()) {
			Ingrediente objIng = objects.next();
			ingredientes.add(objIng);
		}
		odb.close();
		return ingredientes;
	}

	/* Retona una lista de objetos tipo EsqueletoPlatillo contenidos en la BD */
	public ArrayList<EsqueletoPlatillo> getPlatillo() {
		ODB odb = ODBFactory.open("AUREO.DB");
		Objects<EsqueletoPlatillo> objects = odb.getObjects(EsqueletoPlatillo.class);
		ArrayList<EsqueletoPlatillo> platillos = new ArrayList<EsqueletoPlatillo>();
		while (objects.hasNext()) {
			EsqueletoPlatillo objPla = objects.next();
			platillos.add(objPla);
		}
		odb.close();
		return platillos;
	}

	/* Retona una lista de objetos tipo Factura contenidos en la BD */
	public ArrayList<Factura> getFactura() {
		ODB odb = ODBFactory.open("AUREO.DB");
		Objects<Factura> objects = odb.getObjects(Factura.class);
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		while (objects.hasNext()) {
			Factura objFac = objects.next();
			facturas.add(objFac);
		}
		odb.close();
		return facturas;
	}

	/* Retorna un String con los ingredientes listados */
	public String listarIngredientes() {
		ArrayList<Ingrediente> ingredientes = this.getIngrediente();
		String ListaIngregientes = "";
		for (int i = 0; i < ingredientes.size(); i++) {
			ListaIngregientes = ListaIngregientes + ingredientes.get(i).getId() + ", " + ingredientes.get(i).getNombre()
					+ ", " + ingredientes.get(i).getPrecio() + "\n";
		}
		return ListaIngregientes;
	}

	/* Retorna un String con el nombre del ingrediente solicitado */
	public String nombreIngrediente(int id) {
		ArrayList<Ingrediente> ingredientes = this.getIngrediente();
		String nombre = "";
		for (int i = 0; i < ingredientes.size(); i++) {
			if (id == ingredientes.get(i).getId()) {
				nombre = ingredientes.get(i).getNombre();
			}

		}
		return nombre;
	}

	/* Retorna un String con el detalle del ingrediente solicitado */
	public String getDetalleIngrediente(int id) {
		ArrayList<Ingrediente> ingredientes = this.getIngrediente();
		String detalle = "";
		for (int i = 0; i < ingredientes.size(); i++) {
			if (id == ingredientes.get(i).getId()) {
				detalle = ingredientes.get(i).getId() + ", " + ingredientes.get(i).getNombre() + ", "
						+ ingredientes.get(i).getPrecio();
				System.out.println("getDetalleIngrediente " + detalle);
			}

		}
		return detalle;
	}

	/* Retorna el ID del ingrediente solicitado */
	public int idIngrediente(String nombre) {
		ArrayList<Ingrediente> ingredientes = this.getIngrediente();
		int id = 0;
		for (int i = 0; i < ingredientes.size(); i++) {
			String nombreBD = ingredientes.get(i).getNombre();
			if (nombre.equals(nombreBD)) {
				id = ingredientes.get(i).getId();
				System.out.println(id + " -> " + nombre);
			}
		}
		return id;
	}

	/* Elimina un ingrediente */
	public void eliminarIngrediente(int id) {
		try {
			boolean bandera = false;
			ArrayList<Ingrediente> ingredientes = this.getIngrediente();
			for (int i = 0; i < ingredientes.size(); i++) {
				if (ingredientes.get(i).getId() == id) {
					ODB database = ODBFactory.open("AUREO.DB");
					IQuery query = new CriteriaQuery(Ingrediente.class, Where.equal("id", id));
					Ingrediente ingrediente = (Ingrediente) database.getObjects(query).getFirst();
					System.out.println(ingrediente.getId() + ingrediente.getNombre() + ingrediente.getPrecio());
					database.delete(ingrediente);
					JOptionPane.showMessageDialog(null, "Ingrediente eliminado");
					database.close();
					bandera = true;
					break;
				}
			}
			if (!bandera)
				JOptionPane.showMessageDialog(null, "Ingrediente no encontrado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* Retorna un String con detalles del Platillo */
	public String detallePlatillo(int id) {
		String ListaIngregientes = "";
		String detalle = "";
		EsqueletoPlatillo platillo = null;
		try {
			boolean bandera = false;
			ArrayList<EsqueletoPlatillo> platillos = this.getPlatillo();
			ODB database = ODBFactory.open("AUREO.DB");
			IQuery query = new CriteriaQuery(EsqueletoPlatillo.class, Where.equal("id", id));
			platillo = (EsqueletoPlatillo) database.getObjects(query).getFirst();
			database.close();
			if (!platillo.equals(null))
				for (int i = 0; i < platillo.getIngredientes().size(); i++) {
					detalle = detalle + "\n" + this.getDetalleIngrediente(platillo.getIngredientes().get(i));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return detalle;
	}

	public int getPrecioPlatillo(int id) {
		int precio = 0;
		try {
			ODB database = ODBFactory.open("AUREO.DB");
			IQuery query = new CriteriaQuery(EsqueletoPlatillo.class, Where.equal("id", id));
			EsqueletoPlatillo platillo = (EsqueletoPlatillo) database.getObjects(query).getFirst();
			database.close();
			precio = platillo.getPrecio();
		} catch (Exception e) {
			System.out.println("Precio del platillo no encontrado");
		}
		return precio;
	}

	/* Retona una lista de objetos tipo Elemento contenidos en la BD */
	public ArrayList<Elemento> getElemento() {
		ODB odb = ODBFactory.open("AUREO.DB");
		Objects<Elemento> objects = odb.getObjects(Elemento.class);
		ArrayList<Elemento> elementos = new ArrayList<Elemento>();
		while (objects.hasNext()) {
			Elemento objIng = objects.next();
			elementos.add(objIng);
		}
		odb.close();
		return elementos;
	}

	/* Retona una lista de objetos tipo Empleado contenidos en la BD */
	public ArrayList<Empleado> getEmpleado() {
		ODB odb = ODBFactory.open("AUREO.DB");
		Objects<Empleado> objects = odb.getObjects(Empleado.class);
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		while (objects.hasNext()) {
			Empleado objIng = objects.next();
			empleados.add(objIng);
		}
		odb.close();
		return empleados;
	}

	/* Elimina un objeto elemento segun su id */
	public void eliminarElemento(int id) {
		try {
			boolean bandera = false;
			ArrayList<Elemento> elementos = this.getElemento();
			for (int i = 0; i < elementos.size(); i++) {
				if (elementos.get(i).getId() == id) {
					ODB database = ODBFactory.open("AUREO.DB");
					IQuery query = new CriteriaQuery(Elemento.class, Where.equal("id", id));
					Elemento elemento = (Elemento) database.getObjects(query).getFirst();
					System.out.println(elemento.getId() + elemento.getNombre() + elemento.getCostoMantenimiento());
					database.delete(elemento);
					JOptionPane.showMessageDialog(null, "Elemento eliminado");
					database.close();
					bandera = true;
					break;
				}
			}
			if (!bandera)
				JOptionPane.showMessageDialog(null, "Elemento no encontrado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* Elimina un objeto empleado segun su id */
	public void eliminarEmpleado(int id) {
		try {
			boolean bandera = false;
			ArrayList<Empleado> empleados = this.getEmpleado();
			for (int i = 0; i < empleados.size(); i++) {
				if (empleados.get(i).getId() == id) {
					ODB database = ODBFactory.open("AUREO.DB");
					IQuery query = new CriteriaQuery(Empleado.class, Where.equal("id", id));
					Empleado empleado = (Empleado) database.getObjects(query).getFirst();
					System.out.println(
							empleado.getId() + empleado.getNombre() + empleado.getRol() + empleado.getGananciaNeta());
					database.delete(empleado);
					JOptionPane.showMessageDialog(null, "Empleado eliminado");
					database.close();
					bandera = true;
					break;
				}
			}
			if (!bandera)
				JOptionPane.showMessageDialog(null, "Empleado no encontrado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* Retorna un EsqueletoPlatillo */
	public EsqueletoPlatillo getEsqueletoPlatillo(int id) {
		EsqueletoPlatillo esqueleto = null;
		try {
			ODB database = ODBFactory.open("AUREO.DB");
			IQuery query = new CriteriaQuery(EsqueletoPlatillo.class, Where.equal("id", id));
			EsqueletoPlatillo platillo = (EsqueletoPlatillo) database.getObjects(query).getFirst();
			database.close();
			esqueleto = platillo;
		} catch (Exception e) {
			System.out.println("Platillo no encontrado");
		}
		return esqueleto;
	}

	/* Retorna una Factura */
	public Factura getFacturaXid(int id) {
		Factura objFactura = null;
		try {
			ODB database = ODBFactory.open("AUREO.DB");
			IQuery query = new CriteriaQuery(Factura.class, Where.equal("idFactura", id));
			Factura objFactura2 = (Factura) database.getObjects(query).getFirst();
			database.close();
			if (objFactura2.getIdFactura() == id) {
				objFactura = objFactura2;
			}
		} catch (Exception e) {
			System.out.println("Factura no encontrada");
		}
		return objFactura;
	}

	/**/
	public ArrayList<Entrega> getEntregas() {
		ODB odb = ODBFactory.open("AUREO.DB");
		Objects<Entrega> objects = odb.getObjects(Entrega.class);
		ArrayList<Entrega> entregas = new ArrayList<Entrega>();
		while (objects.hasNext()) {
			Entrega objFac = objects.next();
			entregas.add(objFac);
		}
		odb.close();
		return entregas;
	}

	/* Detalle de una factura en especifico */
	public String getDetalleFactura(int id) {
		Factura factura = this.getFacturaXid(id);
		String retorno = "";
		retorno = retorno + "Factura Cod " + factura.getIdFactura() + ".\n	Cliente: " + factura.getIdCliente()
				+ "\n	Dir: " + factura.getDireccionEntrega() + "\n ";
		for (int j = 0; j < factura.getIdPlatillos().size(); j++) {
			retorno = retorno + "	Platillo nº" + factura.getIdPlatillos().get(j) + "\n	- Costo: "
					+ this.getPrecioPlatillo(factura.getIdPlatillos().get(j)) + "\n";
		}
		return retorno;
	}
	
	/* Cliente de una factura en especifico */
	public String getClienteFactura(int id) {
		Factura factura = this.getFacturaXid(id);
		String retorno = "";
		retorno = Integer.toString (factura.getIdCliente());				
		return retorno;
	}
	
	/* Direccion de una factura en especifico */
	public String getDirFactura(int id) {
		Factura factura = this.getFacturaXid(id);		
		return factura.getDireccionEntrega();		
	}

}