package q3;

import java.util.Scanner;

/**
 * <p>
 * ReversingArray.java
 * 
 * Prompts user for an integer, and enter many values to store in an array and
 * prints the array. Proceeding to reverse array elements so that the first
 * element becomes the last.
 * </p>
 * 
 * @author JC, Set D
 * @version 1.0
 *
 */
public class ReversingArray {

    public static void main(String[] args) {
        int arraySize;
        int arrayValue;
        int reverse;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the amount of elements within an array: ");
        arraySize = scan.nextInt();

        int[] userInput = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Please enter a value for the array slot " + (i + 1) + ": ");
            arrayValue = scan.nextInt();
            userInput[i] = arrayValue;
        }

        System.out.print("\nThe original array is: ");
        for (int j = 0; j < arraySize; j++) {
            System.out.print(userInput[j] + " ");
        }

        for (int i = 0; i < arraySize / 2; i++) {
            reverse = userInput[i];
            userInput[i] = userInput[arraySize - 1 - i];
            userInput[arraySize - 1 - i] = reverse;
        }

        System.out.print("\nThe reversed array is: ");

        for (int k = 0; k < arraySize; k++) {
            System.out.print(userInput[k] + " ");
        }

        scan.close();
    }
}
