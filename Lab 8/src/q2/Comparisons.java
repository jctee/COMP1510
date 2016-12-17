package q2;
import java.util.Scanner;

public class Comparisons {

    public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter the first string: ");
        String s1 = scan.nextLine();
        
        System.out.print("Please enter the second string: ");
        String s2 = scan.nextLine();
        
        System.out.print("Please enter the third string: ");
        String s3 = scan.nextLine();
        
        System.out.println("The largest string is: " + Compare3.largest(s1,s2,s3));
        
        System.out.print("Please enter the first number: ");
        String n1 = scan.nextLine();
        
        System.out.print("Please enter the second number: ");
        String n2 = scan.nextLine();
        
        System.out.print("Please enter the third number: ");
        String n3 = scan.nextLine();
        
        System.out.println("The largest string is: " + Compare3.largest(n1,n2,n3));
        
    }
}
