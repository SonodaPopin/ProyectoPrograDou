package numeros;

import java.awt.*;

public class Numero13 extends Numero{
    public Numero13(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("13", 15, 60);
    }
}
