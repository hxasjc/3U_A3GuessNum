/*
*Name: Karl
*Date: 2021-11-23
*Desription: Make a guess the number game. The computer generates a random number between 1 and 100 and gives the player up to 5 chances to guess it to win.
*/

import java.util.*;

public class A3GuessNum {

  static Scanner scan;
  static int attempts;

  public static void playGame(int minRange, int maxRange) {
    Random rand = new Random();

    int randNum = rand.nextInt(maxRange - minRange) + minRange;
    System.out.println(randNum);
    int guess = -1;
    int incorrectGuesses = 0;

    while (guess != randNum && incorrectGuesses < attempts) {
      System.out.println("Guess a number between " + minRange + " and " + maxRange);
      String str = scan.nextLine();
      
      if (str.length() > 0) {
        
        if (isNumeric(str)) {
          guess = Integer.parseInt(str);

          if (guess >= minRange && guess <= maxRange) {
            if (guess == randNum) {
              System.out.println("Congrats! You won!");
            } else if (guess < randNum) {
              System.out.println("Higher");
              incorrectGuesses++;
            } else {
              System.out.println("Lower");
              incorrectGuesses++;
            }
          } else {
            System.out.println("Error: Not in the range of " + minRange + " and " + maxRange);
          }
        } else {
          System.out.println("Error: Not a number");
        }
      }
      System.out.println("You have " + incorrectGuesses + " incorrect guesses");
    }

    if (incorrectGuesses == attempts) {
      System.out.println("You lost");
    }
  }

  public static boolean isNumeric(String str) {
    for (char c : str.toCharArray()) {
      if (!Character.isDigit(c)) {
        return false;
      }
    }
    return true;
  }

  // main method
  public static void main(String[] arg) {
    boolean continuePlaying = false;
    scan = new Scanner(System.in);
    attempts = 5;

    while (continuePlaying == true) {
      playGame(1, 100);

      /*System.out.println("Would you like to continue playing? Enter either 'y' or 'n'");
      String str = scan.nextLine();
      char choice = str.toLowerCase().charAt(0);
      //char choice = scan.nextLine().toLowerCase().charAt(0);

      if (choice == 'y') {
        continuePlaying = true;
      } else {
        continuePlaying = false;
      }*/
    }
    //scan.close();
    playGame(100, 1000);
  }// close main
}
