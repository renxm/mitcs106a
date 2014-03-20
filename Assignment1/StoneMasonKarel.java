/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

// You fill in this part
  public void run() {
    turnLeft();
    fixOneColumn();
    turnRight();
    while(frontIsClear()) {
      positionNextColumn();
      fixOneColumn();
      turnEast();
    }
  }

  private void turnEast() {
    if(facingSouth())
      turnLeft();
    else if(facingNorth())
      turnRight();
    else if(facingWest())
      turnAround();
  }

  private void positionNextColumn() {
    move();
    move();
    move();
    move();
    if(rightIsClear())
      turnRight();
    else {
      turnLeft();
    }
  }

  private void fixOneColumn() {
    while(frontIsClear()) {
      if(!beepersPresent()) {
        putBeeper();
      }
      move();
    }
    if(!beepersPresent()) {
      putBeeper();
    }
  }
}
