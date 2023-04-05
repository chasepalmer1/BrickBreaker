package UI;

public class StartUpTester {

    private Frame startUpFrame;
    private StartUpPanel startUpPanel;

    public StartUpTester() {
        startUpPanel = new StartUpPanel();
        startUpFrame = new Frame(startUpPanel);
    } //startUp


    public static void main(String[] args) {
       StartUpTester sut = new StartUpTester();
       
    }
}
