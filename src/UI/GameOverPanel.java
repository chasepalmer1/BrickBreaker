package UI;

import java.awt.*;
import java.util.*;
import Objects.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;
import java.awt.event.KeyEvent;

public class GameOverPanel extends StartUpPanel{

    public GameOverPanel() {
       super();  
    } //StartUpPanel

  
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        String title = "GAMEOVER";
        boolean foundI = false;
        for (int i = 0; i < title.length(); i++) {
            String lastLetter = "";
            if (i != 0) {
                lastLetter = title.substring(i - 1, i);
             }
           if (lastLetter.equals("I")) {
                foundI = true; 
           }
            if (i % 2 == 0) {
                g.setColor(Color.white);
                g.setFont(new Font ("Monospaced Bold",1,125));
                if (foundI) {
                    g.drawString(title.substring(i, i + 1), -25 + (80 * i),  375);
                } else {
                    g.drawString(title.substring(i, i + 1), 25 + (80 * i),  375);
                }
                
            } else {
                g.setColor(Color.gray);
                g.setFont(new Font ("Monospaced Bold",1,125));
                if (foundI) {
                    g.drawString(title.substring(i, i + 1), -25 + (80* i),  375);
                } else {
                    g.drawString(title.substring(i, i + 1), 25 + (80* i),  375);
                }
                
            }
            g.setColor(Color.yellow);
            g.setFont(new Font ("Arial", 1, 25));
            g.drawString("Press Enter to Start", 375, 475);
        }
}
