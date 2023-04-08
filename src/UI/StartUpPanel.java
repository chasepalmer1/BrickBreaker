package UI;

import java.awt.*;
import java.util.*;
import Objects.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;
import java.awt.event.KeyEvent;
import Objects.Paddle;
import Objects.BrickArray;

public class StartUpPanel extends JPanel {

    BrickArray brickArray = new BrickArray();
    Paddle paddle = new Paddle();
    boolean gameStart = false;

    private float opacity = 68;
    private float opacityUpdate = 0.0000088f;

    public StartUpPanel() {
        addKeyListener(new KeyboardInputs(this));
        setBackground(Color.BLACK);    
    } //StartUpPanel

    public void startGameKey(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                gameStart = true;
                break;
        }
    }

    public void updateOpacity() {
        if (opacity < 0) {
            opacity = 0;
            opacityUpdate *= -1;
        } else if (opacity > 68) {
            System.out.println("Updated Opacity");
            opacity = 68;
            opacityUpdate *= -1;
        }

        opacity -= opacityUpdate;
    }

    public boolean getGameStart() {
        return gameStart; 
    }

    public void setGameStart(boolean b) {
        gameStart = b;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); 
        String title = "BRICKBREAKER";
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

            g.setColor(new Color(Color.yellow.getRed(), Color.yellow.getGreen(), Color.yellow.getBlue(), (int)(opacity)));
            g.drawString("Press Enter to Start", 375, 475);

            brickArray.spawnBricks(g);
            paddle.draw(g);
        }
        
    } //painComponent

}
