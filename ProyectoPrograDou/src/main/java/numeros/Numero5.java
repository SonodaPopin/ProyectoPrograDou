package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 5
 */
public class Numero5 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero5(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("5", 30, 60);
    }
}
