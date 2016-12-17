package p1;

import java.util.Scanner; 
public class StringManips 
{ 
    public static void main(String[] args) {
        String phrase = new String("This is a String test.");
        int phraseLength; // number of characters in the phrase String
        int middleIndex; // index of the middle character in the String
        String firstHalf; // first half of the phrase String
        String secondHalf; // second half of the phrase String
        String switchedPhrase; // a new phrase with original halves switched
        String middle3;

        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2); // +2
                                                                      // because
                                                                      // right
                                                                      // parameter
                                                                      // is
                                                                      // exclusive

        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = phrase.replaceAll(" ","*");

        // print information about the phrase
        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("Length of the phrase: " + phraseLength + " characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println("Switched phrase: " + switchedPhrase);
        System.out.println("The 3 middle characters are: " + middle3);

        String city, state;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your city: ");
        city = scan.nextLine();

        System.out.print("Enter your state: ");
        state = scan.nextLine();

        String newCity = city.toLowerCase();
        String newState = state.toUpperCase();

        System.out.println(newState + newCity + newState);

    } 
}
