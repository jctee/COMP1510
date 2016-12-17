package q4;

import java.util.Random;

/**
 * this is the driver class for Account.java
 * @author JC
 *
 */
public class TestAccounts1
{
    /**
     * this is the main method
     * @param args
     */
    public static void main(String[] args)
    {
        Random gen = new Random();
        
        double balance = 100;
        String name1 = "John";
        String name2 = "Bob";
        String name3 = "Bob";
        int acctNum1 = gen.nextInt(999999999) + 1;
        int acctNum2 = gen.nextInt(999999999) + 1;
        int acctNum3 = gen.nextInt(999999999) + 1;
        
        Account acct1 = new Account (balance, name1, acctNum1);
        Account acct2 = new Account (balance, name2 , acctNum2);
        Account acct3 = new Account (balance, name3 , acctNum3);
        
        System.out.println("There are " + Account.numAccounts() + " accounts.");
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
        System.out.println(acct3.toString());
        System.out.println(acct1.getActNum());
        
        acct1.close();
        
        System.out.println(Account.consolidate(acct2, acct3));
        acct2.close();
        acct3.close();
        System.out.println("There are " + Account.numAccounts() + " accounts.");


        
         
         
    }
         
}
