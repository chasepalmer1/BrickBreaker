import UI.Frame;
import UI.Panel;
import Objects.*;
import java.awt.Graphics;

public class Tester {

    static boolean newGame = false;
    public static void main(String[] args) {
        
        runGame();

        while (true) {
            while (newGame) {
                runGame();
                setNewGame(false);
            }
        }
    }

    public static void setNewGame(boolean b) {
        newGame = b;
    }

    public static boolean runGame() {
        Game game = new Game();
        return true;
    }

}