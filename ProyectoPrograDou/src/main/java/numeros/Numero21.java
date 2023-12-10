package numeros;

import java.awt.*;

public class Numero21 extends Numero{
    public Numero21(){
        super();
    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("21", 15, 60);
    }
}
