package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 25
 */
public class Numero25 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero25(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("25", 15, 60);
    }
}
