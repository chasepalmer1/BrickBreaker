package UI;

import java.awt.*;
import java.util.*;
import Objects.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;
import java.awt.event.KeyEvent;

public class GameOverPanel extends JPanel{

    static int titleX = 105;
    boolean gameStart = false;
    static String title;

    private float opacity = 150;
    private float opacityUpdate = 0.000022f;

    public GameOverPanel() {
        addKeyListener(new KeyboardInputs(this));
        setBackground(Color.BLACK); 
        title = "GAME OVER";
    } //StartUpPanel

    static void setTitleWin() {
        title = "You Win!";
        titleX = 210;
    } 

    public void startGameKey(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                gameStart = true;
                break;
        }
    }

    public boolean getGameStart() {
        return gameStart;
    }
  
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        boolean foundI = false;
        g.setColor(Color.gray);
        g.setFont(new Font ("Monospaced Bold",1,125));
        g.drawString(title,titleX,375);
        /*for (int i = 0; i < title.length(); i++) {
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
                    g.drawString(title.substring(i, i + 1), 80 + (100 * i),  375);
                }
                
            } else {
                g.setColor(Color.gray);
                g.setFont(new Font ("Monospaced Bold",1,125));
                if (foundI) {
                    g.drawString(title.substring(i, i + 1), -25 + (80 * i),  375);
                } else {
                    g.drawString(title.substring(i, i + 1), 80 + (100 * i),  375);
                }
                
            } 
        }*/
        g.setColor(Color.yellow);
        g.setFont(new Font ("Arial", 1, 25));

        g.setColor(new Color(Color.yellow.getRed(), Color.yellow.getGreen(), Color.yellow.getBlue(), (int)(opacity)));
        g.drawString("Press Enter to Start", 375, 475);
    }


    public void updateOpacity() {
        if (opacity < 0) {
            opacity = 0;
            opacityUpdate *= -1;
        } else if (opacity > 150) {
            opacity = 150;
            opacityUpdate *= -1;
        }

        opacity -= opacityUpdate;
    }
}
