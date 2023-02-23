package Objects;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Brick extends Rectangle {

    private int brickRow;
    private int brickColumn;

    public Brick (int x, int y, int width, int height, int brickRow, int brickColumn) {
        super(x, y, width, height);
        this.brickRow = brickRow;
        this.brickColumn = brickColumn;
    }

    public int getRow() {
        return brickRow;
    }

    public int getCol() {
        return brickColumn;
    }

} // Brick