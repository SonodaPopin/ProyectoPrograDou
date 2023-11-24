package numeros;

import java.awt.*;

public class Numero27 extends Numero{
    public Numero27(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("27", 15, 60);
    }
}
