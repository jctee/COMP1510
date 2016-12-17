package q4;

import java.text.NumberFormat;

/**
 * <p>
 * Item.java
 * 
 * Represents an item in a shopping cart.
 * </p>
 * 
 * @author JC, Set D
 * @version 1.0
 *
 */
public class Item {

    private String name;
    private double price;
    private int quantity;

    /**
     * <p>
     * Creates an item with given attributes.
     * </p>
     * 
     * @param itemName
     *            Name of item
     * @param itemPrice
     *            Price of item
     * @param numPurchased
     *            Amount purchased
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    /**
     * <p>
     * Returns a string with the information about the item
     * </p>
     * 
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price * quantity));
    }

    /**
     * <p>
     * Returns the unit price of the item.
     * </p>
     * 
     * @return returns price
     */
    public double getPrice() {
        return price;
    }

    /**
     * <p>
     * Returns name of item.
     * </p>
     * 
     * @return returns name
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Returns quantity purchased.
     * </p>
     * 
     * @return returns amount
     */
    public int getQuantity() {
        return quantity;
    }

}
