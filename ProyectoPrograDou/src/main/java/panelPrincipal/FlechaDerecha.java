package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlechaDerecha extends JPanel implements MouseListener{
    FlechaDerecha(){
        this.setBounds(150,0,60,60);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.addMouseListener(this);
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
        this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		this.setBorder(BorderFactory.createEmptyBorder());
	}
}
