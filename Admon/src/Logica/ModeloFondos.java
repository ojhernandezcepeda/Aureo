package Logica;

import java.util.ArrayList;

import utilitario.ConexionBD;
import utilitario.Elemento;
import utilitario.Empleado;
import utilitario.Ingrediente;

public class ModeloFondos {
	
//ATRIBUTOS
	private ConexionBD db;
//METODOS	
	public ModeloFondos() {
		db = ConexionBD.getInstancia();
	}
	
	public String listarEmpleados() {
		ArrayList<Empleado> empleados = db.getEmpleado();
		String ListaEmpleados = "";
		for (int i = 0; i < empleados.size(); i++) {
			ListaEmpleados = ListaEmpleados + empleados.get(i).getId() + ", " + 
			empleados.get(i).getNombre() + ", " + empleados.get(i).getRol() + "\n";
		}
		return ListaEmpleados;
	}
	public String generarNomina() {
		ArrayList<Empleado> empleados = db.getEmpleado();
		String Nomina = "";
		int gananciaTotal=0;
		for (int i = 0; i < empleados.size(); i++) {
			Nomina = Nomina + empleados.get(i).getId() + ", " + 
			empleados.get(i).getNombre() + ", " + empleados.get(i).getRol() + ", " + 
			empleados.get(i).getGananciaNeta() + "\n";
			gananciaTotal = gananciaTotal + empleados.get(i).getGananciaNeta();
		}
		Nomina = Nomina + "-------------------------------\n"
				+ "Los gastos totales en salario son de: \n$" + gananciaTotal;
				
		return Nomina;
	}
	public void contratarEmpleado(String nombre, String rol,int gananciaNeta) {
		Empleado objEmpleado = new Empleado();
		boolean bandera1=false;
		boolean bandera2=false;
		try {
			ArrayList<Empleado>objTemp = db.getEmpleado();
			int idTemp = 0;
			for (int i = 0; i < objTemp.size(); i++) {
				objEmpleado = objTemp.get(i);
				if(nombre.equals(objEmpleado.getNombre())) {
					bandera2=true;
				}
				if(objEmpleado.getId()>= idTemp){
					idTemp = objEmpleado.getId();			
				}
			}		
			if (bandera2==false) {
				objEmpleado.setId(idTemp+1);	
				objEmpleado.setNombre(nombre);
				objEmpleado.setRol(rol);
				objEmpleado.setGananciaNeta(gananciaNeta);
				db.insertar(objEmpleado);
				bandera1=true;
			}
		} catch (Exception e) {}
	}
	public void despedirEmpleado(int id) {
		try {
			db.eliminarEmpleado(id);
		} catch (Exception e) {}	
	}
	
}
