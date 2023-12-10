package numeros;

import java.awt.*;

public class Numero5 extends Numero{
    public Numero5(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("5", 30, 60);
    }
}
