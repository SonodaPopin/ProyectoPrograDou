package GUI;

import javax.swing.*;

public class Ventana extends JFrame{
    public Ventana() {
        super();

        this.setLayout(null);
        this.setTitle("BusesDou");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
    }
}
