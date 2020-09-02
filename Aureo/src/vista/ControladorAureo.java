
package vista;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utilitario.Ingrediente;

public class ControladorAureo {

	private Ingrediente[] listaIngPedidos = new Ingrediente[9];
	private VistaAureo ventana;
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
	private ImageIcon[] im = new ImageIcon[9];
	private int temp = 0;

	public ControladorAureo(Ingrediente[] listaIngPedidos, VistaAureo v) {

		this.ventana = v;
		this.panel = v.getPanel();
		this.Ingrediente1 = v.getIngrediente1();
		this.Ingrediente2 = v.getIngrediente2();
		this.Ingrediente3 = v.getIngrediente3();
		this.Ingrediente4 = v.getIngrediente4();
		this.Ingrediente5 = v.getIngrediente5();
		this.Ingrediente6 = v.getIngrediente6();
		this.Ingrediente7 = v.getIngrediente7();
		this.Ingrediente8 = v.getIngrediente8();
		this.Ingrediente9 = v.getIngrediente9();

		for (int i = 0; i < 9; i++) {
			this.listaIngPedidos[i] = listaIngPedidos[i];
			if (this.listaIngPedidos[i] != null) {
				this.temp++;
			}
		}

		if (listaIngPedidos[0] != null) {
			im[0] = new ImageIcon(listaIngPedidos[0].getDirImagen());
			// this.Ingrediente1.setIcon(new ImageIcon(im1.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		if (listaIngPedidos[1] != null) {
			im[1] = new ImageIcon(listaIngPedidos[1].getDirImagen());
			// this.Ingrediente2.setIcon(new ImageIcon(im2.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		if (listaIngPedidos[2] != null) {
			im[2] = new ImageIcon(listaIngPedidos[2].getDirImagen());
			// this.Ingrediente3.setIcon(new ImageIcon(im3.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		if (listaIngPedidos[3] != null) {
			im[3] = new ImageIcon(listaIngPedidos[3].getDirImagen());
			// this.Ingrediente4.setIcon(new ImageIcon(im4.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		if (listaIngPedidos[4] != null) {
			im[4] = new ImageIcon(listaIngPedidos[4].getDirImagen());
			// this.Ingrediente5.setIcon(new ImageIcon(im5.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		if (listaIngPedidos[5] != null) {
			im[5] = new ImageIcon(listaIngPedidos[5].getDirImagen());
			// this.Ingrediente6.setIcon(new ImageIcon(im6.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		if (listaIngPedidos[6] != null) {
			im[6] = new ImageIcon(listaIngPedidos[6].getDirImagen());
			// this.Ingrediente7.setIcon(new ImageIcon(im7.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		if (listaIngPedidos[7] != null) {
			im[7] = new ImageIcon(listaIngPedidos[7].getDirImagen());
			// this.Ingrediente8.setIcon(new ImageIcon(im8.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		if (listaIngPedidos[8] != null) {
			im[8] = new ImageIcon(listaIngPedidos[8].getDirImagen());
			// this.Ingrediente9.setIcon(new ImageIcon(im9.getImage().getScaledInstance(80,
			// 80, Image.SCALE_SMOOTH)));
		}

		pintarIngredientes();

	}

