package numeros;

import java.awt.*;

public class Numero14 extends Numero{
    public Numero14(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("14", 15, 60);
    }
}
