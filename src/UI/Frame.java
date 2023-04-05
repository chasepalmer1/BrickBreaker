package UI;

import javax.swing.JFrame;
import java.awt.Color;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;
import javax.swing.JPanel;

public class Frame extends JFrame {

    public Frame(JPanel jpanel) {
		this.setUp();

        //This is changing the background color of the frame, but because the panel is over the frame, you can't see it.
		this.getContentPane().setBackground(new Color(0, 0, 0));
		
		//This adds the Game Panel or StartUpPanel to the Frame
		this.add(jpanel);
		
		//This sets the background of the GamePanel to black. I commented it out so I can see the rectangle when I run the program.
		//g.setBackground(Color.black);
		
		//This spawns the frame in the middle of the screen instead of the top left
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
	
	//This is a helper method that sets up both the game frame and startup frame. 
	private void setUp() {
		this.setTitle("Brick Breaker");
		this.setSize(1000, 720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
	}

}