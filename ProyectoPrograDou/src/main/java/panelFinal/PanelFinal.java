package panelFinal;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.*;

import main.*;
import panelBus.*;
import panelPrincipal.Doubus;

public class PanelFinal extends JPanel{
    private BotonConfirmarBus bcb;
    private BotonCancelarBus bccb;
    private Doubus db;
    private PanelReservas pr;
    private PanelGracias pg;
    private ArrayList<FinalTicket> tickets;
    public PanelFinal(Ventana v, AsientosSelec as) {
        this.setBounds(0,0,1080,720);
        this.setLayout(null);
        tickets = new ArrayList<>();
        for(int i = 0; i<as.getCantidad(); i++) {
        	tickets.add(new FinalTicket(as.getAsiento(i)));
        }
        
        bcb = new BotonConfirmarBus(v);
        bccb = new BotonCancelarBus(v);
        db = new Doubus();
        pr = new PanelReservas(tickets, as.getPrecioTotal(), as.getCantidad());
        pg = new PanelGracias();
        
        this.add(bcb);
        this.add(bccb);
        this.add(db);
        this.add(pr);
        
    }
    public void Nukear() {
        this.remove(bcb);
        this.remove(bccb);
        this.remove(pr);
        this.add(pg);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon bus = new ImageIcon("bus.jpg");

        g.drawImage(bus.getImage(), 0, 0, 1080, 720, null);
    }
}