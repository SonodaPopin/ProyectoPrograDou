package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 17
 */
public class Numero17 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero17(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("17", 15, 60);
    }
}
