package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 11
 */
public class Numero11 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero11(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("11", 15, 60);
    }
}
