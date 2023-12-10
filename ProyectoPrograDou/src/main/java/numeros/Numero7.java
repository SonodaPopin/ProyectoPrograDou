package numeros;

import java.awt.*;

public class Numero7 extends Numero{
    public Numero7(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("7", 30, 60);
    }
}
