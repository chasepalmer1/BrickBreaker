package test;

import java.awt.Color;
import javax.swing.JFrame;


public class GameFrame extends JFrame {
	public GameFrame(GamePanel g) {
		this.setTitle("Brick Breaker");
		this.setSize(1000, 720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);

        //This is changing the background color of the frame, but because the panel is over the frame, you can't see it.
		this.getContentPane().setBackground(new Color(0, 0, 0));
		
		//This adds the Game Panel to the Frame
		this.add(g);
		
		//This sets the background of the GamePanel to black. I commented it out so I can see the rectangle when I run the program.
		//g.setBackground(Color.black);
		
		//This spawns the frame in the middle of the screen instead of the top left
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
	
}
