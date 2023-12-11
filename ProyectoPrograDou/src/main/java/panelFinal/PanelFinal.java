package panelFinal;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

import main.*;
import panelBus.*;
import panelPrincipal.Doubus;

public class PanelFinal extends JPanel{
    private BotonConfirmarBus bcb;
    private BotonCancelarBus bccb;
    private Doubus db;
    public PanelFinal(Ventana v, AsientosSelec as) {
        this.setBounds(0,0,1080,720);
        this.setLayout(null);
        
        bcb = new BotonConfirmarBus(v);
        bccb = new BotonCancelarBus(v);
        db = new Doubus();
        
        this.add(bcb);
        this.add(bccb);
        this.add(db);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}