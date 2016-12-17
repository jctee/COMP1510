package q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * THis is the driver class for Square.java
 * @author JC
 * @version 1.0
 */
public class SquareTest {
    
    /**
     * This is the main method
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/JC/Documents/workspace/Lab10/src/magicData.txt");
        Scanner scan = new Scanner(file);
        int count = 1; // count which square we're on
        int size = scan.nextInt(); // size of next square
        // Expecting -1 at bottom of input file
        while (size != -1) {
            // create a new Square of the given size
            Square myS = new Square(size);
            // call its read method to read the values of the square
            myS.readSquare(scan);
            System.out.println("\n******** Square " + count + " ********");
            // print the square
            myS.printSquare();
            // print the sums of its rows
            System.out.print("Sums of its rows are: ");
            for(int i=0; i<size;i++) {
                System.out.print("\t" + myS.sumRow(i));
            }
            // print the sums of its columns
            System.out.print("\nSums of its columns are: ");
            for(int i=0; i<size;i++) {
                System.out.print("\t" +myS.sumCol(i));
            }
            // print the sum of the main diagonal
            System.out.println("\nSum of its main diagonal are: " + myS.sumMainDiag());
            
            // print the sum of the other diagonal
            System.out.println("Sum of its other diagonal are: " + myS.sumOtherDiag());
            
            // determine and print whether it is a magic square
            
            if(myS.magic()) {
                System.out.println("Yes, this is a magic square");
            } else {
                System.out.println("No, this is not a magic square");
            }
            // get size of next square
            size = scan.nextInt();
            count++;
        }
    }
}