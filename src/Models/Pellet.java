package Models;

import java.awt.Color;
import java.awt.Graphics2D;
import SwingShapes.Rectangle;

public class Pellet {
	private Rectangle pellet;
	
	public Pellet() {
		pellet = new Rectangle();
		pellet.setColor(Color.red);
		pellet.setSize(20, 20);
	}
	
	public int getXLocation() {
		return pellet.getXLocation();
	}

	public void setXLocation(int locationX) {
		pellet.setLocation(locationX, pellet.getYLocation());
	}

	public int getYLocation() {
		return pellet.getYLocation();
	}

	public void setYLocation(int locationY) {
		pellet.setLocation(pellet.getXLocation(), locationY);
	}	
	
	public void draw(Graphics2D g) {
		pellet.paint(g);
	}
}
