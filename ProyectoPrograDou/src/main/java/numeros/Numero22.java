package numeros;


import java.awt.*;

public class Numero22 extends Numero{
    public Numero22(){
    	super();

    }

    @Override
    protected void dibujarNumero(Graphics g) {
        g.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("22", 15, 60);
    }
}