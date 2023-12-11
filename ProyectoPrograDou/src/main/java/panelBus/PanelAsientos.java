package panelBus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAsientos extends JPanel{
	PanelBus pb;
	AsientoBuilder constructor;
	private int piso;
	Asiento A1, A2;
	Asiento B1, B2;
	Asiento C1, C2;
	Asiento D1, D2, D3, D4;
	Asiento E1, E2, E3, E4;
	Asiento F1, F2, F3, F4;
	Asiento G1, G2;
	
	Asiento H1, H2, H3, H4;
	Asiento I1, I2;
	Asiento J1, J2, J3, J4;
	Asiento K1, K2, K3, K4;
	Asiento L1, L2, L3, L4;
	Asiento M1, M2, M3, M4;
	Asiento N1, N2, N3, N4;
	Font font = new Font("Arial", Font.BOLD, 20);
	public PanelAsientos(int piso, PanelBus pb) {
		this.piso = piso;
		this.pb = pb;
		constructor = new AsientoBuilder();
		constructor.setPA(this).setPiso(piso);
		this.setBounds(430,50,320,570);
		this.setBackground(new Color(100, 100, 100, 230));
		this.setLayout(null);
		if(piso == 1) {
			constructor.setX(20).setY(100).setPrecio(0).setNombre("B1");
			B1 = constructor.build();
			constructor.setY(180).setNombre("C1");
			C1 = constructor.build();
			constructor.setY(260).setNombre("D1");
			D1 = constructor.build();
			constructor.setY(340).setNombre("E1");
			E1 = constructor.build();
			constructor.setY(420).setNombre("F1");
			F1 = constructor.build();
			constructor.setY(500).setNombre("G1");
			G1 = constructor.build();
			
			constructor.setX(80).setY(100).setNombre("B2");
			B2 = constructor.build();
			constructor.setY(180).setNombre("C2");
			C2 = constructor.build();
			constructor.setY(260).setNombre("D2");
			D2 = constructor.build();
			constructor.setY(340).setNombre("E2");
			E2 = constructor.build();
			constructor.setY(420).setNombre("F2");
			F2 = constructor.build();
			constructor.setY(500).setNombre("G2");
			G2 = constructor.build();
			
			constructor.setX(200).setY(20).setNombre("A1").setPrecio(2);
			A1 = constructor.build();
			constructor.setY(260).setNombre("D3").setPrecio(0);
			D3 = constructor.build();
			constructor.setY(340).setNombre("E3");
			E3 = constructor.build();
			constructor.setY(420).setNombre("F3");
			F3 = constructor.build();
			
			constructor.setX(260).setY(20).setNombre("A2").setPrecio(2);
			A2 = constructor.build();
			constructor.setY(260).setNombre("D4").setPrecio(0);
			D4 = constructor.build();
			constructor.setY(340).setNombre("E4");
			E4 = constructor.build();
			constructor.setY(420).setNombre("F4");
			F4 = constructor.build();
		
			this.add(B1);
			this.add(C1);
			this.add(D1);
			this.add(E1);
			this.add(F1);
			this.add(G1);
			
			this.add(B2);
			this.add(C2);
			this.add(D2);
			this.add(E2);
			this.add(F2);
			this.add(G2);
			
			this.add(A1);
			this.add(D3);
			this.add(E3);
			this.add(F3);
			
			this.add(A2);
			this.add(D4);
			this.add(E4);
			this.add(F4);
		}
		else {
			constructor.setX(20).setY(20).setPrecio(2).setNombre("H1");
			H1 = constructor.build();
			constructor.setY(100).setNombre("I1").setPrecio(0);
			I1 = constructor.build();
			constructor.setY(180).setNombre("J1");
			J1 = constructor.build();
			constructor.setY(260).setNombre("K1");
			K1 = constructor.build();
			constructor.setY(340).setNombre("L1");
			L1 = constructor.build();
			constructor.setY(420).setNombre("M1");
			M1 = constructor.build();
			constructor.setY(500).setNombre("N1");
			N1 = constructor.build();
			
			constructor.setX(80).setY(20).setPrecio(2).setNombre("H2");
			H2 = constructor.build();
			constructor.setY(100).setNombre("I2").setPrecio(0);
			I2 = constructor.build();
			constructor.setY(180).setNombre("J2");
			J2 = constructor.build();
			constructor.setY(260).setNombre("K2");
			K2 = constructor.build();
			constructor.setY(340).setNombre("L2");
			L2 = constructor.build();
			constructor.setY(420).setNombre("M2");
			M2 = constructor.build();
			constructor.setY(500).setNombre("N2");
			N2 = constructor.build();
			
			constructor.setX(200).setY(20).setPrecio(2).setNombre("H3");
			H3 = constructor.build();
			constructor.setY(180).setNombre("J3").setPrecio(0);
			J3 = constructor.build();
			constructor.setY(260).setNombre("K3");
			K3 = constructor.build();
			constructor.setY(340).setNombre("L3");
			L3 = constructor.build();
			constructor.setY(420).setNombre("M3");
			M3 = constructor.build();
			constructor.setY(500).setNombre("N3");
			N3 = constructor.build();
			
			constructor.setX(260).setY(20).setPrecio(2).setNombre("H4");
			H4 = constructor.build();
			constructor.setY(180).setNombre("J4").setPrecio(0);
			J4 = constructor.build();
			constructor.setY(260).setNombre("K4");
			K4 = constructor.build();
			constructor.setY(340).setNombre("L4");
			L4 = constructor.build();
			constructor.setY(420).setNombre("M4");
			M4 = constructor.build();
			constructor.setY(500).setNombre("N4");
			N4 = constructor.build();

			this.add(H1);
			this.add(I1);
			this.add(J1);
			this.add(K1);
			this.add(L1);
			this.add(M1);
			this.add(N1);
			
			this.add(H2);
			this.add(I2);
			this.add(J2);
			this.add(K2);
			this.add(L2);
			this.add(M2);
			this.add(N2);
			
			this.add(H3);
			this.add(J3);
			this.add(K3);
			this.add(L3);
			this.add(M3);
			this.add(N3);
			
			this.add(H4);
			this.add(J4);
			this.add(K4);
			this.add(L4);
			this.add(M4);
			this.add(N4);
		}
	}
	public void addAsiento(Asiento a) {
		pb.addAsiento(a);
	}
	public void removeAsiento(Asiento a) {
		pb.removeAsiento(a);
	}
	public PanelBus getPB() {
		return pb;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		switch (piso){
			case 1:
				g.setColor(Color.BLACK);
				g.fillRect(200, 500,100,60);
				g.fillRect(200, 100,100,140);
				g.fillRect(20, 20,100,60);

				g.setColor(Color.WHITE);
				g.setFont(font);
				g.drawString("Chofer", 35, 58);
				g.drawString("Escalera", 210, 138);
				g.drawString("/", 250, 175);
				g.drawString("Entrada", 212, 205);
				g.drawString("Baño", 225, 538);
				break;
			case 2:
				g.setColor(Color.BLACK);
				g.fillRect(200, 100,100,60);

				g.setColor(Color.WHITE);
				g.setFont(font);
				g.drawString("Escalera", 210, 138);
				break;
			default:
				break;
		}
	}
}
