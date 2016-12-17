package q4;

import java.text.NumberFormat;

/**
 * <p>
 * ShoppingCart.java
 * 
 * Represents a shopping cart as an array of items.
 * </p>
 * 
 * @author JC, Set D
 * @version 1.0
 *
 */
public class ShoppingCart {

    // total number of items in the cart
    private int itemCount;

    // total price of items in the card
    private double totalPrice;

    // current cart capacity
    private int capacity;

    // Array of items in cart
    private Item[] cart;

    // Array index
    private int index;

    /**
     * <p>
     * Creates an empty shopping cart with a capacity of 5 items
     * </p>
     */
    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    /**
     * <p>
     * Adds an item to the shopping cart.
     * </p>
     * 
     * @param itemName
     *            name of item
     * @param price
     *            price of item
     * @param quantity
     *            amount of item
     */
    public void addToCart(String itemName, double price, int quantity) {
        if (itemCount == capacity) {
            this.increaseSize();
        }

        cart[index] = new Item(itemName, price, quantity);

        totalPrice += price * quantity;
        index++;
        itemCount++;
    }

    /**
     * <p>
     * Returns the contents of the cart together with summary information.
     * </p>
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String contents = "\nShopping Cart\n";
        contents += "\nItem\tPrice\tQty\tTotal\n";

        for (int i = 0; i < itemCount; i++)
            contents += cart[i].toString() + "\n";

        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";

        return contents;
    }

    /**
     * <p>
     * Increases the capacity of the shopping cart by 3.
     * </p>
     * 
     */
    private void increaseSize() {
        capacity += 3;
        Item[] newCart = new Item[capacity];
        for (int i = 0; i < capacity; i++) {
            newCart[i] = cart[i];
        }
    }

    /**
     * <p>
     * Returns total price.
     * </p>
     * 
     * @return returns total
     */
    public double getTotal() {
        return totalPrice;
    }
}