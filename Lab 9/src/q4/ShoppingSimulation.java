package q4;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * <p>
 * ShoppingSimulation.java
 * 
 * Simulates a shopping experience for the user.
 * </p>
 * 
 * @author JC, Set D
 * @version 1.0
 *
 */
public class ShoppingSimulation {

    /**
     * <p>
     * Main method.
     * </p>
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        String name;
        double price;
        int quantity;
        double totalPrice;
        String again;

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, Welcome to John's Store");
        ShoppingCart cart = new ShoppingCart();

        do {
            System.out.print("Please enter an item name: ");
            name = scan.nextLine();
            System.out.print("Please enter the item price: ");
            price = scan.nextInt();
            System.out.print("Please enter the item quantity: ");
            quantity = scan.nextInt();

            cart.addToCart(name, price, quantity);

            System.out.println(cart);

            scan.nextLine();
            System.out.print("Would you like to continue shopping? (Y/N): ");
            again = scan.nextLine();
        } while (again.equalsIgnoreCase("y"));

        totalPrice = cart.getTotal();
        System.out.println("Thank you for shopping with John's Store");
        System.out.println("Your total is: " + fmt.format(totalPrice));
        
        scan.close();
    }

}
