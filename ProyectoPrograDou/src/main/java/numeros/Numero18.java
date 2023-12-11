package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 18
 */
public class Numero18 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero18(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("18", 15, 60);
    }
}
