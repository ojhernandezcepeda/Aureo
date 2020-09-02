package vista;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import cableado.IDespacho;
import cableado.IGestor;
import cableado.ILienzo;
import cableado.IRecaudo;
import utilitario.Cargador;
//import utilitario.ConexionBD;
import utilitario.EntradaSalida;

public class Aureo {
	//private static ConexionBD db = ConexionBD.getInstancia();	
	private static EntradaSalida io = new EntradaSalida();
	private static Cargador cb = new Cargador("back");
	private static Cargador cf = new Cargador("front");
	private static Class claseAdmon = null;
	private static Class clasePlatillo = null;
	private static Class clasePagos = null;
	private static Class claseDomicilio = null;	
	private static IGestor ig = null;
	private static IRecaudo ir = null;
	private static IDespacho id = null;
	private static ILienzo il = null;
	private static VistaAdmin viewAdmin = null;	
	private static VistaInicio view1 = null;
	
	public static void main(String args[]) {	
		JButton boton = new JButton();
		view1 = new VistaInicio();		
		boton = view1.getJbPlatillo();		
		boton.addActionListener((ActionEvent evt) -> {
			jbPlatilloActionPerformed(evt);
		});		
		view1.setJbPlatillo(boton);
		
		boton = view1.getJbGestion();
		boton.addActionListener((ActionEvent evt) -> {
			jbGestionActionPerformed(evt);
		});		
		
		view1.setVisible(true);		
	}
	
	private static void jbGestionActionPerformed(ActionEvent evt) {
		viewAdmin = new VistaAdmin();
		ig = ejemplificarAdmon(ig);
		if(ig != null) {
			ControladorAdmin ctrl = new ControladorAdmin(viewAdmin, ig);		
			view1.setVisible(false);
			view1 = null;
			ctrl.iniciar();
			viewAdmin.setVisible(true);
		}else {
			io.salida("Componente Gestor no encontrado");
		}
		
	}

	private static void jbPlatilloActionPerformed(ActionEvent evt) {
		id = ejemplificarDomicilio(id);
		il = ejemplificarPlatillo(il);
		ir = ejemplificarPagos(ir);
		if (il != null) {
			String opciones[] = {"9 ingredientes"};
			String seleccion = io.seleccionar(opciones, "Tamanos disponibles para el Platillo");
			switch (seleccion) {
			case "9 ingredientes":
				VistaPlatillo9 objVista = new VistaPlatillo9();
			    ControladorPlatillo objControlador = new ControladorPlatillo(objVista, il, ir, id);
			    objControlador.iniciar();
			    view1.setVisible(false);
				view1 = null;
			    objVista.setVisible(true);
				break;
			default:
				break;
			}			    
		} else {
			io.salida("No se encontró el componente de Platillo");
		}
	}

	public static IGestor ejemplificarAdmon(IGestor ig) {
		ig = null;
		try {
			claseAdmon = cb.getClase("Admon");
			if (claseAdmon != null) {
				ig = (IGestor) claseAdmon.newInstance();				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ig;
	}

	public static IRecaudo ejemplificarPagos(IRecaudo ir) {
		ir = null;
		try {
			clasePagos = cb.getClase("Pagos");
			if (clasePagos != null) {
				ir = (IRecaudo) clasePagos.newInstance();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ir;
	}
	
	public static ILienzo ejemplificarPlatillo(ILienzo il) {
		il = null;
		try {
			clasePlatillo = cf.getClase("Platillo");
			if (clasePlatillo != null) {
				il = (ILienzo) clasePlatillo.newInstance();				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return il;		
	}
	
	public static IDespacho ejemplificarDomicilio(IDespacho id) {
		id = null;
		try {
			claseDomicilio = cf.getClase("FabricaDomicilio");
			if (claseDomicilio != null) {				
				id = (IDespacho) claseDomicilio.newInstance();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return id;
	}
	
/*	public static void iniciarPlatillo() {				

		
	}*/
	
	public static void IniciarGestorElementos() {
		ig = ejemplificarAdmon(ig);
		if(ig != null) {
			ig.gestionarElemento();
		}else {
			io.salida("No se encontró el componente Gestor");
		}						
	}
	
	public static void IniciarGestorIngredientes() {		
		ig = ejemplificarAdmon(ig);
		if(ig != null) {
			ig.gestionarInventario();
		}else {
			io.salida("No se encontró el componente Gestor");
		}
	}
	
	public static void IniciarGestorFondos() {
		ig = ejemplificarAdmon(ig);
		if(ig != null) {
			ig.gestionarFondos();
		}else {
			io.salida("No se encontró el componente Gestor");
		}
	}
	
	public static void IniciarGestorVentas() {
		ig = ejemplificarAdmon(ig);
		if(ig != null) {
			ig.gestionarVentas();
		}else {
			io.salida("No se encontró el componente Gestor");
		}
	}
}