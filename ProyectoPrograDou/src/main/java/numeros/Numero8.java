package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 8
 */
public class Numero8 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero8(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("8", 30, 60);
    }
}
