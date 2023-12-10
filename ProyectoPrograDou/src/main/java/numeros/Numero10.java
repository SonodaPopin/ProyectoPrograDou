package numeros;

import java.awt.*;

public class Numero10 extends Numero {
    public Numero10() {
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("10", 15, 60);
    }
}