package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 13
 */
public class Numero13 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero13(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("13", 15, 60);
    }
}
