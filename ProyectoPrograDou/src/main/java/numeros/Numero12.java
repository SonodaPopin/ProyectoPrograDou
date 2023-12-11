package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 12
 */
public class Numero12 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero12(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("12", 15, 60);
    }
}
