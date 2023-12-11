package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 28
 */
public class Numero28 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero28(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("28", 15, 60);
    }
}
