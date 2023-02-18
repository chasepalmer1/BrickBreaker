package test;

public class Tester {
    public static void main(String[] args) {
        GamePanel testingPanel = new GamePanel();
		GameFrame testingFrame = new GameFrame(testingPanel);
		
		//According to the video I watched, this line is to direct your keyboard and mouse inputs to the Game Panel. Without it,
		//your input won't do anything on the screen.
		testingPanel.requestFocus();
    }
}
