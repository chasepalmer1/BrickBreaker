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
	Paddle paddle = new Paddle();
	Ball ball = new Ball();
	
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
		
		paddle.spawn(g);

		brickArray1.spawnBricks(g);

		ball.spawnBall(g);

		g.setColor(Color.WHITE);
		g.setFont(new Font ("Monospaced Bold",1,20));
		g.drawString("Score: " + score, 20, 20);

	}

	//HELPER METHOD FOR CHECK BRICK COLLISION.  Only used for readability
	private Brick getBrickAt(int i, int j) {
		return brickArray1.getBrick(i,j);
	}

	public void checkBrickCollision() {
		for(int i = 0; i < brickArray1.getLength(); i++) {
			for (int j = 0; j < brickArray1.getWidth(i); j++) {
				if ((getBrickAt(i,j) != null) && ball.intersects(getBrickAt(i,j))) {
					brickArray1.removeBrick(i,j);
					setScore(getScore() + 5);
					ball.setXSpeed(ball.getXSpeed() * -1);
					ball.setYSpeed(ball.getYSpeed() * -1);
				}
			}
		}
	}

	public void moveBallPanel() {
		ball.moveBall();
	}

}