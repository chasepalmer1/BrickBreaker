package UI;

import java.awt.*;
import java.util.*;
import Objects.BrickArray;
import Objects.Brick;
import javax.swing.JPanel;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

public class Panel extends JPanel {
	
	private int xPos = 100;
	private int yPos = 630;
	BrickArray brickArray1 = new BrickArray();
	
	public Panel() {
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(new MouseInputs(this));
		addMouseMotionListener(new MouseInputs(this));
		setBackground(Color.BLACK);
	}
	
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
		g.setColor(Color.gray);
		g.fillRect(xPos, yPos, 150, 30);

		for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
				g.setColor(Color.green);
       	 		g.fillRect((int)brickArray1.getBrick(i,j).getX(),(int)brickArray1.getBrick(i,j).getY(),
					(int)brickArray1.getBrick(i,j).getWidth(),(int)brickArray1.getBrick(i,j).getHeight());
            }
        }
	}

}