package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import UI.*;
import Objects.Paddle;


public class KeyboardInputs implements KeyListener {
	
	private Panel gamePanel;
	private Paddle paddle;
	
	public KeyboardInputs (Panel gamePanel, Paddle paddle) {
		this.gamePanel = gamePanel;
		this.paddle = paddle;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_A:
			paddle.keyInputSetXPos(-20);
			break;
		case KeyEvent.VK_D:
			paddle.keyInputSetXPos(20);
			break;
		case KeyEvent.VK_RIGHT:
			paddle.keyInputSetXPos(20);
			break;
		case KeyEvent.VK_LEFT:
			paddle.keyInputSetXPos(-20);
			break;
		}
			
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}