package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 23
 */
public class Numero23 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero23(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("23", 15, 60);
    }
}
