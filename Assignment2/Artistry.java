/*
 * File: Artistry.java
 * Name:
 * Section Leader:
 * ==========================================================
 * Replace these comments with a description of your program.
 * Since this program is more freeform than the rest, tell us
 * a bit about it in these comments!
 */
import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Artistry extends GraphicsProgram {
  // The size of the sun
  private static final double SUN_SIZE = 100;
  
  // The height of the lawn
  private static final double LAWN_HEIGHT = 160;
  
  // The width of the house
  private static final double HOUSE_WIDTH = 300;
  
  // The height of the house
  private static final double HOUSE_HEIGHT = 200;
    
  // The height of the roof
  private static final double ROOF_HEIGHT = 100;
  
  // The width of the roof 
  private static final double ROOF_WIDTH = 400;
  
  // The width of the door
  private static final double DOOR_WIDTH = 60;
  
  // The height of the door
  private static final double DOOR_HEIGHT = 100;
  
  // The size of the window
  private static final double WINDOW_SIZE = 100;
    
  public void run() {
    /*
     * You fill this in. Remember that you must have
     * 
     * 1. At least one filled object, 2. At least two different colors of
     * objects, and 3. At least three different types of objects (not counting
     * the GLabel you use to sign your name).
     * 
     * Also, be sure to sign your name in the bottom-right corner of the canvas.
     * Your name should be flush up against the bottom-right corner of the
     * label. We recommend looking at the getDescent() method as a means for
     * calculating where to position the label.
     */
    
    getGCanvas().setBackground(Color.BLUE);
    
    GOval sun = new GOval(50, 50, SUN_SIZE, SUN_SIZE);
    sun.setFilled(true);
    sun.setColor(Color.YELLOW);
    add(sun);
    
    GRect lawn = new GRect(0, getHeight() - LAWN_HEIGHT, getWidth(), LAWN_HEIGHT);
    lawn.setFilled(true);
    lawn.setColor(Color.GREEN);
    add(lawn);
    
    GRect house = new GRect(getWidth()/2.0 - HOUSE_WIDTH/2.0, getHeight() - LAWN_HEIGHT/2.0 - HOUSE_HEIGHT, HOUSE_WIDTH, HOUSE_HEIGHT);
    house.setFilled(true);
    house.setColor(Color.GRAY);
    add(house);
    
    GPoint[] vertexes = {new GPoint(getWidth()/2.0, house.getY() - ROOF_HEIGHT), new GPoint(getWidth()/2.0 + ROOF_WIDTH/2.0, house.getY()), new GPoint(getWidth()/2.0 - ROOF_WIDTH/2.0, house.getY())}; 
    GPolygon roof = new GPolygon(vertexes);
    roof.setFilled(true);
    roof.setColor(Color.DARK_GRAY);
    add(roof);
    
    GRect door = new GRect(house.getX() + house.getWidth()/6.0, house.getY() + house.getHeight() - DOOR_HEIGHT, DOOR_WIDTH, DOOR_HEIGHT);
    door.setFilled(true);
    door.setColor(Color.RED);
    add(door);
    
    GRect window = new GRect(house.getX() + house.getWidth()/2.0, house.getY() + house.getHeight()/4.0, WINDOW_SIZE, WINDOW_SIZE);
    window.setFilled(true);
    window.setColor(Color.WHITE);
    add(window);
    
    GLabel sign = new GLabel("Artistry by renxm");
    sign.setLocation(getWidth() - sign.getWidth(), getHeight());
    add(sign);
  }
}
