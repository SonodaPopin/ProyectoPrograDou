package numeros;

import java.awt.*;

public class Numero16 extends Numero{
    public Numero16(){
        super();
    }
    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("16", 15, 60);
    }
}
