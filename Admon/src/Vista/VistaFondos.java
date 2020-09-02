package Vista;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class VistaFondos extends JFrame{
    
    //ATRIBUTOS
    private JPanel contentPane;
    private JButton jbContratar;
    private JButton jbListar;
    private JButton jbDespedir;
    private JButton jbGenerarNomina;
    private JTextArea textArea;
    private JScrollPane scroll;
    
    //METODOS
    public VistaFondos(){
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(100, 100, 525, 500);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        this.add(contentPane);
        anadirTextArea();
        anadirBotones();
        
    }
    
    public void anadirTextArea(){
        
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 300, 400);
        textArea.setVisible(true);
        //contentPane.add(textArea);
        
        scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(10, 10, 300, 400);
        contentPane.add(scroll);
        
    }
    
    public void anadirBotones(){
        
        jbContratar = new JButton("Contratar Empleado");
        jbContratar.setBounds(340,10,160,23);
        this.contentPane.add(jbContratar);
        
        jbListar = new JButton("Listar Empleados");
        jbListar.setBounds(340,38,160,23);
        this.contentPane.add(jbListar);
        
        jbDespedir = new JButton("Despedir Empleado");
        jbDespedir.setBounds(340,66,160,23);
        this.contentPane.add(jbDespedir);
        
        jbGenerarNomina = new JButton("Generar Nomina");
        jbGenerarNomina.setBounds(340,387,160,23);
        this.contentPane.add(jbGenerarNomina);
        
    }
	
    public JButton getJbListar() {
    	return jbListar;
    }


    public void setJbListar(JButton jbListar) {
    	this.jbListar = jbListar;
    }


    public JButton getJbInsertar() {
    	return jbContratar;
    }

    public JButton getJbContratar() {
    	return jbContratar;
    }

    public void setJbContratar(JButton jbContratar) {
    	this.jbContratar = jbContratar;
    }

    public JButton getJbDespedir() {
    	return jbDespedir;
    }

    public void setJbDespedir(JButton jbDespedir) {
    	this.jbDespedir = jbDespedir;
    }

    public JButton getJbGenerarNomina() {
    	return jbGenerarNomina;
    }

    public void setJbGenerarNomina(JButton jbGenerarNomina) {
    	this.jbGenerarNomina = jbGenerarNomina;
    }

    public JTextArea getTextArea() {
    	return textArea;
    }

    public void setTextArea(JTextArea textArea) {
    	this.textArea = textArea;
    }

}

