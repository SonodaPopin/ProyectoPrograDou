package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 6
 */
public class Numero6 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero6(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("6", 30, 60);
    }
}
