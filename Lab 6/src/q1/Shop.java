package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This is the driver class for Item.java
 * 
 * @author JC
 * @version 1.0
 */
public class Shop {

    /**
     * This is the main method.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Item items;
        String itemName;
        double itemPrice;
        int quantity;
        double total = 0;

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        List<Item> cart = new ArrayList<Item>();

        do {

            System.out.print("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();

            // *** create a new item and add it to the cart

            items = new Item(itemName, itemPrice, quantity);

            cart.add(items);
            total += items.getP() * items.getQ();

            // *** print the contents of the cart object using println

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();

        } while (keepShopping.equals("y"));

        System.out.println(cart);
        System.out.println("total: " + total);

    }
}