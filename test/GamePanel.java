package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.util.*;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private int xPos = 100;
	private int yPos = 630;
	
	
	/*public GamePanel() {
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(new MouseInputs(this));
		addMouseMotionListener(new MouseInputs(this));
	}*/
	
	public void keyInputSetXPos(int changeInX) {
		if(xPos >= 0 && xPos <= 785) {
			this.xPos += changeInX;
		}
		repaint();
	}
	
	public void keyInputSetYPos(int changeInY) {
		this.yPos += changeInY;
		repaint();
	}
	
	public void setXPosition(int xPos) {
		if(xPos >= 0 && xPos <= 785) {
			this.xPos = xPos;
		}
		repaint();
	}
	
	public void setYPosition(int yPos) {
		this.yPos = yPos;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		//This "cleans" the surface, making painting our own objects smoother.
		super.paintComponent(g);
		
		//xPos is the x coordinate on the panel, yPos is the y coordinate on the panel.
		//200 is the width, and 50 is the height.
		g.fillRect(xPos, yPos, 150, 30);
	}

}
