package q1;
 
import java.text.NumberFormat;

/**
 * Creates item for Shop.java
 * @author JC
 * @version 1.0
 */
public class Item {
    
    private String n;
    private double p;
    private int q;
    
    /**
     * creates an Item of type object
     * @param name initiates the name variable
     * @param price initiates the price variable
     * @param quantity initiates the quantity variable
     */
    public Item (String name, double price, int quantity){
    setN(name);
    setP(price);
    setQ(quantity);
    
    }
    
    /**
     * returns the name
     * @return n of type string
     */
    public String getN() {
        return n;
    }

    /**
     * sets the name of item
     * @param n sets new name
     */
    public void setN(String n) {
        this.n = n;
    }

    /**
     * returns the name
     * @return p of type int
     */
    public double getP() {
        return p;
    }

    /**
     * sets the price of item
     * @param p sets new price
     */
    public void setP(double p) {
        this.p = p;
    }

    /**
     * return the quantity of item
     * @return q of type int
     */
    public int getQ() {
        return q;
    }

    /**
     * sets the quantity of item
     * @param q sets new quantity
     */
    public void setQ(int q) {
        this.q = q;
    }
    
    /**
     * Prints out the item name, price, and quantity.
     */
    public String toString ()
    {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return (n + "\t" + fmt.format(p) + "\t" + q + "\t"
    + fmt.format(p*q));
    }

    
    

}
