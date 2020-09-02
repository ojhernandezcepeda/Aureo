package vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cableado.IDespacho;
import cableado.ILienzo;
import cableado.IRecaudo;
import utilitario.EntradaSalida;
import utilitario.Ingrediente;
import utilitario.ConexionBD;

public class ControladorPlatillo {
	// Atributos
	private VistaPlatillo9 view;
	private ILienzo model;
	private IRecaudo modelRecaudo;
	private IDespacho modelDespacho;
	private JButton objBoton;
	private JTextField objTextField;
	private JLabel objLbl, objLblIm;
	private JPanel objSubPanel, objPnlGeneral;
	private EntradaSalida io;
	private ConexionBD db;
	private Ingrediente [] listaIngPedidos = new Ingrediente[9];

	// Metodos
	public ControladorPlatillo(VistaPlatillo9 view, ILienzo model, IRecaudo modelRecaudo, IDespacho modelDespacho) {
		this.view = view;
		this.model = model;
		this.modelRecaudo = modelRecaudo;
		this.modelDespacho = modelDespacho;
		objBoton = new JButton();
		objTextField = new JTextField();
		objLbl = new JLabel();
		objLblIm = new JLabel();
		objSubPanel = new JPanel();
		objPnlGeneral = new JPanel();
		io = new EntradaSalida();
		db = ConexionBD.getInstancia();
		model.construirPlatillo(view.getTamano());
	}

