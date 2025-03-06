package Models;

import java.awt.Color;
import java.awt.Graphics2D;

import SwingShapes.Rectangle; // Importing Rectangle instead of Ellipse
import SwingShapes.RectangleShape;

public class Segment {
    private Rectangle segment; // Change type to Rectangle
        
    public Segment(int startXLocation, int startYLocation, Color color) {
        segment = new Rectangle(); // Initialize as a Rectangle
        segment.setColor(color);
        segment.setSize(20, 20);
        segment.setLocation(startXLocation, startYLocation);
    }

    public int getXLocation() {
        return segment.getXLocation();
    }

    public int getYLocation() {
        return segment.getYLocation();
    }

    public void setColor(Color color) {
        segment.setColor(color);
    }

    public void draw(Graphics2D g) {
        segment.paint(g);
    }
}