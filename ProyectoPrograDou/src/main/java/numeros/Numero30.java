package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 30
 */
public class Numero30 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero30(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("30", 30, 60);
    }
}
