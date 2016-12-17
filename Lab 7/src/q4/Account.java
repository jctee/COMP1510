package q4;

import java.util.Random;

/**
 * makes an account for TestAccounts1.java
 * @author JC
 * @version 1.0
 */
public class Account
{

    private double balance;
    private String name;
    private int acctNum;
    private static int numAccounts = 0;
    
    /**
     * Constructor -- initializes balance, owner, and account number
     * @param initBal of type double
     * @param owner of type String
     * @param acctNumber of type int
     */
    public Account(double initBal, String owner, int acctNumber)
    {
        balance = initBal;
        name = owner;
        numAccounts++;
        acctNum = acctNumber;
    }
    
    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     * @param amount of type double
     */
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }

    /**
     * Adds deposit amount to balance.
     * @param amount of type double
     */

    public void deposit(double amount)
    {
        balance += amount;
    }
    /**
     * Returns balance.
     * @return of type double
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * Returns a string containing the name, account number, and balance.
     */
    public String toString()
    {
        return "Name:" + name +
        "\nAccount Number: " + acctNum +
        "\nBalance: " + balance;
    }
    
    /**
     * returns numbers of accounts
     * @return number of accounts of type int
     */
    public static int numAccounts(){
        return numAccounts;
    }
    
    /**
     * Returns the account number
     * @return account number of type int
     */
    public int getActNum(){
        return acctNum;
    }
    
    /**
     * closes the account
     */
    public void close(){
        name ="CLOSED";
        balance = 0;
        numAccounts--;
    }
    
    /**
     * consolidates 2 accounts into 1
     * @param account1 of type account
     * @param account2 of type account
     * @return a new account of type account
     */
    public static Account consolidate(Account account1, Account account2){
        if ((account1.name).equalsIgnoreCase(account2.name) && account1.acctNum != account2.acctNum) {
        Random gen = new Random();

        double newBalance = account1.getBalance() + account2.getBalance();
        int newAcctNum = gen.nextInt(99999999) + 1;
        Account acctNew = new Account (newBalance, account1.name, newAcctNum);
        
        
        return acctNew;
        
        } else {
            
            System.out.println("Sorry cannot be consolidated.");
            return null;
            
        }
    }
    
}
