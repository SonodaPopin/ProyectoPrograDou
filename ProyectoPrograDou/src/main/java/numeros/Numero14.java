package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 14
 */
public class Numero14 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero14(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("14", 15, 60);
    }
}
