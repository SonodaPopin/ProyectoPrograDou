package numeros;

import java.awt.*;

public class Numero28 extends Numero{
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
