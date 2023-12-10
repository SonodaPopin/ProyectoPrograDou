package numeros;

import java.awt.*;

public class Numero29 extends Numero {
    public Numero29(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("29", 15, 60);
    }
}
