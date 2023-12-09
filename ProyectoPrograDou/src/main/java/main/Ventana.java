package main;

import javax.swing.*;

import panelPrincipal.PanelPrincipal;

public class Ventana extends JFrame{
	PanelPrincipal pp;
	Pasaje[] pa;
    public Ventana() {
        super();

        this.setLayout(null);
        this.setTitle("BusesDou");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        
        pp = new PanelPrincipal(this);
        this.add(pp);

        ImageIcon image = new ImageIcon("doubuslogodou.jpg");
        this.setIconImage(image.getImage());
    }
    public void Parte2() {
    	this.remove(pp);
    }
}
