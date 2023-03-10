package test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class KeyboardInputs implements KeyListener {
	
	private GamePanel gamePanel;
	
	public KeyboardInputs (GamePanel gamePanel) {
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
			gamePanel.keyInputSetXPos(-20);
			break;
		case KeyEvent.VK_D:
			gamePanel.keyInputSetXPos(20);
			break;
		case KeyEvent.VK_RIGHT:
			gamePanel.keyInputSetXPos(20);
			break;
		case KeyEvent.VK_LEFT:
			gamePanel.keyInputSetXPos(-20);
			break;
		}
			
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
