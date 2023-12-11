package panelFinal;

import java.awt.Color;

import javax.swing.*;

public class TotalPrecios extends JPanel{
	int preciofinal;
	public TotalPrecios(int preciofinal){
        this.setBounds(0,470,550,100);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.preciofinal = preciofinal;
	}
}