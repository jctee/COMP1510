package q1;

import java.text.NumberFormat;

/**
 * Sets commission of employee
 * @author JC
 * @version 1.0
 */
public class Commission extends Hourly {
    double totalSale;
    double commissionRate;
    NumberFormat fmt = NumberFormat.getPercentInstance();
    //System.out.println(fmt.format(rate));
    public Commission(String name, String address, String phone, String ocSecNumber, double rate, double commissionRate) {
        super(name, address, phone, ocSecNumber, rate);
        this.commissionRate = commissionRate;

    }

    /**
     * sets the total sales for employee
     * @param totalSale of type double
     */
    public void addSales(double totalSale) {
        this.totalSale = totalSale;
        
    }

    /**
     * calculates the pay of employee by getting a percentage of the total sales.
     */
    public double pay() {
        double payment = totalSale * commissionRate;
        payment += super.pay();
        totalSale =0;
        return payment;                
    }

    /**
     * returns employees sales as a string
     */
    public String toString() {
        String result = super.toString();
        result += "\ntotal sale: " + totalSale;
        return result;
    }
}
