package q1;

import java.util.Scanner;
import java.util.Random;

/**
 * Generates a random number between 1-10, and gets the user to guess the number
 * 
 * @author JC
 * @version 1.0
 */
public class Guess {

    /**
     * this is the main method
     * @param args
     */
    public static void main(String[] args)
    {

        int numToGuess; //Number the user tries to guess 
        int guess; //The user's guess

        Scanner scan = new Scanner(System.in);

        Random generator = new Random();

        //randomly generate the  number to guess
        numToGuess = generator.nextInt(10) + 1;
        System.out.println("Please enter a number from 1-10: ");
        
        do {
            System.out.print("Please enter a guess: ");
            guess = scan.nextInt();
            if (guess == numToGuess){
                System.out.println("You are correct");
            } else if (guess <=  0 || guess > 10) {
                System.out.println("Your guess is not within the guessing range");
            } else if (guess > numToGuess) {
                System.out.println("Try guessing a lower number.");
            } else if (guess < numToGuess) {
                System.out.println("Try guessing a higher number.");
            } 
            
        }
        while (guess != numToGuess);
        //print message saying guess is right
        System.out.println("CONGRATULATIONS!!!");
    }
}