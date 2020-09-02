package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VistaAdmin extends JFrame{
	
    private JPanel panel;
    private JLabel etiqueta;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JButton jbElementos, jbIngredientes, jbFondos, jbVentas;
    
    public VistaAdmin(){
        this.setBounds(100,100,525,500);//Establecemos el Tamaño de la ventana
        this.setResizable(false);
        setTitle("Aureo - Gestion");//Establecemos el titulo de la ventana
        IniciarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void IniciarComponentes(){
        
        IniciarPanel();
        AnadirEtiquetas();
        AnadirBotones();
        
    }
    
    private void IniciarPanel(){
        
        panel = new JPanel();
        panel.setVisible(true);
        panel.setLayout(null);
        panel.setBackground(Color.black);
        this.getContentPane().add(panel);
        
    }
    
    private void AnadirEtiquetas(){
        
        int ancho=300, largo=100;
        int posx=(this.getWidth()/2)-(ancho/2);
        int posy=20;
        
        this.etiqueta = new JLabel(); //Creamos una etiqueta de texto
        etiqueta.setText("Aureo");
        etiqueta.setBounds(posx, posy, ancho, largo);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.WHITE);//Cambiar el color de la letra de nuestra etiqueta
        etiqueta.setOpaque(false);
        etiqueta.setFont(new Font("arial",3,40));
        panel.add(etiqueta);
        
        posy=60;
        this.etiqueta2 = new JLabel();
        etiqueta2.setText("Restaurantes");
        etiqueta2.setBounds(posx, posy, ancho, largo);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta2.setForeground(Color.WHITE);//Cambiar el color de la letra de nuestra etiqueta
        etiqueta2.setOpaque(false);
        etiqueta2.setFont(new Font("arial",2,20));
        panel.add(etiqueta2);
        
        ancho=150;
        largo=150;
        posy=170;
        ImageIcon i = new ImageIcon("D:\\Aureo\\Aureo.png");
        this.etiqueta3 = new JLabel();
        etiqueta3.setBounds(posx+70, posy, ancho, largo);
        etiqueta3.setIcon(new ImageIcon(i.getImage().getScaledInstance(ancho, largo, Image.SCALE_SMOOTH)));
        panel.add(etiqueta3);
        
    }
    
    private void AnadirBotones(){
        
        int ancho=240, largo=40;
        int posx=((this.getWidth())-(ancho*2))/2;
        int posy=340;
        
        this.jbElementos = new JButton();
        jbElementos.setText("Gestionar Elemento");
        jbElementos.setBounds(posx, posy, ancho, largo);
        panel.add(jbElementos);
        
        this.jbIngredientes = new JButton();
        jbIngredientes.setText("Gestionar Ingredientes");
        jbIngredientes.setBounds(posx+240, posy, ancho, largo);
        panel.add(jbIngredientes);
        
         
        
        this.jbFondos = new JButton();
        jbFondos.setText("Gestionar Fondos");
        jbFondos.setBounds(posx, posy+60, ancho, largo);
        panel.add(jbFondos);
        
        this.jbVentas = new JButton();
        jbVentas.setText("Gestionar Ventas");
        jbVentas.setBounds(posx+240, posy+60, ancho, largo);
        panel.add(jbVentas);
        
    }

	public JButton getJbElementos() {
		return jbElementos;
	}

	public void setJbElementos(JButton jbElementos) {
		this.jbElementos = jbElementos;
	}

	public JButton getJbIngredientes() {
		return jbIngredientes;
	}

	public void setJbIngredientes(JButton jbIngredientes) {
		this.jbIngredientes = jbIngredientes;
	}

	public JButton getJbFondos() {
		return jbFondos;
	}

	public void setJbFondos(JButton jbFondos) {
		this.jbFondos = jbFondos;
	}

	public JButton getJbVentas() {
		return jbVentas;
	}

	public void setJbVentas(JButton jbVentas) {
		this.jbVentas = jbVentas;
	}
	
    
}