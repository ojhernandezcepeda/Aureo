package Vista;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class VistaVentas extends JFrame{
    
    //ATRIBUTOS
    private JPanel contentPane;
    private JButton jbFacturas;
    private JButton jbGanancias;
    private JTextArea textArea;
    private JScrollPane scroll;
    
    //METODOS
    public VistaVentas(){
        
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
        
        jbFacturas = new JButton("Consultar Facturas");
        jbFacturas.setBounds(340,10,160,23);
        this.contentPane.add(jbFacturas);
        
        jbGanancias = new JButton("Consultar Ganancias");
        jbGanancias.setBounds(340,38,160,23);
        this.contentPane.add(jbGanancias);
        
    }

    public JButton getJbFacturas() {
    	return jbFacturas;
    }

    public void setJbFacturas(JButton jbFacturas) {
    	this.jbFacturas = jbFacturas;
    }

    public JButton getJbGanancias() {
    	return jbGanancias;
    }

    public void setJbGanancias(JButton jbGanancias) {
    	this.jbGanancias = jbGanancias;
    }

    public JTextArea getTextArea() {
    	return textArea;
    }

    public void setTextArea(JTextArea textArea) {
    	this.textArea = textArea;
    }
	
}