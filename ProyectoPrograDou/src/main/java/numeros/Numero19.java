package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 19
 */
public class Numero19 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero19(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("19", 15, 60);
    }
}
