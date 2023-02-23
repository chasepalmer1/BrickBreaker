package Objects;

import Objects.Brick;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class BrickArray {
    
    private Brick[][] brickArray = new Brick[5][10];

    public BrickArray() {
		for (int i = 0; i < brickArray.length; i++) {
            int brickX = 20;
		    int brickY = 10 + (36 * i);
			    for (int j = 0; j < brickArray[i].length; j++) {
				    brickArray[i][j] = new Brick(brickX, brickY, 95, 35, i, j);
                    brickX += 96;
			    }
        }
    }

    public int getLength() {
        return brickArray.length;
    }

    public Brick getBrick(int i, int j) {
        return brickArray[i][j];
    }

}