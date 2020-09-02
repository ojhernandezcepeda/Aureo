package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VistaAureo extends JFrame{
    
    private JPanelBackground panel;
    private JLabel Ingrediente1;
    private JLabel Ingrediente2;
    private JLabel Ingrediente3;
    private JLabel Ingrediente4;
    private JLabel Ingrediente5;
    private JLabel Ingrediente6;
    private JLabel Ingrediente7;
    private JLabel Ingrediente8;
    private JLabel Ingrediente9;
    
    public VistaAureo(){
        this.setTitle("Aureo - Vista Platillo");
        this.panel = new JPanelBackground();
        this.Ingrediente1 = new JLabel();
        this.Ingrediente2 = new JLabel();
        this.Ingrediente3 = new JLabel();
        this.Ingrediente4 = new JLabel();
        this.Ingrediente5 = new JLabel();
        this.Ingrediente6 = new JLabel();
        this.Ingrediente7 = new JLabel();
        this.Ingrediente8 = new JLabel();
        this.Ingrediente9 = new JLabel();
        this.add(panel);
        this.panel.add(Ingrediente1);
        this.panel.add(Ingrediente2);
        this.panel.add(Ingrediente3);
        this.panel.add(Ingrediente4);
        this.panel.add(Ingrediente5);
        this.panel.add(Ingrediente6);
        this.panel.add(Ingrediente7);
        this.panel.add(Ingrediente8);
        this.panel.add(Ingrediente9);
        
        this.setSize(809,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        editarPanel();
        
    }
    
    public void editarPanel(){
        
        this.panel.setLayout(null);
        this.panel.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo1.png");
        
    }

    public JPanelBackground getPanel() {
        return panel;
    }

    public void setPanel(JPanelBackground panel) {
        this.panel = panel;
    }

    public JLabel getIngrediente1() {
        return Ingrediente1;
    }

    public void setIngrediente1(JLabel Ingrediente1) {
        this.Ingrediente1 = Ingrediente1;
    }

    public JLabel getIngrediente2() {
        return Ingrediente2;
    }

    public void setIngrediente2(JLabel Ingrediente2) {
        this.Ingrediente2 = Ingrediente2;
    }

    public JLabel getIngrediente3() {
        return Ingrediente3;
    }

    public void setIngrediente3(JLabel Ingrediente3) {
        this.Ingrediente3 = Ingrediente3;
    }

    public JLabel getIngrediente4() {
        return Ingrediente4;
    }

    public void setIngrediente4(JLabel Ingrediente4) {
        this.Ingrediente4 = Ingrediente4;
    }

    public JLabel getIngrediente5() {
        return Ingrediente5;
    }

    public void setIngrediente5(JLabel Ingrediente5) {
        this.Ingrediente5 = Ingrediente5;
    }

    public JLabel getIngrediente6() {
        return Ingrediente6;
    }

    public void setIngrediente6(JLabel Ingrediente6) {
        this.Ingrediente6 = Ingrediente6;
    }

    public JLabel getIngrediente7() {
        return Ingrediente7;
    }

    public void setIngrediente7(JLabel Ingrediente7) {
        this.Ingrediente7 = Ingrediente7;
    }

    public JLabel getIngrediente8() {
        return Ingrediente8;
    }

    public void setIngrediente8(JLabel Ingrediente8) {
        this.Ingrediente8 = Ingrediente8;
    }

    public JLabel getIngrediente9() {
        return Ingrediente9;
    }

    public void setIngrediente9(JLabel Ingrediente9) {
        this.Ingrediente9 = Ingrediente9;
    }
    
}
