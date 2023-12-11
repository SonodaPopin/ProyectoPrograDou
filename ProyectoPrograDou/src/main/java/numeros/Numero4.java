package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 4
 */
public class Numero4 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero4(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("4", 30, 60);
    }
}
