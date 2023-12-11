package numeros;


import java.awt.*;

/**
 * Clase que representa el numero 2
 */
public class Numero2 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero2(){
    	super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("2", 30, 60);
    }
}