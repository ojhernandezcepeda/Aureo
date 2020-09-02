package utilitario;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EntradaSalida {
	    public String seleccionar(Object[] Elementos, String texto) {
	        Object seleccion = JOptionPane.showInputDialog(null, texto,
	                "Opciones Disponibles", JOptionPane.QUESTION_MESSAGE, null, Elementos, null);
	        if (seleccion != null) {
	            return seleccion.toString();
	        } else {
	            return "Ninguno";
	        }
	    }
	    public String entrada(String texto) {
	        String in = JOptionPane.showInputDialog(null, texto);
	        if (in == null){
	            in = "";
	        }
	        return in;
	    }
	    public int entradaInt(String mensaje) {
	        String aux = JOptionPane.showInputDialog(null, mensaje);
	        int entrada = 0;
	        try {
	            entrada = Integer.parseInt(aux);
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "El valor no es un numero");
	        }
	        return entrada;
	    }
	    public double entradaDouble(String mensaje) {
	        String aux = JOptionPane.showInputDialog(null, mensaje);
	        double entrada = 0.0;
	        try {
	            entrada = Double.parseDouble(aux);
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, "El valor no es un numero");
	        }
	        return entrada;
	    }
	    public void salida(String texto) {
	        JOptionPane.showMessageDialog(null, texto);
	    }
	    
	    public void salidaText(String texto, String titulo) {
	    	JTextArea ta = new JTextArea(10, 10);
	    	ta.setSize(400, 400);
            ta.setText(texto);
            ta.setWrapStyleWord(true);
            ta.setLineWrap(true);
            ta.setCaretPosition(0);
            ta.setEditable(false);

            JOptionPane.showMessageDialog(null, new JScrollPane(ta), titulo, JOptionPane.PLAIN_MESSAGE);
	    }
}
