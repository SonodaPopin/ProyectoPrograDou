package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 29
 */
public class Numero29 extends Numero {
    /**
     * Método constructor del panel
     */
    public Numero29(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("29", 15, 60);
    }
}
