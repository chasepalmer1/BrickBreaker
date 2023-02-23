import UI.Frame;
import UI.Panel;
import Objects.*;
import java.awt.Graphics;

public class Tester {

    public static void main(String[] args) {
        Panel testingPanel = new Panel();
        Frame testingFrame = new Frame(testingPanel);
            
        //According to the video I watched, this line is to direct your keyboard and mouse inputs to the Game Panel. Without it,
        //your input won't do anything on the screen.
        testingPanel.requestFocus();
    }
}