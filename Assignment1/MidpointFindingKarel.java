/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

// You fill in this part
  public void run() {
    paveDiagonal();
    crossToWestWall();
    searchDiagonal();
    moveToMidBottom();
    putBeeper();
    moveToLeftBottom();
    cleanDiagonal();
    backToMidBottom();
  }

  private void backToMidBottom() {
    turnRight();
    while(frontIsClear())
      move();
    turnRight();
    while(noBeepersPresent())
      move();
  }

  private void cleanDiagonal() {
    turnAround();
    pickBeeper();
    while(frontIsClear()) {
      move();
      turnLeft();
      move();
      turnRight();
      pickBeeper();
    }
  }

  private void moveToLeftBottom() {
    turnRight();
    while(frontIsClear())
      move();
  }

  //Move to bottom from diagonal mid
  private void moveToMidBottom() {
    if(facingEast())
      turnRight();
    while (frontIsClear()) 
      move();
  }

  //Search beeper on diagonal from left wall to right bottom
  private void searchDiagonal() {
    turnLeft();
    while(noBeepersPresent()) {      
      move();
      if(facingSouth())
        turnLeft();
      else if(facingEast())
        turnRight();
    }
  }

  //From right wall to left wall
  private void crossToWestWall() {
    turnAround();
    while(frontIsClear())
      move();
  }

  //Put beepers on diagonal from left-bottom to right wall
  private void paveDiagonal() {
    putBeeper();
    while(frontIsClear()) {
      move();
      turnLeft();
      move();
      turnRight();
      putBeeper();
    }
  }
}
