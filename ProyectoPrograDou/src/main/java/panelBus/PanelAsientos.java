package panelBus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAsientos extends JPanel{
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
	public PanelAsientos(int piso) {
		this.setBounds(430,50,550,570);
		this.setBackground(new Color(100, 100, 100, 100));
		this.setLayout(null);
		if(piso == 1) {
			B1 = new Asiento(this, 20, 100, 1, 1);
			C1 = new Asiento(this, 20, 180, 1, 1);
			D1 = new Asiento(this, 20, 260, 1, 1);
			E1 = new Asiento(this, 20, 340, 1, 1);
			F1= new Asiento(this, 20, 420, 1, 1);
			G1 = new Asiento(this, 20, 500, 1, 1);
			
			B2 = new Asiento(this, 80, 100, 1, 1);
			C2 = new Asiento(this, 80, 180, 1, 1);
			D2 = new Asiento(this, 80, 260, 1, 1);
			E2 = new Asiento(this, 80, 340, 1, 1);
			F2 = new Asiento(this, 80, 420, 1, 1);
			G2 = new Asiento(this, 80, 500, 1, 1);
			
			A1 = new Asiento(this, 200, 20, 1, 1);
			D2 = new Asiento(this, 200, 260, 1, 1);
			E2 = new Asiento(this, 200, 340, 1, 1);
			F2 = new Asiento(this, 200, 420, 1, 1);
			
			A1 = new Asiento(this, 20, 260, 1, 1);
			D2 = new Asiento(this, 260, 260, 1, 1);
			E2 = new Asiento(this, 260, 340, 1, 1);
			F2 = new Asiento(this, 260, 420, 1, 1);
		
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
		else if(piso == 2) {
			B1 = new Asiento(this, 20, 100, 1, 1);
			C1 = new Asiento(this, 20, 180, 1, 1);
			D1 = new Asiento(this, 20, 260, 1, 1);
			E1 = new Asiento(this, 20, 340, 1, 1);
			F1= new Asiento(this, 20, 420, 1, 1);
			G1 = new Asiento(this, 20, 500, 1, 1);
		
			this.add(B1);
			this.add(C1);
			this.add(D1);
			this.add(E1);
			this.add(F1);
			this.add(G1);
		}
	}
}
