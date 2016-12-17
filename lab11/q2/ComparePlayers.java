package q2;

//**************************************************************
//ComparePlayers
//
//Reads in two Player objects and tells whether they represent
//the same player.
//**************************************************************
import java.util.Scanner;

public class ComparePlayers {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Scanner scan = new Scanner(System.in);
        // Prompt for and read in information for player 1
        System.out.println("--------------First Player---------------");
        player1.readPlayer();
        
        // Prompt for and read in information for player 2
        
        System.out.println("--------------Second Player---------------");
        player2.readPlayer();
        // Compare player1 to player 2 and print a message saying
        if(player1.equals(player2)) {
            System.out.println("Same player!");
        } else {
            System.out.println("Different Players!");
        }
        // whether they are equal
        
    }
}