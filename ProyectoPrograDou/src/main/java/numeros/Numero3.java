package numeros;

import java.awt.*;

public class Numero3 extends Numero{
    public Numero3(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("3", 30, 60);
    }
}
