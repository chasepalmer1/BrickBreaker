public class Driver {
        
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