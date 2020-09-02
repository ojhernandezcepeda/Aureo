package vista;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VistaPlatillo9 extends JFrame {

	private JPanel panelGeneral, panelElementos;
	private JButton btnAnadir,btnEliminar, btnRecomendado, btnGuardar, btnAureo, jbPagos, jbPlatillo,jbDomicilio;	
	private JLabel lblIngrediente1,lblIngrediente2,lblIngrediente3,lblIngrediente4,lblIngrediente5,lblIngrediente6,lblIngrediente7, lblIngrediente8, lblIngrediente9, lblIngrediente10, lblIngrediente11, lblIngrediente12, lblIngrediente13, lblIngrediente14, lblIngrediente15, lblIngrediente16, lblIngrediente17, lblIngrediente18,lblPrevisualizar;		
	private final int tamano = 9;	
	private JMenuBar menuBar;
	
	public VistaPlatillo9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 500);
		panelGeneral = new JPanel();
		panelGeneral.setBorder(new EmptyBorder(5, 5, 5, 5));		
		panelGeneral.setLayout(null);				
		setContentPane(panelGeneral);		
		
		panelElementos = new JPanel();
		panelElementos.setBounds(10, 60, 360, 360);
		panelGeneral.add(panelElementos);
		panelElementos.setLayout(new GridLayout(0, 3, 10, 10));
		
		lblIngrediente1 = new JLabel("1. Null");
		panelElementos.add(lblIngrediente1);
		
		lblIngrediente2 = new JLabel("2. Null");
		panelElementos.add(lblIngrediente2);
		
		lblIngrediente3 = new JLabel("3. Null");
		panelElementos.add(lblIngrediente3);
		
		lblIngrediente10 = new JLabel();
		panelElementos.add(lblIngrediente10);
		
		lblIngrediente11 = new JLabel();
		panelElementos.add(lblIngrediente11);
		
		lblIngrediente12 = new JLabel();
		panelElementos.add(lblIngrediente12);
		
		lblIngrediente4 = new JLabel("4. Null");
		panelElementos.add(lblIngrediente4);
		
		lblIngrediente5 = new JLabel("5. Null");
		panelElementos.add(lblIngrediente5);
		
		lblIngrediente6 = new JLabel("6. Null");
		panelElementos.add(lblIngrediente6);
		
		lblIngrediente13 = new JLabel();
		panelElementos.add(lblIngrediente13);
		
		lblIngrediente14 = new JLabel();
		panelElementos.add(lblIngrediente14);
		
		lblIngrediente15 = new JLabel();
		panelElementos.add(lblIngrediente15);
		
		lblIngrediente7 = new JLabel("7. Null");
		panelElementos.add(lblIngrediente7);
		
		lblIngrediente8 = new JLabel("8. Null");
		panelElementos.add(lblIngrediente8);
		
		lblIngrediente9 = new JLabel("9. Null");
		panelElementos.add(lblIngrediente9);
		
		lblIngrediente16 = new JLabel();
		panelElementos.add(lblIngrediente16);
		
		lblIngrediente17 = new JLabel();
		panelElementos.add(lblIngrediente17);
		
		lblIngrediente18 = new JLabel();
		panelElementos.add(lblIngrediente18);
		
		lblPrevisualizar = new JLabel("Previsualizacion del Platillo");
		lblPrevisualizar.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPrevisualizar.setBounds(10, 27, 360, 19);
		panelGeneral.add(lblPrevisualizar);
		
		btnAnadir = new JButton("Anadir");
		btnAnadir.setBounds(394, 60, 105, 23);
		panelGeneral.add(btnAnadir);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(394, 100, 105, 23);
		panelGeneral.add(btnEliminar);
		
		btnRecomendado = new JButton("Random");
		btnRecomendado.setBounds(394, 140, 105, 23);
		panelGeneral.add(btnRecomendado);
		
		btnAureo = new JButton("Ver Aureo");
		btnAureo.setBounds(394, 180, 105, 23);
		panelGeneral.add(btnAureo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(394, 397, 105, 23);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);			
		jbPagos = new JButton("Pagos");
		//jbPlatillo = new JButton("Platillo");		
		jbDomicilio = new JButton("Domicilio");		
		//menuBar.add(jbPlatillo);
		menuBar.add(jbPagos);
		menuBar.add(jbDomicilio);
		setResizable(false);
		panelGeneral.add(btnGuardar);
	}

	public JPanel getPanelGeneral() {
		return panelGeneral;
	}

	public void setPanelGeneral(JPanel panelGeneral) {
		this.panelGeneral = panelGeneral;
	}

	public JPanel getPanelElementos() {
		return panelElementos;
	}

	public void setPanelElementos(JPanel panelElementos) {
		this.panelElementos = panelElementos;
	}

	public JButton getBtnAnadir() {
		return btnAnadir;
	}

	public void setBtnAnadir(JButton btnAnadir) {
		this.btnAnadir = btnAnadir;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnRecomendado() {
		return btnRecomendado;
	}

	public void setBtnRecomendado(JButton btnRecomendado) {
		this.btnRecomendado = btnRecomendado;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}
	
	public JButton getBtnAureo() {
		return btnAureo;
	}

	public void setBtnAureo(JButton btnAureo) {
		this.btnAureo = btnAureo;
	}

	public JLabel getLblIngrediente1() {
		return lblIngrediente1;
	}

	public void setLblIngrediente1(JLabel lblIngrediente1) {
		this.lblIngrediente1 = lblIngrediente1;
	}

	public JLabel getLblIngrediente2() {
		return lblIngrediente2;
	}

	public void setLblIngrediente2(JLabel lblIngrediente2) {
		this.lblIngrediente2 = lblIngrediente2;
	}

	public JLabel getLblIngrediente3() {
		return lblIngrediente3;
	}

	public void setLblIngrediente3(JLabel lblIngrediente3) {
		this.lblIngrediente3 = lblIngrediente3;
	}

	public JLabel getLblIngrediente4() {
		return lblIngrediente4;
	}

	public void setLblIngrediente4(JLabel lblIngrediente4) {
		this.lblIngrediente4 = lblIngrediente4;
	}

	public JLabel getLblIngrediente5() {
		return lblIngrediente5;
	}

	public void setLblIngrediente5(JLabel lblIngrediente5) {
		this.lblIngrediente5 = lblIngrediente5;
	}

	public JLabel getLblIngrediente6() {
		return lblIngrediente6;
	}

	public void setLblIngrediente6(JLabel lblIngrediente6) {
		this.lblIngrediente6 = lblIngrediente6;
	}

	public JLabel getLblIngrediente7() {
		return lblIngrediente7;
	}

	public void setLblIngrediente7(JLabel lblIngrediente7) {
		this.lblIngrediente7 = lblIngrediente7;
	}

	public JLabel getLblIngrediente8() {
		return lblIngrediente8;
	}

	public void setLblIngrediente8(JLabel lblIngrediente8) {
		this.lblIngrediente8 = lblIngrediente8;
	}

	public JLabel getLblIngrediente9() {
		return lblIngrediente9;
	}

	public void setLblIngrediente9(JLabel lblIngrediente9) {
		this.lblIngrediente9 = lblIngrediente9;
	}
	
	public JLabel getLblIngrediente10() {
		return lblIngrediente10;
	}

	public void setLblIngrediente10(JLabel lblIngrediente10) {
		this.lblIngrediente10 = lblIngrediente10;
	}
	
	public JLabel getLblIngrediente11() {
		return lblIngrediente11;
	}

	public void setLblIngrediente11(JLabel lblIngrediente11) {
		this.lblIngrediente11 = lblIngrediente11;
	}
	
	public JLabel getLblIngrediente12() {
		return lblIngrediente12;
	}

	public void setLblIngrediente12(JLabel lblIngrediente12) {
		this.lblIngrediente12 = lblIngrediente12;
	}
	
	public JLabel getLblIngrediente13() {
		return lblIngrediente13;
	}

	public void setLblIngrediente13(JLabel lblIngrediente13) {
		this.lblIngrediente13 = lblIngrediente13;
	}
	
	public JLabel getLblIngrediente14() {
		return lblIngrediente14;
	}

	public void setLblIngrediente14(JLabel lblIngrediente14) {
		this.lblIngrediente14 = lblIngrediente14;
	}
	
	public JLabel getLblIngrediente15() {
		return lblIngrediente15;
	}

	public void setLblIngrediente15(JLabel lblIngrediente15) {
		this.lblIngrediente15 = lblIngrediente15;
	}
	
	public JLabel getLblIngrediente16() {
		return lblIngrediente16;
	}

	public void setLblIngrediente16(JLabel lblIngrediente16) {
		this.lblIngrediente16 = lblIngrediente16;
	}
	
	public JLabel getLblIngrediente17() {
		return lblIngrediente17;
	}

	public void setLblIngrediente17(JLabel lblIngrediente17) {
		this.lblIngrediente17 = lblIngrediente17;
	}
	
	public JLabel getLblIngrediente18() {
		return lblIngrediente18;
	}

	public void setLblIngrediente18(JLabel lblIngrediente18) {
		this.lblIngrediente18 = lblIngrediente18;
	}

	public JLabel getLblPrevisualizar() {
		return lblPrevisualizar;
	}

	public void setLblPrevisualizar(JLabel lblPrevisualizar) {
		this.lblPrevisualizar = lblPrevisualizar;
	}

	public int getTamano() {
		return tamano;
	}
	
	public JButton getJbPagos() {
		return jbPagos;
	}

	public void setJbPagos(JButton jbPagos) {
		this.jbPagos = jbPagos;
	}

	public JButton getJbPlatillo() {
		return jbPlatillo;
	}

	public void setJbPlatillo(JButton jbPlatillo) {
		this.jbPlatillo = jbPlatillo;
	}

	public JButton getJbDomicilio() {
		return jbDomicilio;
	}

	public void setJbDomicilio(JButton jbDomicilio) {
		this.jbDomicilio = jbDomicilio;
	}
	
}