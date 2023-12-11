package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 9
 */
public class Numero9 extends Numero{
/**
 * Método constructor del panel
 */
    public Numero9(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("9", 30, 60);
    }
}
