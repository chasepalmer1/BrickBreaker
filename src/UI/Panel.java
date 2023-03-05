package UI;

import java.awt.*;
import java.util.*;
import Objects.*;
import javax.swing.JPanel;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

public class Panel extends JPanel {
	
	BrickArray brickArray1 = new BrickArray();
	private Paddle paddle = new Paddle();
	
	public Panel() {
		addKeyListener(new KeyboardInputs(this, paddle));
		addMouseListener(new MouseInputs(this, paddle));
		addMouseMotionListener(new MouseInputs(this, paddle));
		setBackground(Color.BLACK);
	}
	
	public void paintComponent(Graphics g) {
		//This "cleans" the surface, making painting our own objects smoother.
		super.paintComponent(g);
		
		g.setColor(Color.gray);
		paddle.spawn(g);

		brickArray1.spawnBricks(g);
	}

}