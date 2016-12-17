package p1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Deli
{


    public static void main (String[] args)
    {

        final double OUNCES_PER_POUND = 16.0;
        Scanner scan = new Scanner(System.in);
        
        
        double pricePerPound; // price per pound
        double weightOunces; // weight in ounces
        double weight; // weight in pounds
        double totalPrice; //total price for the item
      


        System.out.println ("Welcome to the CS Deli! ! \n ");
        
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt2 = new DecimalFormat("#.##");
        
        
        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        //Convert ounces to pounds and compute the total price
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;

        //Print the label using the formatting objects
        //fmt for the weight in pounds and money for the prices
        
        System.out.println("***** CSDeli ***** \n");
        
        System.out.println("Unit Price: " + fmt1.format(pricePerPound) + " per pound" );
        System.out.println("TOTAL: " + fmt2.format(weight) + "pounds\n"); 
        
        System.out.println("TOTAL: " + fmt1.format(totalPrice) );
    }

}
