/*
*Name: Karl
*Date: 2021-11-23
*Desription: Make a guess the number game. The computer generates a random number between 1 and 100 and gives the player up to 5 chances to guess it to win.
*/

import java.util.*;

public A3GuessNum{
  
  
  public static void playGame(int minRange, int maxRange) {
    Scanner scan = new Scanner (System.in);
    Random rand = new Random();

    int randNum = rand.nextInt(maxRange - minRange) + minRange;
    System.out.println(randNum);
    int guess = -1;

    while (guess != randNum) {
      System.out.println("Guess a number between " + minRange + " and " + maxRange);
      String str = scan.nextLine();
      if (Integer.parseInt(str) != null) {
        guess = Integer.parseInt(str);

        if (guess > minRange && guess < maxRange) {
          System.out.println("is a number");
        } else {
          System.out.println("Not in the range of " + minRange + " and " + maxRange);
        }
      } else {
        System.out.println("Not a number")
      }
    }
  }
  
  //main method
  public static void main(String[] arg){
    playGame(1, 100);
  }// close main
}
