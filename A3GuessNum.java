/*
*Name: Karl
*Date: 2021-11-23
*Desription: Make a guess the number game. The computer generates a random number between 1 and 100 and gives the player up to 5 chances to guess it to win.
*/

import java.util.*;

public A3GuessNum{
  
  
  //main method
  public static void main(String[] arg){
    // Make a scanner and Random Object.
    Scanner input = new Scanner(System.in);
    Random numGenerator = new Random();
    
    // Generate a random number from 0-5.
    int answer = numGenerator.nextInt(6);
    int guess = -1; // default guess num.
    
    System.out.println("Guess a number");
    int guess = input.nextInt();  
    
      
  }// close main
}
