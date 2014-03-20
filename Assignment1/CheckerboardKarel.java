/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

  //Our robot goes a snake-like way to traverse all the board
  public void run() {
    
    while(!isDone()) {
      putBeeper();
      jump();
    }
  }

  //If the forward way is blocked, then this job is done. 
  private boolean isDone() {
    if(frontIsBlocked())
      if(facingNorth()) {
        return true;
      } else if(facingEast()) {
        if(leftIsBlocked()) {
          putBeeper();
          turnLeft();
          return true;
        }
      }
      else if(facingWest()) {
        if(rightIsBlocked()) {
          putBeeper();
          turnRight();
          return true;
        }
      }
    return false;
  }

  //Move twice per execution
  private void jump() {
    watchAndMove();
    watchAndMove();
  }

  //Turn to clear orientation before move
  private void watchAndMove() {
    if(frontIsBlocked()) {    
      if(facingEast())
        turnLeft();
      else if(facingWest())
        turnRight();
      else if(facingNorth())
        turnRight();
      if(frontIsClear()) {
        move();
        //Turn back to forward orientation
        if(leftIsBlocked())
          turnRight();
        else if(rightIsBlocked())
          turnLeft();
      }
    } else
      move();
  }
}
