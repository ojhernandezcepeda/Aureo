package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import cableado.IGestor;

public class ControladorAdmin {
	
    private VistaAdmin view;
    private IGestor model;
    private JButton objBoton;
    
    public ControladorAdmin(VistaAdmin view, IGestor ig){
        this.model = ig;
        this.view = view;    
        objBoton = new JButton();        
    }
    public void iniciar() {
    	view.setTitle("Aureo - Gestor");
    	
    	objBoton = view.getJbElementos();
    	objBoton.addActionListener((ActionEvent evento)->{
    		jbtnElementosActionPerformed(evento);
    	});
    	view.setJbElementos(objBoton);
    	
    	objBoton = view.getJbFondos();
    	objBoton.addActionListener((ActionEvent evento)->{
    		jbtnFondosActionPerformed(evento);
    	});
    	view.setJbFondos(objBoton);
    	
    	objBoton = view.getJbIngredientes();
    	objBoton.addActionListener((ActionEvent evento)->{
    		jbtnIngredientesActionPerformed(evento);
    	});
    	view.setJbIngredientes(objBoton);
    	
    	objBoton = view.getJbVentas();
    	objBoton.addActionListener((ActionEvent evento)->{
    		jbtnVentasActionPerformed(evento);
    	});
    	view.setJbVentas(objBoton);
    }
    
	private void jbtnVentasActionPerformed(ActionEvent evento) {
		this.model.gestionarVentas();
		
	}
	private void jbtnIngredientesActionPerformed(ActionEvent evento) {
		this.model.gestionarInventario();
		
	}
	private void jbtnFondosActionPerformed(ActionEvent evento) {
		this.model.gestionarFondos();
		
	}
	private void jbtnElementosActionPerformed(ActionEvent evento) {
		this.model.gestionarElemento();
		
	}
	
}
