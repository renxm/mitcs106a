/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import java.util.ArrayList;

import acm.program.*;

public class FindRange extends ConsoleProgram {
  private static final int SENTINEL = 0;
  public void run() {
    
    int max = SENTINEL, min = SENTINEL;    
    println("This program finds the largest and smallest numbers.");    
    /* Read values from the user until they enter SENTINEL. */
    while (true) {
      int current = readInt("? ");
      if (current == SENTINEL)
        break;
      if(current<min || max == SENTINEL)
        min = current;
      if(current>max || max == SENTINEL)
        max = current;
    }
    if (max == SENTINEL || min == SENTINEL)
      println("There are no numbers before the SENTINEL.");
    else {
      println("smallest: " + min);
      println("largest: " + max);
    }
  }
}
