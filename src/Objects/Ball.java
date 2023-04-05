package Objects;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Ellipse2D {

    private int x;
    private int y;
    private int width;
    private int height;

    public Ball() {
        x = 20;
        y = 30;
        width = 20;
        height = 20;
    }

    public void spawnBall(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, width, height);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public Rectangle2D getBounds2D() {
        throw new UnsupportedOperationException("Unimplemented method 'getBounds2D'");
    }

    @Override
    public double getWidth() {
       return width;
    }

    @Override
    public double getHeight() {
       return height;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void setFrame(double x, double y, double w, double h) {
        throw new UnsupportedOperationException("Unimplemented method 'setFrame'");
    }

}
