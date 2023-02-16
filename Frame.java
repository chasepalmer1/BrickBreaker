import javax.swing.JFrame;
import java.awt.Color;

public class Frame extends JFrame {

    Frame() {
    this.setTitle("Brick Breaker");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setSize(1000,720);
    this.setResizable(false);
    this.getContentPane().setBackground(new Color(000000));
    }

}