package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import UI.*;


public class KeyboardInputs implements KeyListener {
	
	private StartUpPanel startUp;
	private Panel gamePanel;
	private GameOverPanel endPanel;
	private int typePanel = 0;
	
	public KeyboardInputs (Panel gamePanel) {
		this.gamePanel = gamePanel;
		typePanel = 2;
	}

	public KeyboardInputs (StartUpPanel startUp) {
		this.startUp = startUp;
		typePanel = 1;
	}

	public KeyboardInputs (GameOverPanel endPanel) {
		this.endPanel = endPanel;
		typePanel = 3;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (typePanel == 1) {
			startUp.startGameKey(e);
		}
		if (typePanel == 2) {
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
		if (typePanel == 3) {
			endPanel.startGameKey(e);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (typePanel == 2) {
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
	
}