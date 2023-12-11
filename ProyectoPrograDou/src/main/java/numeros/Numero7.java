package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 7
 */
public class Numero7 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero7(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("7", 30, 60);
    }
}
