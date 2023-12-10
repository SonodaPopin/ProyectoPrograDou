package panelBus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAsientos extends JPanel{
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
	public PanelAsientos(int piso) {
		this.setBounds(430,50,320,570);
		this.setBackground(new Color(100, 100, 100, 230));
		this.setLayout(null);
		this.piso = piso;
		if(piso == 1) {
			B1 = new Asiento(this, 20, 100, 1, 1, "B1");
			C1 = new Asiento(this, 20, 180, 1, 1, "C1");
			D1 = new Asiento(this, 20, 260, 1, 1, "D1");
			E1 = new Asiento(this, 20, 340, 1, 1, "E1");
			F1 = new Asiento(this, 20, 420, 1, 1, "F1");
			G1 = new Asiento(this, 20, 500, 1, 1, "G1");
			
			B2 = new Asiento(this, 80, 100, 1, 1, "B2");
			C2 = new Asiento(this, 80, 180, 1, 1, "C2");
			D2 = new Asiento(this, 80, 260, 1, 1, "D2");
			E2 = new Asiento(this, 80, 340, 1, 1, "E2");
			F2 = new Asiento(this, 80, 420, 1, 1, "F2");
			G2 = new Asiento(this, 80, 500, 1, 1, "G2");
			
			A1 = new Asiento(this, 200, 20, 1, 2, "A1");
			D3 = new Asiento(this, 200, 260, 1, 1, "D3");
			E3 = new Asiento(this, 200, 340, 1, 1, "E3");
			F3 = new Asiento(this, 200, 420, 1, 1, "F3");
			
			A2 = new Asiento(this, 260, 20, 1, 2, "A2");
			D4 = new Asiento(this, 260, 260, 1, 1, "D4");
			E4 = new Asiento(this, 260, 340, 1, 1, "E4");
			F4 = new Asiento(this, 260, 420, 1, 1, "F4");
		
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
			H1 = new Asiento(this, 20, 20, 1, 2, "H1");
			I1 = new Asiento(this, 20, 100, 1, 1, "I1");
			J1 = new Asiento(this, 20, 180, 1, 1, "J1");
			K1 = new Asiento(this, 20, 260, 1, 1, "K1");
			L1 = new Asiento(this, 20, 340, 1, 1, "L1");
			M1 = new Asiento(this, 20, 420, 1, 1, "M1");
			N1 = new Asiento(this, 20, 500, 1, 1, "N1");
			
			H2 = new Asiento(this, 80, 20, 1, 2, "H2");
			I2 = new Asiento(this, 80, 100, 1, 1, "I2");
			J2 = new Asiento(this, 80, 180, 1, 1, "J2");
			K2 = new Asiento(this, 80, 260, 1, 1, "K2");
			L2 = new Asiento(this, 80, 340, 1, 1, "L2");
			M2 = new Asiento(this, 80, 420, 1, 1, "M2");
			N2 = new Asiento(this, 80, 500, 1, 1, "N2");
			
			H3 = new Asiento(this, 200, 20, 1, 2, "H3");
			J3 = new Asiento(this, 200, 180, 1, 1, "J3");
			K3 = new Asiento(this, 200, 260, 1, 1, "K3");
			L3 = new Asiento(this, 200, 340, 1, 1, "L3");
			M3 = new Asiento(this, 200, 420, 1, 1, "M3");
			N3 = new Asiento(this, 200, 500, 1, 1, "N3");
			
			H4 = new Asiento(this, 260, 20, 1, 2, "H4");
			J4 = new Asiento(this, 260, 180, 1, 1, "J4");
			K4 = new Asiento(this, 260, 260, 1, 1, "K4");
			L4 = new Asiento(this, 260, 340, 1, 1, "L4");
			M4 = new Asiento(this, 260, 420, 1, 1, "M4");
			N4 = new Asiento(this, 260, 500, 1, 1, "N4");
			
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
				g.drawString("Entrada", 215, 160);
				g.drawString("/", 250, 180);
				g.drawString("Escalera", 210, 200);
				g.drawString("Baño", 225, 538);

			case 2:
				g.setColor(Color.BLACK);
				g.fillRect(200, 100,100,60);

				g.setColor(Color.WHITE);
				g.setFont(font);
				g.drawString("Escalera", 210, 138);
		}
	}
}
