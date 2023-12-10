package numeros;

import java.awt.*;

public class Numero24 extends Numero{
    public Numero24(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("24", 15, 60);
    }
}
