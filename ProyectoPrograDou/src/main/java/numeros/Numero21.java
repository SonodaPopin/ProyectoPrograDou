package numeros;

import java.awt.*;
/**
 * Clase que representa el numero 21
 */
public class Numero21 extends Numero{
    /**
     * Método constructor del panel
     */
    public Numero21(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("21", 15, 60);
    }
}
