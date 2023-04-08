import java.awt.desktop.SystemSleepListener;
import Objects.Ball;
import UI.*;
import test.GameFrame;

public class Game implements Runnable {
	
	private Frame gameFrame;
	private Panel gamePanel;
	private StartUpPanel startPanel;
	private GameOverPanel endPanel;

	//The video I watched described threads as opening another lane on a highway to help with traffic.
	//So, the computer isn't running everything on the same thread, which helps it run smoother.
	private Thread gameThread;

	//The desired number of frames per second.
	private final int FPS_SET = 120;
	private final int UPS_SET = 200;
	private final int OPACITY_UPDATE = 200;

	//Counting the number of frames.
	private int frames = 0;
	private int updates = 0;

	//The time stamp of the last FPS check.
	private long lastCheck = 0;
	
	public Game() {
		startPanel = new StartUpPanel();
		endPanel = new GameOverPanel();
		gamePanel = new Panel();
	    gameFrame = new Frame(startPanel, gamePanel, endPanel);
	    startPanel.requestFocus();
		start();
	}

	private void end() {
		gameFrame.endGame();
		endPanel.requestFocus();
		long last = System.currentTimeMillis();
		while(!endPanel.getGameStart()) {
			if (System.currentTimeMillis() - last >= 1000) {
				last = System.currentTimeMillis();
				System.out.println("Check");
			}
		}
		gameFrame.dispose();
		Tester.setNewGame(true);
	}

	private void start() {
		long last = System.currentTimeMillis();
		long now = System.nanoTime();
		long lastOpacityUpdate = System.nanoTime();

		while (!startPanel.getGameStart()) {
			now = System.nanoTime();

			if (System.currentTimeMillis() - last >= 1000) {
				last = System.currentTimeMillis();
				System.out.println("Check");
			}

			if(now - lastOpacityUpdate >= OPACITY_UPDATE) {
				lastOpacityUpdate = now;
				startPanel.updateOpacity();
				startPanel.repaint();
			}
		}
		startGameLoop();
	}
	
	private void startGameLoop() {
		gameFrame.startGame();
		//According to the video I watched, this line is to direct your keyboard and mouse inputs to the Game Panel. Without it,
	    //your input won't do anything on the screen.
		gamePanel.requestFocus();
		gameThread = new Thread(this);
		gameThread.setDaemon(true);
		gameThread.start();
	}
	
	@Override
	public void run() {
		
		double timePerFrame = (1_000_000_000.0 / FPS_SET);
		double timePerUpdate = (1_000_000_000.0 / UPS_SET);
		long lastFrame = System.nanoTime();
		long lastUpdate = System.nanoTime();
		long now = System.nanoTime();
		
		while(!gamePanel.getGameOver()) {
			now = System.nanoTime();
			
			if (System.currentTimeMillis() - lastCheck >= 1000) {
				lastCheck = System.currentTimeMillis();
				System.out.println("FPS: " + frames + " | UPS: " + updates);
				frames = 0;
				updates = 0;
			}
			
			//If the current time minus the last time a frame was painted is greater than the 120 FPS interval we want,
			//then it will paint another frame.
			if ((now - lastFrame) >= timePerFrame) {
				gamePanel.repaint();
				lastFrame = now;
				frames++;
			}
			
			if((now - lastUpdate) >= timePerUpdate) {
				gamePanel.update();
				lastUpdate = now;
				updates++;
			}

		}

		end();
		
	}
	
}

