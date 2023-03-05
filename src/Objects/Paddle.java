package Objects;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle {
	
	private int width;
	private int height;
	private int xPos;
	private int yPos;
	private Color myGray = new Color(207, 207, 207);
	
	public Paddle() {
		xPos = 100;
		yPos = 650;
		width = 150;
		height = 30;
	}
	
	public void spawn(Graphics g) {
		g.setColor(myGray);
		g.fillRect(xPos, yPos, width, height);
	}
	
	public void keyInputSetXPos(int changeInX) {
		if(xPos >= 0 && xPos <= 830) {
			this.xPos += changeInX;
		} else if(xPos < 0) {
			this.xPos = 0;
		} else if(xPos > 830) {
			this.xPos = 830;
		}
	}
	
	public void keyInputSetYPos(int changeInY) {
		this.yPos += changeInY;
	}
	
	public void setXPosition(int xPos) {
		if(xPos >= 0 && xPos <= 830) {
			this.xPos = xPos;
		}
	}
	
	public void setYPosition(int yPos) {
		this.yPos = yPos;
	}
}

