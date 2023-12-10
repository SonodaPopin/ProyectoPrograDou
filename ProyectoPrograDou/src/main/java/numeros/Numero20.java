package numeros;

import java.awt.*;

public class Numero20 extends Numero{
    public Numero20(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("20", 15, 60);
    }
}
