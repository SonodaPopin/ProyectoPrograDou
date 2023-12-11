package numeros;

import java.awt.*;

/**
 * Clase que representa el numero 1
 */
public class Numero1 extends Numero{
    /**
     * Método constructor del panel
     */
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