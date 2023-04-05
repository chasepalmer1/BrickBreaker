package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import UI.*;


public class KeyboardInputs implements KeyListener {
	
	private StartUpPanel startUp;
	private Panel gamePanel;
	
	public KeyboardInputs (Panel gamePanel) {
		this.gamePanel = gamePanel;
	}

	public KeyboardInputs (StartUpPanel startUp) {
		this.startUp = startUp;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
			case KeyEvent.VK_RIGHT:
				gamePanel.getPaddle().setRight(true);
				break;
			case KeyEvent.VK_LEFT:
				gamePanel.getPaddle().setLeft(true);
				break;
			case KeyEvent.VK_A:
				gamePanel.getPaddle().setLeft(true);
				break;
			case KeyEvent.VK_D:
				gamePanel.getPaddle().setRight(true);
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_RIGHT:
				gamePanel.getPaddle().setRight(false);
				break;
			case KeyEvent.VK_LEFT:
				gamePanel.getPaddle().setLeft(false);
				break;
			case KeyEvent.VK_A:
				gamePanel.getPaddle().setLeft(false);
				break;
			case KeyEvent.VK_D:
				gamePanel.getPaddle().setRight(false);
				break;
		}
	}
	
}