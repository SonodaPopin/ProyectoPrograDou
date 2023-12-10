package numeros;

import java.awt.*;

public class Numero31 extends Numero{
    public Numero31(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("31", 15, 60);
    }
}
