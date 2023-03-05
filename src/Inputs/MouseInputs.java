package Inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import UI.*;
import Objects.Paddle;

public class MouseInputs implements MouseListener, MouseMotionListener {
	
	private Panel gamePanel;
	private Paddle paddle;
	
	public MouseInputs(Panel gamePanel, Paddle paddle) {
		this.gamePanel = gamePanel;
		this.paddle = paddle;
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
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		paddle.setXPosition(e.getX());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		paddle.setXPosition(e.getX());
		
	}
	
	
}
