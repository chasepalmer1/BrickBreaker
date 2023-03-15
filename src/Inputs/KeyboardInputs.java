package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import UI.*;


public class KeyboardInputs implements KeyListener {
	
	private Panel gamePanel;
	
	public KeyboardInputs (Panel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_A:
			gamePanel.paddleKeyboard(-20);
			break;
		case KeyEvent.VK_D:
			gamePanel.paddleKeyboard(20);
			break;
		case KeyEvent.VK_RIGHT:
			gamePanel.paddleKeyboard(20);
			break;
		case KeyEvent.VK_LEFT:
			gamePanel.paddleKeyboard(-20);
			break;
		}
			
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}