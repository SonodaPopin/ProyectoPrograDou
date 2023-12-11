package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 27
 */
public class Numero27 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero27(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("27", 15, 60);
    }
}
