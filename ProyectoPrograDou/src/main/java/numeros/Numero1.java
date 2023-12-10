package numeros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Numero1 extends Numero{
    public Numero1(){
    	super();

    }
    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("1", 30, 60);
    }
}