	public void pintarIngredientes() {

		int temp2 = 0;

		if (temp == 1) {
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 769, 430);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(769, 430, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
					break;
				}
			}
		}

		if (temp == 2) {
			this.panel
					.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo2.png");
			ventana.setPanel(panel);
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 1) {
					temp2++;
					this.Ingrediente2.setBounds(510, 20, 269, 430);
					this.Ingrediente2
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 430, Image.SCALE_SMOOTH)));
					ventana.setIngrediente2(Ingrediente2);
					break;
				}
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 450, 430);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 430, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
				}
			}
		}

		if (temp == 3) {
			this.panel
					.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo3.png");
			ventana.setPanel(panel);
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 2) {
					temp2++;
					this.Ingrediente3.setBounds(510, 20, 269, 139);
					this.Ingrediente3
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 139, Image.SCALE_SMOOTH)));
					ventana.setIngrediente3(Ingrediente3);
					break;
				}
				if (this.listaIngPedidos[i] != null && temp2 == 1) {
					temp2++;
					this.Ingrediente2.setBounds(510, 201, 269, 260);
					this.Ingrediente2
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente2(Ingrediente2);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 450, 430);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 430, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
				}
			}
		}

		if (temp == 4) {
			this.panel
					.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo4.png");
			ventana.setPanel(panel);
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 3) {
					temp2++;
					this.Ingrediente4.setBounds(510, 20, 98, 139);
					this.Ingrediente4
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 139, Image.SCALE_SMOOTH)));
					ventana.setIngrediente4(Ingrediente4);
					break;
				}
				if (this.listaIngPedidos[i] != null && temp2 == 2) {
					temp2++;
					this.Ingrediente3.setBounds(630, 20, 159, 139);
					this.Ingrediente3
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(159, 139, Image.SCALE_SMOOTH)));
					ventana.setIngrediente3(Ingrediente3);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 1) {
					temp2++;
					this.Ingrediente2.setBounds(510, 201, 269, 260);
					this.Ingrediente2
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente2(Ingrediente2);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 450, 430);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 430, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
				}
			}
		}

		if (temp == 5) {
			this.panel
					.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo5.png");
			ventana.setPanel(panel);
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 4) {
					temp2++;
					this.Ingrediente5.setBounds(510, 120, 98, 48);
					this.Ingrediente5
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 48, Image.SCALE_SMOOTH)));
					ventana.setIngrediente5(Ingrediente5);
					break;
				}
				if (this.listaIngPedidos[i] != null && temp2 == 3) {
					temp2++;
					this.Ingrediente4.setBounds(510, 15, 98, 88);
					this.Ingrediente4
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 88, Image.SCALE_SMOOTH)));
					ventana.setIngrediente4(Ingrediente4);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 2) {
					temp2++;
					this.Ingrediente3.setBounds(630, 20, 159, 139);
					this.Ingrediente3
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(159, 139, Image.SCALE_SMOOTH)));
					ventana.setIngrediente3(Ingrediente3);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 1) {
					temp2++;
					this.Ingrediente2.setBounds(510, 201, 269, 260);
					this.Ingrediente2
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente2(Ingrediente2);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 450, 430);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 430, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
				}
			}
		}

		if (temp == 6) {
			this.panel
					.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo6.png");
			ventana.setPanel(panel);
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 5) {
					temp2++;
					this.Ingrediente6.setBounds(20, 190, 450, 260);
					this.Ingrediente6
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente6(Ingrediente6);
					break;
				}
				if (this.listaIngPedidos[i] != null && temp2 == 4) {
					temp2++;
					this.Ingrediente5.setBounds(510, 120, 98, 48);
					this.Ingrediente5
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 48, Image.SCALE_SMOOTH)));
					ventana.setIngrediente5(Ingrediente5);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 3) {
					temp2++;
					this.Ingrediente4.setBounds(510, 15, 98, 88);
					this.Ingrediente4
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 88, Image.SCALE_SMOOTH)));
					ventana.setIngrediente4(Ingrediente4);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 2) {
					temp2++;
					this.Ingrediente3.setBounds(630, 20, 159, 139);
					this.Ingrediente3
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(159, 139, Image.SCALE_SMOOTH)));
					ventana.setIngrediente3(Ingrediente3);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 1) {
					temp2++;
					this.Ingrediente2.setBounds(510, 201, 269, 260);
					this.Ingrediente2
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente2(Ingrediente2);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 450, 151);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 151, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
				}
			}
		}

		if (temp == 7) {
			this.panel
					.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo7.png");
			ventana.setPanel(panel);
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 6) {
					temp2++;
					this.Ingrediente7.setBounds(320, 190, 170, 260);
					this.Ingrediente7
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(170, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente7(Ingrediente7);
					break;
				}
				if (this.listaIngPedidos[i] != null && temp2 == 5) {
					temp2++;
					this.Ingrediente6.setBounds(20, 190, 280, 260);
					this.Ingrediente6
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(280, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente6(Ingrediente6);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 4) {
					temp2++;
					this.Ingrediente5.setBounds(510, 120, 98, 48);
					this.Ingrediente5
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 48, Image.SCALE_SMOOTH)));
					ventana.setIngrediente5(Ingrediente5);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 3) {
					temp2++;
					this.Ingrediente4.setBounds(510, 15, 98, 88);
					this.Ingrediente4
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 88, Image.SCALE_SMOOTH)));
					ventana.setIngrediente4(Ingrediente4);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 2) {
					temp2++;
					this.Ingrediente3.setBounds(630, 20, 159, 139);
					this.Ingrediente3
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(159, 139, Image.SCALE_SMOOTH)));
					ventana.setIngrediente3(Ingrediente3);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 1) {
					temp2++;
					this.Ingrediente2.setBounds(510, 201, 269, 260);
					this.Ingrediente2
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente2(Ingrediente2);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 450, 151);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 151, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
				}
			}
		}

		if (temp == 8) {
			this.panel
					.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo8.png");
			ventana.setPanel(panel);
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 7) {
					temp2++;
					this.Ingrediente8.setBounds(320, 190, 170, 90);
					this.Ingrediente8
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(170, 90, Image.SCALE_SMOOTH)));
					ventana.setIngrediente8(Ingrediente8);
					break;
				}
				if (this.listaIngPedidos[i] != null && temp2 == 6) {
					temp2++;
					this.Ingrediente7.setBounds(320, 300, 170, 155);
					this.Ingrediente7
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(170, 155, Image.SCALE_SMOOTH)));
					ventana.setIngrediente7(Ingrediente7);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 5) {
					temp2++;
					this.Ingrediente6.setBounds(20, 190, 280, 260);
					this.Ingrediente6
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(280, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente6(Ingrediente6);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 4) {
					temp2++;
					this.Ingrediente5.setBounds(510, 120, 98, 48);
					this.Ingrediente5
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 48, Image.SCALE_SMOOTH)));
					ventana.setIngrediente5(Ingrediente5);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 3) {
					temp2++;
					this.Ingrediente4.setBounds(510, 15, 98, 88);
					this.Ingrediente4
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 88, Image.SCALE_SMOOTH)));
					ventana.setIngrediente4(Ingrediente4);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 2) {
					temp2++;
					this.Ingrediente3.setBounds(630, 20, 159, 139);
					this.Ingrediente3
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(159, 139, Image.SCALE_SMOOTH)));
					ventana.setIngrediente3(Ingrediente3);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 1) {
					temp2++;
					this.Ingrediente2.setBounds(510, 201, 269, 260);
					this.Ingrediente2
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente2(Ingrediente2);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 450, 151);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 151, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
				}
			}
		}

		if (temp == 9) {
			this.panel
					.setBackground("C:\\Users\\n3ver\\Music\\Patrones\\Patrones\\Aureo\\img\\Platillo9.png");
			ventana.setPanel(panel);
			for (int i = 0; i < 9; i++) {
				if (this.listaIngPedidos[i] != null && temp2 == 8) {
					temp2++;
					this.Ingrediente9.setBounds(430, 190, 60, 90);
					this.Ingrediente9
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(60, 90, Image.SCALE_SMOOTH)));
					ventana.setIngrediente9(Ingrediente9);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 7) {
					temp2++;
					this.Ingrediente8.setBounds(320, 190, 100, 90);
					this.Ingrediente8
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(100, 90, Image.SCALE_SMOOTH)));
					ventana.setIngrediente8(Ingrediente8);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 6) {
					temp2++;
					this.Ingrediente7.setBounds(320, 300, 170, 155);
					this.Ingrediente7
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(170, 155, Image.SCALE_SMOOTH)));
					ventana.setIngrediente7(Ingrediente7);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 5) {
					temp2++;
					this.Ingrediente6.setBounds(20, 190, 280, 260);
					this.Ingrediente6
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(280, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente6(Ingrediente6);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 4) {
					temp2++;
					this.Ingrediente5.setBounds(510, 120, 98, 48);
					this.Ingrediente5
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 48, Image.SCALE_SMOOTH)));
					ventana.setIngrediente5(Ingrediente5);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 3) {
					temp2++;
					this.Ingrediente4.setBounds(510, 15, 98, 88);
					this.Ingrediente4
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(98, 88, Image.SCALE_SMOOTH)));
					ventana.setIngrediente4(Ingrediente4);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 2) {
					temp2++;
					this.Ingrediente3.setBounds(630, 20, 159, 139);
					this.Ingrediente3
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(159, 139, Image.SCALE_SMOOTH)));
					ventana.setIngrediente3(Ingrediente3);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 1) {
					temp2++;
					this.Ingrediente2.setBounds(510, 201, 269, 260);
					this.Ingrediente2
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(269, 260, Image.SCALE_SMOOTH)));
					ventana.setIngrediente2(Ingrediente2);
				}
				if (this.listaIngPedidos[i] != null && temp2 == 0) {
					temp2++;
					this.Ingrediente1.setBounds(20, 20, 450, 151);
					this.Ingrediente1
							.setIcon(new ImageIcon(im[i].getImage().getScaledInstance(450, 151, Image.SCALE_SMOOTH)));
					ventana.setIngrediente1(Ingrediente1);
				}
			}
		}

	}

}