package numeros;

import java.awt.*;

public class Numero18 extends Numero{
    public Numero18(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("18", 15, 60);
    }
}
