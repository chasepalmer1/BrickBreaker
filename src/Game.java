import UI.*;

public class Game implements Runnable {
	
	private Frame gameFrame;
	private Panel gamePanel;

	//The video I watched described threads as opening another lane on a highway to help with traffic.
	//So, the computer isn't running everything on the same thread, which helps it run smoother.
	private Thread gameThread;

	//The desired number of frames per second.
	private final int FPS_SET = 120;

	//Counting the number of frames.
	private int frames = 0;

	//The time stamp of the last FPS check.
	private long lastCheck = 0;
	
	public Game() {
		gamePanel = new Panel();
	    gameFrame = new Frame(gamePanel);
	          
	    //According to the video I watched, this line is to direct your keyboard and mouse inputs to the Game Panel. Without it,
	    //your input won't do anything on the screen.
	    gamePanel.requestFocus();
	      
	    startGameLoop();
	}
	
	private void startGameLoop() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		
		double timePerFrame = (1_000_000_000.0 / FPS_SET);
		long lastFrame = System.nanoTime();
		long now = System.nanoTime();
		
		while(true) {
			now = System.nanoTime();
			
			if (System.currentTimeMillis() - lastCheck >= 1000) {
				lastCheck = System.currentTimeMillis();
				System.out.println("FPS: " + frames);
				frames = 0;
			}
			
			//If the current time minus the last time a frame was painted is greater than the 120 FPS interval we want,
			//then it will paint another frame.
			if ((now - lastFrame) >= timePerFrame) {
				gamePanel.repaint();
				lastFrame = now;
				frames++;
			}

			gamePanel.checkBrickCollision();

		}
		
	}
	
}

