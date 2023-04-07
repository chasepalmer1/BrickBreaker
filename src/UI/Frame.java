package UI;

import javax.swing.JFrame;
import java.awt.Color;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class Frame extends JFrame {

	public CardLayout card = new CardLayout();

	public JPanel container = new JPanel();
	public StartUpPanel startUp;
	public Panel gamePanel;
	public GameOverPanel endPanel;

    public Frame(StartUpPanel startUp, Panel gamePanel, GameOverPanel endPanel) {
		this.startUp = startUp;
		this.gamePanel = gamePanel;
		this.endPanel = endPanel;

		container.setLayout(card);
		
		this.setUp();

		container.add(startUp, "2");
		container.add(gamePanel, "3");
		container.add(endPanel, "4");

		card.show(container, "1");

		this.add(container);
        //This is changing the background color of the frame, but because the panel is over the frame, you can't see it.
		this.getContentPane().setBackground(new Color(0, 0, 0));
		
		//This adds the Game Panel or StartUpPanel to the Frame
		
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

	public void startGame() {
		card.show(container, "" + 3);
	}

	public void endGame() {
		card.show(container, "" + 4);
	}
}