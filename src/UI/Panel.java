package UI;

import java.awt.*;
import java.util.*;
import Objects.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

public class Panel extends JPanel {

	private int score = 0;
	
	BrickArray brickArray1 = new BrickArray();
	private Paddle paddle = new Paddle();
	
	public Panel() {
		addKeyListener(new KeyboardInputs(this, paddle));
		setBackground(Color.BLACK);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void paintComponent(Graphics g) {
		//This "cleans" the surface, making painting our own objects smoother.
		super.paintComponent(g);
		
		g.setColor(Color.gray);
		paddle.spawn(g);

		brickArray1.spawnBricks(g);

		g.setColor(Color.BLUE);
		g.fillOval(500, 360, 20, 20);

		g.setColor(Color.WHITE);
		g.setFont(new Font ("Monospaced Bold",1,20));
		g.drawString("Score: " + score, 20, 20);

	}

}