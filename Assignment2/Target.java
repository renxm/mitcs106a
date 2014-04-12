/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
  
  //radiuses
  private static final double RADIUS_OUTER = 72;
  private static final double RADIUS_MEDIA = 72 * 0.65;
  private static final double RADIUS_INNER = 72 * 0.3;
  
  public void run() {
    /* You fill this in. */
    GOval outer = new GOval(getWidth()/2.0 - RADIUS_OUTER, getHeight()/2.0 - RADIUS_OUTER, RADIUS_OUTER * 2, RADIUS_OUTER * 2);
    outer.setFilled(true);
    outer.setColor(Color.RED);
    add(outer);
    
    GOval media = new GOval(getWidth()/2.0 - RADIUS_MEDIA, getHeight()/2.0 - RADIUS_MEDIA, RADIUS_MEDIA * 2, RADIUS_MEDIA * 2);
    media.setFilled(true);
    media.setColor(Color.WHITE);
    add(media);
    
    GOval inner = new GOval(getWidth()/2.0 - RADIUS_INNER, getHeight()/2.0 - RADIUS_INNER, RADIUS_INNER * 2, RADIUS_INNER * 2);
    inner.setFilled(true);
    inner.setColor(Color.RED);
    add(inner);
  }
}
