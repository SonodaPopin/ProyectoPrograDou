package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 26
 */
public class Numero26 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero26(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("26", 15, 60);
    }
}
