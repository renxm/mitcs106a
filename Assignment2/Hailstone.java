/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
  public void run() {
    /* You fill this in */
    int initValue = readInt("Enter a number: ");
    //collatzIterate(initValue);
    collatzRecurse(initValue);
  }

  private int recurseSum = 0;
  private void collatzRecurse(int n) {
    if(n<=1) {
      println("The process took " + recurseSum + " to reach 1");
      return;
    }
    else if(isOdd(n)) {
      print(n + " is odd, so I make 3n + 1: ");
      n = 3*n + 1;
      println(n);
    } else {
      print(n + " is even, so I take half: ");
      n /= 2;
      println(n);
    }
    recurseSum++;
    collatzRecurse(n);
  }

  private void collatzIterate(int n) {
    int loopSum = 0;
    while(n>1){
      if(isOdd(n)) {
        print(n + " is odd, so I make 3n + 1: ");
        n = 3*n + 1;
        println(n);
      } else {
        print(n + " is even, so I take half: ");
        n /= 2;
        println(n);
      }
      loopSum ++;
    }
    println("The process took " + loopSum + " to reach 1");
  }

  private boolean isOdd(int n) {
    if(n%2 == 1)
      return true;
    else
      return false;
  }
}
