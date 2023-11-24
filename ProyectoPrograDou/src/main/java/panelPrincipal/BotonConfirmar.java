package panelPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonConfirmar extends JPanel implements MouseListener{
	PanelPrincipal pp;
    BotonConfirmar(PanelPrincipal pp){
    	this.pp = pp;
        this.setBounds(50,400,300,100);
        this.setBackground(Color.GREEN);
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}