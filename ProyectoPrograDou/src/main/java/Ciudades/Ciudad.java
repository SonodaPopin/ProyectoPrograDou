package Ciudades;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa un panel con el nombre de una ciudad disponible para viajar
 */
public abstract class Ciudad extends JPanel{
    /**
     * Método constructor del panel
     */
    public Ciudad(){
        this.setBounds(210,0,280,60);
        this.setBackground(Color.BLACK);
    }
}