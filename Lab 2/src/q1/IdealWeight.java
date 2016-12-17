package q1;

import java.util.Scanner;
public class IdealWeight {

    public static void main(String[] args) 
    {
    
        int feet, inches, height, iwfemale, iwmale;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of feet of your height: ");
        feet = scan.nextInt();
        System.out.println();
        
        System.out.print("Enter the remainder number of inches of your height: ");
        inches = scan.nextInt();
        System.out.println();
        
        height = feet * 12 + inches;
        iwfemale = 100 + (height - 60) * 5;
        double femalemin = iwfemale * .85;
        double femalemax = iwfemale * 1.15;             
        iwmale = 106 + (height - 60) * 6;
        double malemin = iwmale * .85;
        double malemax = iwmale * 1.15;
        
        System.out.println("The ideal weight for a female " + feet + "\"" + inches + "\'"
                + " is " + iwfemale + " pounds, " + "but it is okay to be between "
                + femalemin + " and " + femalemax + " pounds");
        System.out.println("The ideal weight for a male " + feet + "\"" + inches + "\'"
                + " is " + iwmale + " pounds, " + "but it is okay to be between "
                + malemin + " and " + malemax + " pounds");
        scan.close();
    }

}