	public void iniciar() {
		view.setTitle("Aureo - Platillo");
		// Anadir Action Listener a los Botones de la interfaz
		objBoton = view.getBtnAnadir();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnAnadirActionPerformed(evt);
		});
		view.setBtnAnadir(objBoton);

		objBoton = view.getBtnEliminar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnEliminarActionPerformed(evt);
		});
		view.setBtnEliminar(objBoton);

		objBoton = view.getBtnGuardar();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnGuardarActionPerformed(evt);
		});
		view.setBtnGuardar(objBoton);

		objBoton = view.getBtnRecomendado();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnRecomendarActionPerformed(evt);
		});
		view.setBtnRecomendado(objBoton);
		
		objBoton = view.getBtnAureo();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnAureoActionPerformed(evt);
		});
		view.setBtnRecomendado(objBoton);

		objBoton = view.getJbDomicilio();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnSeccionDomicilioActionPerformed(evt);
		});
		view.setJbDomicilio(objBoton);

		objBoton = view.getJbPagos();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnSeccionPagosActionPerformed(evt);
		});
		view.setJbPagos(objBoton);
		/*
		objBoton = view.getJbPlatillo();
		objBoton.addActionListener((ActionEvent evt) -> {
			jbtnSeccionPlatilloActionPerformed(evt);
		});
		view.setJbPlatillo(objBoton);*/


		objPnlGeneral = view.getPanelGeneral();
		objSubPanel = view.getPanelElementos();

	}

	private void jbtnAureoActionPerformed(ActionEvent evt) {
		
		VistaAureo v = new VistaAureo();
		ControladorAureo ctrl = new ControladorAureo(this.listaIngPedidos, v);
		v.setVisible(true);
		
	}

	/*
	private void jbtnSeccionPlatilloActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}*/

	private void jbtnSeccionPagosActionPerformed(ActionEvent evt) {
		VistaPagos objVista = new VistaPagos();
		if (modelRecaudo != null) {
			ControladorPagos objControlador = new ControladorPagos(objVista, modelRecaudo);
			objControlador.iniciar();
			objVista.setVisible(true);

		} else {
			JOptionPane.showMessageDialog(null, "No se encontro el componente de Pagos");
		}
	}

	private void jbtnSeccionDomicilioActionPerformed(ActionEvent evt) {
		VistaDomicilio objVista = new VistaDomicilio();
		if (modelDespacho != null) {
			ControladorDomicilio objControlador = new ControladorDomicilio(objVista, modelDespacho);
			objControlador.iniciar();
			objVista.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "No se encontro el componente de Domicilio");
		}

	}

	private void jbtnRecomendarActionPerformed(ActionEvent evt) {
		System.out.println("jbtnRecomendarActionPerformed: ");
	}

	private void jbtnGuardarActionPerformed(ActionEvent evt) {
		try {
			System.out.println("jbtnGuardarActionPerformed: " + model.guardarElDestinoDlPlatillo());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

	private void jbtnEliminarActionPerformed(ActionEvent evt) {
		int idLbl = io.entradaInt("Digite el ID de la posicion a Eliminar");
		String nombre = "";
		int id = 0;
		switch (idLbl) {
		case 1:
			objLbl = view.getLblIngrediente1();
			objLblIm = view.getLblIngrediente10();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("1. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[0]=null;
			break;
		case 2:
			objLbl = view.getLblIngrediente2();
			objLblIm = view.getLblIngrediente11();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("2. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[1]=null;
			break;
		case 3:
			objLbl = view.getLblIngrediente3();
			objLblIm = view.getLblIngrediente12();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("3. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[2]=null;
			break;

		case 4:
			objLbl = view.getLblIngrediente4();
			objLblIm = view.getLblIngrediente13();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("4. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[3]=null;
			break;

		case 5:
			objLbl = view.getLblIngrediente5();
			objLblIm = view.getLblIngrediente14();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("5. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[4]=null;
			break;

		case 6:
			objLbl = view.getLblIngrediente6();
			objLblIm = view.getLblIngrediente15();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("6. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[5]=null;
			break;

		case 7:
			objLbl = view.getLblIngrediente7();
			objLblIm = view.getLblIngrediente16();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("7. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[6]=null;
			break;

		case 8:
			objLbl = view.getLblIngrediente8();
			objLblIm = view.getLblIngrediente17();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("8. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[7]=null;
			break;

		case 9:
			objLbl = view.getLblIngrediente9();
			objLblIm = view.getLblIngrediente18();
			nombre = objLbl.getText().substring(3, objLbl.getText().length());
			id = db.idIngrediente(nombre);
			System.out.println("Ingrediente a eliminar: " + id + " " + nombre);
			model.eliminarIngrediente(id);
			objLbl.setText("9. Null");
			objLblIm.setIcon(null);
			this.listaIngPedidos[8]=null;
			break;
		default:
			io.salida("Opcion invalida");
			break;
		}

	}

	private void jbtnAnadirActionPerformed(ActionEvent evt) {
		int idLbl = io.entradaInt("Digite el ID de la posicion a insertar");
		int idTemp = 0;
		switch (idLbl) {
		case 1:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente1();
			objLblIm = view.getLblIngrediente10();
			// sacar la direccion del ingrediente con el id que asigno el usuario
			// crear objeto Icon y asignarlo al label
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("1. " + db.nombreIngrediente(idTemp));
					//La lista de ingredientes en la BD empieza en 0
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp - 1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[0]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente1(objLbl);
					view.setLblIngrediente10(objLblIm);
				}
			break;
		case 2:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente2();
			objLblIm = view.getLblIngrediente11();
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("2. " + db.nombreIngrediente(idTemp));
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp-1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[1]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente2(objLbl);
					view.setLblIngrediente11(objLblIm);
				}
			break;
		case 3:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente3();
			objLblIm = view.getLblIngrediente12();
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("3. " + db.nombreIngrediente(idTemp));
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp - 1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[2]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente3(objLbl);
					view.setLblIngrediente12(objLblIm);
				}
			break;

		case 4:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente4();
			objLblIm = view.getLblIngrediente13();
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("4. " + db.nombreIngrediente(idTemp));
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp - 1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[3]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente4(objLbl);
					view.setLblIngrediente13(objLblIm);
				}
			break;

		case 5:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente5();
			objLblIm = view.getLblIngrediente14();
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("5. " + db.nombreIngrediente(idTemp));
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp - 1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[4]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente5(objLbl);
					view.setLblIngrediente14(objLblIm);
				}
			break;

		case 6:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente6();
			objLblIm = view.getLblIngrediente15();
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("6. " + db.nombreIngrediente(idTemp));
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp - 1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[5]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente6(objLbl);
					view.setLblIngrediente15(objLblIm);
				}
			break;

		case 7:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente7();
			objLblIm = view.getLblIngrediente16();
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("7. " + db.nombreIngrediente(idTemp));
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp - 1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[6]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente7(objLbl);
					view.setLblIngrediente16(objLblIm);
				}
			break;

		case 8:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente8();
			objLblIm = view.getLblIngrediente17();
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("8. " + db.nombreIngrediente(idTemp));
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp - 1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[7]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente8(objLbl);
					view.setLblIngrediente17(objLblIm);
				}
			break;

		case 9:
			idTemp = io.entradaInt("Seleccione el ID del ingrediente:\n" + db.listarIngredientes());
			objLbl = view.getLblIngrediente9();
			objLblIm = view.getLblIngrediente18();
			if (objLbl.getText().substring(3, objLbl.getText().length()).equals("Null"))
				if (model.anadirIngrediente(idTemp) == true) {
					objLbl.setText("9. " + db.nombreIngrediente(idTemp));
					ImageIcon im = new ImageIcon(db.getIngrediente().get(idTemp - 1).getDirImagen());
					objLblIm.setIcon(new ImageIcon(im.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
					this.listaIngPedidos[8]=db.getIngrediente().get(idTemp-1);
					view.setLblIngrediente9(objLbl);
					view.setLblIngrediente18(objLblIm);
				}
			break;
		default:
			io.salida("Opcion invalida");
			break;
		}
		view.repaint();
	}
}
