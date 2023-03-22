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
    private int xSpeed = 1;
    private int ySpeed = -1;

    public Ball() {
        x = 500;
        y = 360;
        width = 20;
        height = 20;
    }

    public void spawnBall(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, width, height);
    }

    public void moveBall() {
        x += xSpeed;
        y += ySpeed;
        if (x < 0) {
            xSpeed = xSpeed * -1;
        }
        if (y < 0) {
            ySpeed = ySpeed * -1;
        }
        if (y > 720) {
            ySpeed = ySpeed * -1;
        }
        if (x > 1000) {
            xSpeed = xSpeed * -1;
        }
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
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
