package numeros;


import java.awt.*;
/**
 * Clase que representa el numero 22
 */
public class Numero22 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero22(){
    	super();

    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("22", 15, 60);
    }
}