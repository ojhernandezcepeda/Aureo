package Vista;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;

public class VistaElementos extends JFrame {
	
    //ATRIBUTOS
    private JPanel contentPane;
    private JButton jbInsertar;
    private JButton jbListar;
    private JButton jbEliminar;
    private JTextArea textArea;
    private JScrollPane scroll;
    
    //METODOS
    public VistaElementos(){
        
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
        textArea.setBounds(10,10,300,400);
        textArea.setVisible(true);
        //contentPane.add(textArea);
        
        scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(10, 10, 300, 400);
        contentPane.add(scroll);
        
    }
    
    public void anadirBotones(){
        
        jbInsertar = new JButton("Insertar Elemento");
        jbInsertar.setBounds(340,10,160,23);
        this.contentPane.add(jbInsertar);
        
        jbListar = new JButton("Listar Elementos");
        jbListar.setBounds(340,38,160,23);
        this.contentPane.add(jbListar);
        
        jbEliminar = new JButton("Eliminar Elemento");
        jbEliminar.setBounds(340,66,160,23);
        this.contentPane.add(jbEliminar);
        
    }

    public JButton getJbInsertar() {
    	return jbInsertar;
    }

    public void setJbInsertar(JButton jbInsertar) {
    	this.jbInsertar = jbInsertar;
    }

    public JButton getJbListar() {
    	return jbListar;
    }

    public void setJbListar(JButton jbListar) {
    	this.jbListar = jbListar;
    }

    public JButton getJbEliminar() {
    	return jbEliminar;
    }

    public void setJbEliminar(JButton jbEliminar) {
    	this.jbEliminar = jbEliminar;
    }

    public JTextArea getTextArea() {
    	return textArea;
    }

    public void setTextArea(JTextArea textArea) {
    	this.textArea = textArea;
    }
	
}
