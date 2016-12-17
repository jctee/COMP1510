package p1;

import java.util.Scanner;

public class IntWrapper {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.print("Enter a number: ");
        num = scan.nextInt();
        
        System.out.println("The number in binary is: " + Integer.toBinaryString(num));
        System.out.println("The number in octal is: " + Integer.toOctalString(num));
        System.out.println("The number in hexadecimal is: " + Integer.toHexString(num));
        
        System.out.println("The minimum value is: " + Integer.MIN_VALUE);
        System.out.println("The minimum value is: " + Integer.MAX_VALUE);
        
        System.out.print("Enter 2 numbers: ");
        String num1 = scan.next();
        String num2 = scan.next();
        
        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
        
    }

}
