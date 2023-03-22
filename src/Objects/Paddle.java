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
	private boolean right, left;

	public static final int LEFT = 0;
	public static final int RIGHT = 1;
	
	public Paddle() {
		xPos = 100;
		yPos = 650;
		width = 150;
		height = 30;
		right = false;
		left = false;
	}
	
	
	public void draw(Graphics g) {
		g.setColor(myGray);
		g.fillRect(xPos, yPos, width, height);
	}

	
	public void updatePos() {
		if(left && !right) {
			xPos -= 2.0f;
		} else if (right && !left) {
			xPos += 2.0f;
		}
	}


	public void setRight(boolean right) {
		this.right = right;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}
}

