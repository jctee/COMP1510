package q3;

import java.util.Scanner; 
import java.util.Random; 

/**
 * Creates a rock, paper, scissors game against a computer
 * 
 * @author JC
 * @version 1.0
 */
public class Rock {   
    /**
     * This is the main method
     * @param args
     */
    public static void main(String[] args) { 
        String personPlay;    
        //User's play -- "R", "P", or "S" 
        String computerPlay = "R";  
        //Computer's play -- "R", "P", or "S" 
        
        int computerInt;      
        //Randomly generated number used to determine 
        //computer's play 
        
        Scanner scan = new Scanner(System.in); 
        Random generator = new Random(); 

        //Get player's play -- note that this is stored as a string 
        System.out.print("Enter R for rock, P for paper, or S for scissors: ");
        personPlay = scan.nextLine();
        //Make player's play uppercase for ease of comparison 
        personPlay = personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        
        //Translate computer's randomly generated play to string 
        
        /*
        if (computerInt == 0)
            computerPlay = "R";
        else if (computerInt == 1)
            computerPlay = "S";
        else computerPlay = "P";
        */
        
        switch (computerInt) { 
        case 0: computerPlay = "R"; break;  
        case 1: computerPlay = "S"; break;
        case 2: computerPlay = "P"; break;
        } 
        
        //Print computer's play 
        System.out.println("Computer plays: " + computerPlay);
        //See who won.  Use nested ifs instead of &&. 
        
        if (personPlay.equals(computerPlay)) 
            System.out.println("It's a tie!"); 
        else if (personPlay.equals("R")) 
            if (computerPlay.equals("S")) 
                System.out.println("Rock crushes scissors.  You win!!"); 
            else 
                System.out.println("Paper crushes rock. You Lose");
        else if (personPlay.equals("S")) 
            if (computerPlay.equals("R")) 
                System.out.println("Rock crushes scissors.  You Lose!!"); 
            else 
                System.out.println("Scissors crushes paper. You Win");
        else if (personPlay.equals("P")) 
            if (computerPlay.equals("S")) 
                System.out.println("Scissors crushes paper. You Lose!!"); 
            else
                System.out.println("Paper crushes rock. You Win");
    }
}
