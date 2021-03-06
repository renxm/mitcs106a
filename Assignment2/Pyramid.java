/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

  /** Width of each brick in pixels */
  private static final int BRICK_WIDTH = 30;

  /** Height of each brick in pixels */
  private static final int BRICK_HEIGHT = 16;

  /** Number of bricks in the base of the pyramid */
  private static final int BRICKS_IN_BASE = 21;

  public void run() {
    /* You fill this in. */
    for(int i=BRICKS_IN_BASE; i>0; i--) {
      for(int j=0; j<i; j++) {
        GRect brick = new GRect(getWidth()/2.0 - (BRICK_WIDTH * i)/2.0 + BRICK_WIDTH * j, getHeight() - BRICK_HEIGHT * (BRICKS_IN_BASE - i + 1), BRICK_WIDTH, BRICK_HEIGHT);
        brick.setColor(Color.BLACK);
        add(brick);
      }
    }
  }
}

