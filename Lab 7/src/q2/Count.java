package q2;
import java.util.Scanner;

/**
 * Counts the number of A's, E's, S's, T's and spaces in a phrase entered by the user.
 * @author JC
 * @version 1.0
 */
public class Count {

    /**
     * this is the main method
     * @param args
     */
    public static void main(String [] args) {
        
        
        char ch;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a phrase (type quit to quit): ");
        String phrase = scan.nextLine();
        
        while (!phrase.equals("quit")) {
            
            int countA = 0;
            int countE = 0;
            int countS = 0;
            int countT = 0;
            int countBlank = 0;
            
            for (int i=0; i < phrase.length(); i++){
                ch = phrase.charAt(i);
                
                switch (ch)
                {
                case 'a':
                case 'A': countA++;
                          break;
                case 'e':
                case 'E': countE++;
                          break;
                case 's':
                case 'S': countS++;
                          break;
                case 't':
                case 'T': countT++;
                          break;
                case ' ': countBlank++;
                          break;
                }
            }
         
        System.out.println("The number of A's is: " + countA);
        System.out.println("The number of E's is: " + countE);
        System.out.println("The number of S's is: " + countS);
        System.out.println("The number of T's is: " + countT);
        System.out.println("The number of Spaces is: " + countBlank);

        
        System.out.print("Please enter a phrase (type quit to quit): ");
        phrase = scan.nextLine();

        }
        scan.close();
    }
}
